import Enemy.Enemy;
import Equipment.Defender;
import Equipment.Heal;
import Equipment.Spell;
import Equipment.Weapon;
import Players.Barbarian;
import Players.Cleric;
import Players.Knight;
import Players.Wizard;
import Rooms.EnemyRoom;
import Rooms.TreasureRoom;

public class Runner {
    public static void main(String[] args) {
        Quest starterAdventure = new Quest("Quest for a junior dev position", 3);
        Party codeClanWarriors = new Party();
        Barbarian myBarbarian = new Barbarian("Keith", 52, Weapon.AXE);
        Knight myKnight = new Knight("Mar", 39, Weapon.SWORD);
        Wizard myWizard = new Wizard("James", 33, Spell.FIREBALL, Defender.OGRE);
        Cleric myCleric = new Cleric("Colette", 37, Heal.POTION);
        codeClanWarriors.setQuest(starterAdventure);
        codeClanWarriors.addPlayer(myBarbarian);
        codeClanWarriors.addPlayer(myCleric);
        codeClanWarriors.addPlayer(myKnight);
        codeClanWarriors.addPlayer(myWizard);
        System.out.printf("Welcome Adventurers, I see the intrepid %s, %s, %s and %s before me. You have taken up the %s. Good luck and may destiny favour you!%n", myBarbarian.getName(), myCleric.getName(), myKnight.getName(), myWizard.getName(), codeClanWarriors.getQuest().getName());
        System.out.println("You enter the dungeon!");
        for (int i = starterAdventure.getRooms().size();i>0;i--){
            if (starterAdventure.getRooms().get(0) instanceof TreasureRoom){
                System.out.printf("You have found a %s%n", ((TreasureRoom) starterAdventure.getRooms().get(0)).getTreasure().getName());
                codeClanWarriors.collectTreasure(((TreasureRoom) starterAdventure.getRooms().get(0)).getTreasure());
                if(codeClanWarriors.getPlayers().contains(myCleric)){
                    codeClanWarriors.partyHeal(myCleric);
                }
            }
            else if (starterAdventure.getRooms().get(0) instanceof EnemyRoom){
                System.out.printf("You face a fearsome %s%n", ((EnemyRoom) starterAdventure.getRooms().get(0)).getEnemy().getName());
                Enemy enemy = ((EnemyRoom) starterAdventure.getRooms().get(0)).getEnemy();
                while (enemy.getHp()>0){
                    if (codeClanWarriors.getLowestHp()<11&&codeClanWarriors.getPlayers().contains(myCleric)){
                        codeClanWarriors.partyHeal(myCleric);
                    }
                    if (codeClanWarriors.partyAttack(enemy)){
                        i=0;
                        break;
                    }
                }
            }
        }
        if (codeClanWarriors.getQuest()!=null){
        System.out.printf("Well Done Adventurers! You have conquered the %s and collected %s coins worth of treasure", starterAdventure.getName(), codeClanWarriors.getTreasureValue());}
    }
}
