package org.patrones.abstracfactory;

import org.patrones.abstracfactory.armor.Armor;
import org.patrones.abstracfactory.enemy.Enemy;
import org.patrones.abstracfactory.factory.ArcherFactory;
import org.patrones.abstracfactory.factory.EnemyAbstractFactory;
import org.patrones.abstracfactory.factory.MagicianFactory;
import org.patrones.abstracfactory.factory.WarriorFactory;
import org.patrones.abstracfactory.weapon.Weapon;

public class TestAbstractFactory {
    public static void main(String[] args) {
        EnemyAbstractFactory factory = new WarriorFactory();
        Enemy warrior = factory.createEnemy();
        Armor heavyArmor = factory.createArmor();
        Weapon axe = factory.createWeapon();
        warrior.attack();
        heavyArmor.protect();
        axe.damage();

        factory = new MagicianFactory();
        Enemy magician = factory.createEnemy();
        Armor robe = factory.createArmor();
        Weapon wizarstaff = factory.createWeapon();
        magician.attack();
        robe.protect();
        wizarstaff.damage();

        factory = new ArcherFactory();
        Enemy archer = factory.createEnemy();
        Armor bow = factory.createArmor();
        Weapon arrow = factory.createWeapon();
        archer.attack();
        bow.protect();
        arrow.damage();


    }
}
