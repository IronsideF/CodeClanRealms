package Enemy;

public abstract class Enemy {
    private String name;
    private int hp;
    private int damageDealt;

    public Enemy(String name, int hp, int damageDealt) {
        this.name = name;
        this.hp = hp;
        this.damageDealt = damageDealt;
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int amount){
        this.hp -= amount;
    }

    public String getName() {
        return name;
    }

    public int getDamageDealt() {
        return damageDealt;
    }
}
