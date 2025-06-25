package org.patrones.abstracfactory.armor;

public class Bow implements Armor{

    @Override
    public void protect() {
        System.out.println("archer's bow protect");
    }
}
