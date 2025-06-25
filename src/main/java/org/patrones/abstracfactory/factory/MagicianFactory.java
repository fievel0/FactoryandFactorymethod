package org.patrones.abstracfactory.factory;

import org.patrones.abstracfactory.armor.Armor;
import org.patrones.abstracfactory.armor.Robe;
import org.patrones.abstracfactory.enemy.Enemy;
import org.patrones.abstracfactory.enemy.Magician;
import org.patrones.abstracfactory.weapon.Weapon;
import org.patrones.abstracfactory.weapon.WizardStaff;

public class MagicianFactory extends EnemyAbstractFactory{


    @Override
    public Enemy createEnemy() {
        return new Magician();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }

    @Override
    public Weapon createWeapon() {
        return new WizardStaff();
    }
}
