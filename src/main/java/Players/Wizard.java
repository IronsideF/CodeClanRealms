package Players;

import Enemy.Enemy;
import Equipment.Defender;
import Equipment.Spell;

import java.util.Random;

public class Wizard extends Mage{
    public Wizard(String name, int hp, Spell spell, Defender defender) {
        super(name, hp, spell, defender);
    }

    @Override
    public void castSpell(Enemy enemy) {
        Random rand = new Random();
        int accuracyCheck = rand.nextInt(3);
        if (accuracyCheck>1) {
            castSpell(enemy);
            System.out.printf("%s casts an impressive %s, dealing %s damage%n", this.getName(), this.getSpell(), this.getSpell().getPowerValue());
        } else {
            System.out.printf("%s shoots wide, their spell impacting the wall.%n", this.getName());
        }
    }
}
