package org.patrones.builder;

public class TestBuilder {
    public static void main(String[] args) {
        Enemy enemy = Enemy.builder()
                .name("pepe")
                .type("magician")
                .health(1000)
                .damage(1000)
                .endurance(100)
                .build();

        System.out.println(enemy.toString());
    }
}
