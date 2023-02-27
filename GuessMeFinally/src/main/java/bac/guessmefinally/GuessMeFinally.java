/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bac.guessmefinally;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class GuessMeFinally {

    public static void main(String[] args) {
        
        int myChoise = 2;
        int yourGuess = 0;
        int run = 0;
        
        Scanner myScanner = new Scanner (System.in);
        
        System.out.println("I've chosen a number between -100 and 100. Betcha can't guess it!");
        
        do {
        run++;
        System.out.println("Your guess: ");
        yourGuess = myScanner.nextInt();
        
        if (yourGuess == myChoise){
            System.out.println("Wow, nice guess! That was it!");
        } else if(run == 3){
            System.out.println("Finally! It's about time you got it!");
        }else if(yourGuess < myChoise) {
            System.out.println("Ha, nice try - too low! Try again!");
        } else {
            System.out.println("Too bad, way too high. Try again!");
        }
        } while ((yourGuess != myChoise) && (run != 3) );
    }
}
