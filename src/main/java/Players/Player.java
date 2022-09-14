package Players;

public abstract class Player {
    protected String name;
    protected int hp;

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public int getHp() {
        return hp;
    }
    public void takeDamage(int amount){
        this.hp -= amount;
        System.out.printf("%s has taken %s damage from a terrible blow%n", name, amount);
    }
    public void healDamage(int amount){
        this.hp += amount;
    }

    public String getName() {
        return name;
    }
}
