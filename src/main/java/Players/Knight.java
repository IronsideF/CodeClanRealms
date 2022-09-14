package Players;
import Equipment.Weapon;
public class Knight extends Fighter{
    public Knight(String name, int hp, Weapon weapon) {
        super(name, hp, weapon);
    }

    @Override
    public void takeDamage(int amount) {
        this.hp -=(amount-3);
        System.out.printf("%s has taken %s damage from a terrible blow, their armour absorbing 3 of it.%n", this.getName(), amount-3);
    }
}
