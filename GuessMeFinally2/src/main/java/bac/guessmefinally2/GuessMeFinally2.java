/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bac.guessmefinally2;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class GuessMeFinally2 {

    public static void main(String[] args) {
        
        int myChoise = 2;
        int yourGuess = 0;
        
        Scanner myScanner = new Scanner (System.in);
        
        System.out.println("I've chosen a number between -100 and 100. Betcha can't guess it!");
        
        for(int i = 1; i < 4; i++)
        {
        System.out.println("Your guess: ");
        yourGuess = myScanner.nextInt();
        
        if (yourGuess == myChoise){
            System.out.println("Wow, nice guess! That was it!");
            break;
        } else if(i == 3){
            System.out.println("Finally! It's about time you got it!");
        }else if(yourGuess < myChoise) {
            System.out.println("Ha, nice try - too low! Try again!");
        } else {
            System.out.println("Too bad, way too high. Try again!");
        }
        }
    }
}
