/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bac.countingnumbers2;

/**
 *
 * @author adam
 */
public class CountingNumbers2 {

    public static void main(String[] args) {
        
        int counter = 1; // initializing our variable
        
        do {
            System.out.println("Counting: " + counter);
            counter++;
        } while (counter <= 5);
        
        System.out.println("...Done!");
    }
}
