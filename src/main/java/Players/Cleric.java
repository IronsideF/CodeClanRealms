package Players;

import Equipment.Heal;

import java.util.ArrayList;

public class Cleric extends Player{
    private Heal healType;

    public Cleric(String name, int hp, Heal healType) {
        super(name, hp);
        this.healType = healType;
    }

    public Heal getHealType() {
        return healType;
    }

    public void setHealType(Heal healType) {
        this.healType = healType;
    }
    public void healPlayer(Player player){
        player.healDamage(healType.getHealValue());
    }
    public void healAll(ArrayList<Player> players){
        for (Player player: players){
            healPlayer(player);
        }
        System.out.printf("%s has healed the party for %s%n", getName(), healType.getHealValue());
    }
}
