package Equipment;

public enum Spell {
    FIREBALL(20),
    LIGHTNINGSTRIKE(30);

    private int powerValue;

    Spell(int powerValue) {
        this.powerValue = powerValue;
    }

    public int getPowerValue() {
        return powerValue;
    }
}
