/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bac.springforwardfallback;

/**
 *
 * @author adam
 */
public class SpringForwardFallBack {

    public static void main(String[] args) {
        
        System.out.println("It's Spring...!");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }
        
        System.out.println("\nOh no, it's fall...");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + ", ");
        }
    }
}
