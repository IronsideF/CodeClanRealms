package Equipment;

public enum Spell {
    FIREBALL(5),
    LIGHTNINGSTRIKE(7);

    private int powerValue;

    Spell(int powerValue) {
        this.powerValue = powerValue;
    }

    public int getPowerValue() {
        return powerValue;
    }
}
