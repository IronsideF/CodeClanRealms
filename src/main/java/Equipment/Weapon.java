package Equipment;

public enum Weapon {
    SWORD(5),
    AXE(6),
    CLUB(3);
    private int damageValue;
    Weapon(int damageValue) {
        this.damageValue = damageValue;
    }
    public int getDamageValue() {
        return damageValue;
    }
}
