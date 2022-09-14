package Players;

import Enemy.Enemy;
import Equipment.Weapon;

public abstract class Fighter extends Player {

    protected Weapon weapon;

    public Fighter(String name, int hp, Weapon weapon) {
        super(name, hp);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;
    }
    public void attack(Enemy enemy){
        enemy.setHp(weapon.getDamageValue());
        System.out.printf("%s lands a wicked blow with their %s, dealing %s damage%n", name, weapon, weapon.getDamageValue());
    }
}
