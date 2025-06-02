package org.patrones.factory;

public class TestFactory {
    public static void main(String[] args) throws IllegalAccessException {
        EnemyFactory enemyFactory = new EnemyFactory();
        Enemy warrior = enemyFactory.createEnemy("warrior");
        warrior.attack();

        Enemy magician = enemyFactory.createEnemy("magician");
        magician.attack();

        Enemy archer = enemyFactory.createEnemy("archer");
        archer.attack(); 

    }
}
