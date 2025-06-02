package org.patrones.factorymethod;

public class ArcherFactory extends EnemyFactory {

    @Override
    public Enemy createEnemy() {
        return new Archer();
    }
}
