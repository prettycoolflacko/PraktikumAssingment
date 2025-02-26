/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentual;

/**
 *
 * @author crova
 */
// Charizard - Fire & Flying Pokémon
public class Charizard extends pokemon implements fireInterface, flyingInterface {
    public Charizard(String name, int level, int health) {
        super(name, level, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " uses Ember!");
    }

    @Override
    public void defend() {
        System.out.println(name + " defends with its wings!");
    }

    @Override
    public void ultimate() {
        System.out.println(name + " unleashes Fire Blast!");
    }

    @Override
    public void blastburn() {
        System.out.println(name + " uses Blast Burn!");
    }

    @Override
    public void flamethrower() {
        System.out.println(name + " uses Flamethrower!");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies high in the sky!");
    }

    @Override
    public void aerial() {
        System.out.println(name + " uses Aerial Ace!");
    }
}

