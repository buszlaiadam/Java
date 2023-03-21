/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bac.coinflipper;

import java.util.Random;

/**
 *
 * @author adam
 */
public class CoinFlipper {

    public static void main(String[] args) {
        
        Random rng = new Random();
        
        double randomValue = rng.nextDouble();
        boolean coinIsHeads = randomValue < 0.5;
        
        System.out.println("Ready, Set, Flip....!!");
        
        if(coinIsHeads)
        {
            System.out.println("You got TAILS!");
        }
        else
        {
            System.out.println("You got HEADS!");
        }
            
    }
}
