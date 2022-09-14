package Players;
import Enemy.Enemy;
import Equipment.Defender;
import Equipment.Spell;

public abstract class Mage extends Player{
    protected Spell spell;
    protected Defender defender;

    public Mage(String name, int hp, Spell spell, Defender defender) {
        super(name, hp);
        this.spell = spell;
        this.defender = defender;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public Defender getDefender() {
        return defender;
    }

    public void setDefender(Defender defender) {
        this.defender = defender;
    }
    public void castSpell(Enemy enemy){
        enemy.setHp(spell.getPowerValue());
    }
    public void defend(Enemy enemy){
        enemy.setHp(defender.getPowerLevel());
    }
}
