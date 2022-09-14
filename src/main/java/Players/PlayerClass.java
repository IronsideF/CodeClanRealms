package Players;

public abstract class PlayerClass {
    private EquipType equipType;

    public PlayerClass(EquipType equipType) {
        this.equipType = equipType;
    }
    abstract void changeEquipment();

    public EquipType getEquipType() {
        return equipType;
    }
}
//public enum PlayerClass {
//    DWARF(EquipType.WEAPON, false),
//    BARBARIAN(EquipType.WEAPON, false),
//    KNIGHT(EquipType.WEAPON, false),
//    WARLOCK(EquipType.SPELL, true),
//    WIZARD(EquipType.SPELL, true),
//    CLERIC(EquipType.HEALING, false);
//
//    private EquipType equipType;
//    private boolean familiar;
//
//    PlayerClass(EquipType equipType, Boolean familiar) {
//        this.equipType = equipType;
//        this.familiar = familiar;
//    }
//
//    public EquipType getEquipType() {
//        return equipType;
//    }
//
//    public boolean getFamiliar() {
//        return familiar;
//    }
//}
