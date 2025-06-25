package org.patrones.abstracfactory.factory;

import org.patrones.abstracfactory.armor.Armor;
import org.patrones.abstracfactory.enemy.Enemy;
import org.patrones.abstracfactory.weapon.Weapon;

public abstract class EnemyAbstractFactory {

    // me queda pendiente porque este metodo abstracto no esta
    // llamado de abstrac si no del method
    public abstract Enemy createEnemy();
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();
}
