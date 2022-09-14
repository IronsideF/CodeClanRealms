package Players;

import java.util.ArrayList;

public enum EquipType {
    WEAPON( new ArrayList<Equipment>() {{
            add(Equipment.SWORD);
            add(Equipment.AXE);
            add(Equipment.CLUB);
            }}),
    SPELL( new ArrayList<Equipment>(){{
        add(Equipment.FIREBALL);
        add(Equipment.LIGHTNINGSTRIKE);
    }}),
    HEALING(new ArrayList<Equipment>(){{
        add(Equipment.POTION);
        add(Equipment.HERBS);
    }});

    private ArrayList<Equipment> choices;

    EquipType(ArrayList<Equipment> choices) {
        this.choices = choices;
    }

    public ArrayList<Equipment> getChoices() {
        return choices;
    }
}
