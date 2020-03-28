package pl.radomiej;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import pl.radomiej.MapReader.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.stream.Stream;

public class CommandApp {

    private static String outputFolder;
    private static ObjectMapper objectMapper;

    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("Bad arguments");
            return;
        }

        objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        SimpleModule module = new SimpleModule();
        module.addSerializer(BitSet.class, new BitSetSerializer());
        objectMapper.registerModule(module);

        String inputFolder = args[0];
        outputFolder = args[1];

        try (Stream<Path> paths = Files.walk(Paths.get(inputFolder))) {
            paths
                    .filter(Files::isRegularFile)
                    .filter(CommandApp::isHommMapFile)
                    .forEach(CommandApp::writeToJsonSafe);
        }
    }

    //    @SneakyThrows
    private static void writeToJsonSafe(Path path) {
        try {
            writeToJson(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToJson(Path path) throws IOException {
        System.out.println(path.getFileName().toString());
        String outputName = outputFolder + "/" + path.getFileName() + ".json";
        InputStream is = new FileInputStream(path.toFile());
        MapReader mapReader = new MapReader(is);
        Map map = mapReader.read();
        objectMapper.writeValue(new File(outputName), map);
    }

    private static boolean isHommMapFile(Path path) {
        return path.toString().endsWith(".h3m");
    }


    public static class BitSetSerializer extends JsonSerializer<BitSet>
    {
        @Override
        public void serialize(BitSet value, JsonGenerator gen, SerializerProvider serializers)
                throws IOException, JsonProcessingException
        {
            gen.writeStartArray();
            for (long l : value.toLongArray())
            {
                gen.writeNumber(l);
            }
//            for(int i = 0; i < value.size(); i++){
//                gen.writeNumber(value.get(i) ? 1 : 0);
//            }
            gen.writeEndArray();
        }

        @Override
        public Class<BitSet> handledType()
        {
            return BitSet.class;
        }
    }
}
