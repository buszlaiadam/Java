/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bac.guessme;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class GuessMe {

    public static void main(String[] args) {
        
        int myChoise = 2;
        int yourGuess = 0;
        
        Scanner myScanner = new Scanner (System.in);
        
        System.out.println("I've chosen a number. Betcha can't guess it!");
        System.out.println("Your guess: ");
        yourGuess = myScanner.nextInt();
        
        if (yourGuess == myChoise){
            System.out.println("Wow, nice guess! That was it!");
        } else if(yourGuess < myChoise) {
            System.out.println( yourGuess + "? Ha, nice try - too low! I chose " + myChoise);
        } else {
            System.out.println( yourGuess + "? Too bad, way too high. I chose " + myChoise);
        }
        
    }
}
