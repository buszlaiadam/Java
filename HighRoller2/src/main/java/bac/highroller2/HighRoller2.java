/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bac.highroller2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author adam
 */
public class HighRoller2 {

    public static void main(String[] args) {
        
        Random diceRoller = new Random();
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Please enter the numeber of sides a single die has: ");
        
        int sides = myScanner.nextInt();
        int rollResult = diceRoller.nextInt(sides) + 1;
        
        System.out.println("TIME TO ROOOOOOLL THE DIE!");
        System.out.println("I rolled a " + rollResult);
        
        if(rollResult %2 == 0)
        {
            System.out.println("You rolled an even number!");
        }
        
        if(rollResult == sides)
        {
            System.out.println("You rolled a critical! Nice job!");
        }
        
        if (rollResult == 1) {
            System.out.println("You rolled a critical failure!");
        }
    }
}
