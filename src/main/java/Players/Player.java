package Players;

public abstract class Player {
    private String name;
    private int hp;
    private PlayerClass playerClass;
    private boolean hasFamiliar;

    public Player(String name, int hp, PlayerClass playerClass) {
        this.name = name;
        this.hp = hp;
        this.playerClass = playerClass;
        this.hasFamiliar = playerClass.getFamiliar();
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int amount){
        this.hp += amount;
    }

    public String getName() {
        return name;
    }

    public PlayerClass getPlayerClass() {
        return playerClass;
    }
}
