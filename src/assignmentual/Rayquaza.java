/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentual;

/**
 *
 * @author crova
 */
// Pidgeot - Flying Pokémon
public class Rayquaza extends pokemon implements flyingInterface {
    public Rayquaza(String name, int level, int health) {
        super(name, level, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " uses Dragon Breath!");
    }

    @Override
    public void defend() {
        System.out.println(name + " dodges swiftly!");
    }

    @Override
    public void ultimate() {
        System.out.println(name + " unleashes Hurricane!");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies across the battlefield!");
    }

    @Override
    public void aerial() {
        System.out.println(name + " uses Aerial Ace!");
    }
}
