package Equipment;

public enum Heal {
    POTION(7),
    HERBS(3);
    private int healValue;

    Heal(int healValue) {
        this.healValue = healValue;
    }

    public int getHealValue() {
        return healValue;
    }
}
