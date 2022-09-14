package Equipment;

public enum Defender {
    DRAGON(10),
    OGRE(5);
    private int powerLevel;

    Defender(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public int getPowerLevel() {
        return powerLevel;
    }
}

