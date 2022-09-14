package Enemy;

public class Goblet implements ITreasure{
    private int treasureValue;
    private String name;
    public Goblet() {
        this.treasureValue = 10;
        this.name = "Goblet";
    }
    public int getValue(){
        return this.treasureValue;
    }

    public String getName() {
        return name;
    }
}
