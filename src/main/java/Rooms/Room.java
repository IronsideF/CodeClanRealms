package Rooms;

import java.util.ArrayList;
import java.util.Random;

public abstract class Room {

    private ArrayList<Exit> exits;

    public Room() {
        Random rand = new Random();
        int numberOfExits = rand.nextInt(4)+1;
        ArrayList<Exit> buildExits = new ArrayList<>();
        ArrayList<Exit> possibleExits = new ArrayList<Exit>(){{
            add(Exit.NORTH);
            add(Exit.SOUTH);
            add(Exit.EAST);
            add(Exit.WEST);
        }};
        while (numberOfExits>0){
            buildExits.add(possibleExits.remove(rand.nextInt(possibleExits.size())));
            numberOfExits -=1;
        }
        this.exits = buildExits;
    }
    public ArrayList<Exit> getExits(){
        return this.exits;
    }
}
