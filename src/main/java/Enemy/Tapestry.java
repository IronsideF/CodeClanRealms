package Enemy;

public class Tapestry implements ITreasure {
    private int treasureValue;
    private String name;
    public Tapestry() {
        this.treasureValue = 20;
        this.name = "Tapestry";
    }
    public int getValue(){
        return this.treasureValue;
    }

    public String getName() {
        return name;
    }
}
