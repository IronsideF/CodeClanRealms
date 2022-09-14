package Rooms;

import Enemy.Chest;
import Enemy.Goblet;
import Enemy.ITreasure;
import Enemy.Tapestry;

import java.util.ArrayList;
import java.util.Random;

public class TreasureRoom extends Room{
    private ITreasure treasure;

    public TreasureRoom() {
        Random rand = new Random();
        ArrayList<ITreasure> possibleTreasure = new ArrayList<ITreasure>(){{
            add(new Goblet());
            add(new Chest());
            add(new Tapestry());
        }};

        this.treasure = possibleTreasure.get(rand.nextInt(possibleTreasure.size()));
    }

    public ITreasure getTreasure() {
        return treasure;
    }
}
