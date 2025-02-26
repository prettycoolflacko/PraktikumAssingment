/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentual;

/**
 *
 * @author crova
 */
public class Swampert extends pokemon implements waterInterface {
    public Swampert(String name, int level, int health) {
        super(name, level, health);
    }

    @Override
    public void attack() {
        System.out.println(name + " uses Muddy Water!");
    }

    @Override
    public void defend() {
        System.out.println(name + " digs under the dirt!");
    }

    @Override
    public void ultimate() {
        System.out.println(name + " unleashes Muddy Water!");
    }

    @Override
    public void hydroPump() {
        System.out.println(name + " uses Hydro Pump!");
    }

    @Override
    public void surf() {
        System.out.println(name + " uses Surf!");
    }
}