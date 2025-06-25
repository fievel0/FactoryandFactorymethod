package org.patrones.abstracfactory.factory;

import org.patrones.abstracfactory.armor.Armor;
import org.patrones.abstracfactory.armor.Bow;
import org.patrones.abstracfactory.enemy.Enemy;
import org.patrones.abstracfactory.weapon.Arrow;
import org.patrones.abstracfactory.weapon.Weapon;

public class ArcherFactory extends EnemyAbstractFactory {

    @Override
    public Enemy createEnemy() {
        return new org.patrones.abstracfactory.enemy.Archer();
    }

    @Override
    public Armor createArmor() {
        return new Bow();
    }

    @Override
    public Weapon createWeapon() {
        return new Arrow();
    }
}
