/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignmentual;

/**
 *
 * @author crova
 */
public class AssignmentUal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Charizard charizard = new Charizard("Charizard", 50, 500);
        Swampert swampert = new Swampert("Swampert", 52, 480);
        Rayquaza rayquaza = new Rayquaza("Rayquaza", 70, 630);

        System.out.println("\n--- Pokémon Info ---");
        charizard.displayInfo();
        swampert.displayInfo();
        rayquaza.displayInfo();

        System.out.println("\n--- Battle Moves ---");
        charizard.attack();
        charizard.fly();
        charizard.blastburn();

        System.out.println();
       
        swampert.surf();
        swampert.ultimate();
        swampert.hydroPump();

        System.out.println();
        rayquaza.defend();
        rayquaza.attack();
        rayquaza.fly();
        rayquaza.aerial();
    }
}
