import Rooms.EnemyRoom;
import Rooms.Room;
import Rooms.TreasureRoom;

import java.util.ArrayList;
import java.util.Random;

public class Quest {
    private String name;
    private ArrayList<Room> rooms;

    public Quest(String name, int length) {
        Random rand = new Random();
        this.name = name;
        ArrayList<Room> buildRooms = new ArrayList<Room>();
        while (length>0){
            int coinFlip = rand.nextInt(2);
            if (coinFlip==0){
                buildRooms.add(new TreasureRoom());
            } else {
                buildRooms.add(new EnemyRoom());
            }
            length--;
        }
        this.rooms = buildRooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void moveToNextRoom(){
        rooms.remove(0);
        if (rooms.size()>0) {
            System.out.printf("The party advances! %s rooms remain!%n", rooms.size());
        }
    }
}
