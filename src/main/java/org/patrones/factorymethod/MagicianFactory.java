package org.patrones.factorymethod;

public class MagicianFactory extends EnemyFactory{

    @Override
    public Enemy createEnemy() {
        return new Magician();
    }
}
