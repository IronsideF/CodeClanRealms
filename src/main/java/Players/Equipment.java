package Players;

public enum Equipment {
    SWORD(4, 1),
    AXE(6, 1),
    CLUB(3, 1),
    FIREBALL(5, 4),
    LIGHTNINGSTRIKE(6, 3),
    POTION(3, 2),
    HERBS(5, 1);

    private int powerLevel;
    private int range;

    Equipment(int powerLevel, int range) {
        this.powerLevel = powerLevel;
        this.range = range;
    }
}
