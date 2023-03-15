/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bac.highroller;

import java.util.Random;

/**
 *
 * @author adam
 */
public class HighRoller {

    public static void main(String[] args) {
        
        Random diceRoller = new Random();
        
        int rollResult = diceRoller.nextInt(6) + 1;
        
        System.out.println("TIME TO ROOOOOOLL THE DIE!");
        System.out.println("I rolled a " + rollResult);
        
        if (rollResult == 1) {
            System.out.println("You rolled a critical failure!");
        }
    }
}
