package org.patrones.abstracfactory.factory;

import org.patrones.abstracfactory.armor.Armor;
import org.patrones.abstracfactory.armor.HeavyArmor;
import org.patrones.abstracfactory.enemy.Enemy;
import org.patrones.abstracfactory.enemy.Warrior;
import org.patrones.abstracfactory.weapon.Axe;
import org.patrones.abstracfactory.weapon.Weapon;

public class WarriorFactory extends EnemyAbstractFactory {


    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }

    @Override
    public Armor createArmor() {
        return new HeavyArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new Axe();
    }
}
