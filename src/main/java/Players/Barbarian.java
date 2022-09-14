package Players;
import Enemy.Enemy;
import Equipment.Weapon;

public class Barbarian extends Fighter{
    public Barbarian(String name, int hp, Weapon weapon) {
        super(name, hp, weapon);
    }
    public void attack(Enemy enemy){
        if (this.hp<=20){
            enemy.setHp((getWeapon().getDamageValue())*2);
            System.out.printf("A raging %s lands a ferocious blow with their %s, dealing %s damage%n", name, weapon, weapon.getDamageValue()*2);
        } else {
            enemy.setHp(getWeapon().getDamageValue());
            System.out.printf("%s lands a wicked blow with their %s, dealing %s damage%n", name, weapon, weapon.getDamageValue());
        }
    }
}
