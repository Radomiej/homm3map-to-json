package pl.radomiej;

import pl.radomiej.MapReader.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
}
