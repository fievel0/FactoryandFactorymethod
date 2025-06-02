package org.patrones.factorymethod;

public class TestFactoryMethod {
    public static void main(String[] args) {

        Enemy warrior = new WarriorFactory().createEnemy();
        Enemy magician = new MagicianFactory().createEnemy();
        Enemy archer = new ArcherFactory().createEnemy();
        warrior.attack();
        magician.attack();
        archer.attack();
    }
}
