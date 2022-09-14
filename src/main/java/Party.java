import Enemy.Enemy;
import Enemy.ITreasure;
import Players.Cleric;
import Players.Fighter;
import Players.Mage;
import Players.Player;

import java.util.ArrayList;

public class Party {
    private ArrayList<Player> players;
    private int treasureValue;
    private Quest quest;

    public Party() {
        this.players = new ArrayList<>();
        this.treasureValue = 0;
        this.quest = null;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public int getTreasureValue() {
        return treasureValue;
    }

    public void setTreasureValue(int treasureValue) {
        this.treasureValue = treasureValue;
    }

    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public void addPlayer(Player player){
        players.add(player);
    }
    public void collectTreasure(ITreasure treasure){
        this.treasureValue += treasure.getValue();
        System.out.printf("A heavy %s gold coins fills your pockets%n", treasureValue);
        quest.moveToNextRoom();
    }
    public boolean partyAttack(Enemy enemy){
        ArrayList<Player> deadPlayers = new ArrayList<>();
        for (Player player:players){
            player.takeDamage(enemy.getDamageDealt());
            if (player.getHp()<=0){
                deadPlayers.add(player);
            }
            else if (player instanceof Fighter){
                ((Fighter) player).attack(enemy);
            } else if (player instanceof Mage) {
                ((Mage) player).castSpell(enemy);
            }
            if (enemy.getHp()<=0){
                System.out.printf("%s has been slain! Advance adventurers!%n", enemy.getName());
                quest.moveToNextRoom();
                break;
            }
        }
        for (Player player:deadPlayers){
            players.remove(player);
            System.out.printf("%s has perished!%n", player.getName());
        }
        if (players.size()==0){
            return failQuest();
        } else {return false;}



    }

    public boolean failQuest(){
        System.out.printf("You have failed in the %s, try again?%n", quest.getName());
        setQuest(null);
        return true;
    }
    public int getLowestHp(){
        int result = players.get(0).getHp();
        for (Player player:players){
            if (player.getHp()<result){
                result = player.getHp();
            }
        }
        return result;
    }
    public void partyHeal(Cleric cleric){
        cleric.healAll(players);
    }
}
