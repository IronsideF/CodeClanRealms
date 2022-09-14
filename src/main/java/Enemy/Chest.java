package Enemy;

public class Chest implements ITreasure {
    private int treasureValue;
    private String name;
    public Chest() {
        this.treasureValue = 50;
        this.name = "Chest";
    }
    public int getValue(){
        return this.treasureValue;
    }

    public String getName() {
        return name;
    }
}
