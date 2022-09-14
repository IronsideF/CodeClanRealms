import Enemy.Enemy;
import Equipment.Defender;
import Equipment.Heal;
import Equipment.Spell;
import Equipment.Weapon;
import Players.Barbarian;
import Players.Cleric;
import Players.Knight;
import Players.Wizard;
import Rooms.TreasureRoom;
import org.junit.Before;
import org.junit.Test;
import Enemy.Orc;
import Enemy.Troll;
import Enemy.ITreasure;

import static org.junit.Assert.*;

public class QuestTest {
    Quest myQuest;
    Party myParty;
    Knight myKnight;
    Barbarian myBarbarian;
    Wizard myWizard;
    Cleric myCleric;

    @Before
    public void before(){
        myBarbarian = new Barbarian("Keith", 50, Weapon.AXE);
        myKnight = new Knight("Mar", 40, Weapon.SWORD);
        myWizard = new Wizard("James", 30, Spell.FIREBALL, Defender.OGRE);
        myCleric = new Cleric("Colette", 35, Heal.POTION);
        myQuest = new Quest("Mountain of the Abstract Rubber Duck", 7);
        myParty = new Party();
        myParty.setQuest(myQuest);
        myParty.addPlayer(myBarbarian);
        myParty.addPlayer(myCleric);
        myParty.addPlayer(myKnight);
        myParty.addPlayer(myWizard);
    }
    @Test
    public void hasProperties(){
        assertEquals("Keith", myBarbarian.getName());
        assertEquals(50, myBarbarian.getHp());
        assertEquals(Weapon.AXE, myBarbarian.getWeapon());
        assertEquals(6, myBarbarian.getWeapon().getDamageValue());
        assertEquals("Mountain of the Abstract Rubber Duck", myQuest.getName());
        assertEquals(7, myQuest.getRooms().size());
        assertEquals(4, myParty.getPlayers().size());
        assertTrue(myParty.getPlayers().contains(myBarbarian));
        assertEquals(myQuest, myParty.getQuest());
    }
    @Test
    public void partyCanFightMonster(){
        Orc myEnemy = new Orc();
        myParty.partyAttack(myEnemy);
        assertEquals(24, myEnemy.getHp());
        assertEquals(45, myBarbarian.getHp());
    }
    @Test
    public void partyCanHeal(){
        myParty.partyHeal(myCleric);
        assertEquals(55, myBarbarian.getHp());
    }
    @Test
    public void questCanAdvanceRooms(){
        myQuest.moveToNextRoom();
        assertEquals(6, myQuest.getRooms().size());
    }
    @Test
    public void partyCanCollectTreasure(){
        TreasureRoom myRoom = new TreasureRoom();
        ITreasure myTreasure = myRoom.getTreasure();
        myParty.collectTreasure(myTreasure);
        assertEquals(myTreasure.getValue(), myParty.getTreasureValue());
        assertEquals(6, myQuest.getRooms().size());
    }
    @Test
    public void killingEnemyAdvancesRoom(){
        Enemy myEnemy = new Orc();
        myParty.partyAttack(myEnemy);
        myParty.partyAttack(myEnemy);
        myParty.partyAttack(myEnemy);
        assertEquals(6, myQuest.getRooms().size());
    }
    @Test
    public void playersCanDie(){
        Enemy myEnemy = new Troll();
        myParty.partyAttack(myEnemy);
        myParty.partyAttack(myEnemy);
        myParty.partyAttack(myEnemy);
        assertEquals(3, myParty.getPlayers().size());
    }
}
