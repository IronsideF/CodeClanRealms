package Rooms;

import Enemy.Enemy;
import Enemy.Orc;
import Enemy.Troll;

import java.util.ArrayList;
import java.util.Random;

public class EnemyRoom extends Room{
    private Enemy enemy;

    public EnemyRoom() {
        Random rand = new Random();
        ArrayList<Enemy> possibleEnemies = new ArrayList<Enemy>(){{
            add(new Orc());
            add(new Troll());
        }};
        this.enemy = possibleEnemies.get(rand.nextInt(possibleEnemies.size()));
    }

    public Enemy getEnemy() {
        return enemy;
    }
}
