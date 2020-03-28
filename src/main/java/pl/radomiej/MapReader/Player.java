package pl.radomiej.MapReader;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public PlayerColor playerColor;
    public List<Town> allowedTowns = new ArrayList<Town>();
    public Boolean isRandomTown;
    public Boolean hasMainTown;
    public Boolean isTownsSet;
    public Boolean generateHeroAtMainTown;
    public Boolean generateHero;
    public Boolean hasRandomHero;
    public Boolean mainCustomHeroId;
    public Town mainTownType;
    public int mainTownX;
    public int mainTownY;
    public int mainTownZ;

    public enum Town {
        Castle(0),
        Rampart(1),
        Tower(2),
        Inferno(3),
        Necropolis(4),
        Dungeon(5),
        Stronghold(6),
        Fortress(7),
        Conflux(8),
        Random(255);

        private int value;

        private Town(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum PlayerColor {
        Red(0), Blue(1), Tan(2), Green(3), Orange(4), Purple(5), Teal(6), Pink(7);

        private int value;

        private PlayerColor(int value) {
            this.value = value;
        }

    }
}
