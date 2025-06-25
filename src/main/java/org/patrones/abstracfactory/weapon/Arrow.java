package org.patrones.abstracfactory.weapon;

public class Arrow implements Weapon {

    @Override
    public void damage() {
        System.out.println("arrow damage!!!");
    }
}
