/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentual;

/**
 *
 * @author crova
 */
abstract class pokemon {

    protected String name;
    protected int level;
    protected int health;

    public pokemon(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    public abstract void attack();

    public abstract void defend();

    public abstract void ultimate();

    public void displayInfo() {
        System.out.println("Pokémon: " + name + " | Level: " + level + " | Health: " + health);
    }
}
