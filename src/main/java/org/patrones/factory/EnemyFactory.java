package org.patrones.factory;

public class EnemyFactory {

    public Enemy createEnemy(String type) throws IllegalAccessException {

        if(type.equalsIgnoreCase("warrior"))
            return new Warrior();
        else if (type.equalsIgnoreCase("magician"))
            return new Magician();
        else if (type.equalsIgnoreCase("archer"))
            return new Archer();
        else
            throw new IllegalAccessException(
                    "TIpo de enemigo no valido: "
                            + type); //para evitar errores directamente
            //return null; caso tipico
    }

}
