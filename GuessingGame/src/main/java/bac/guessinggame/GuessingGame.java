/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bac.guessinggame;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class GuessingGame {

    public static void main(String[] args) {
        
        // declare the number variables and initialize to 0
        int answer = 0;
        int guess = 0;
        
        // declare and initialize a Scanner object
        Scanner myScanner = new Scanner(System.in);
        
        // ask player 1 to enter a number from 1 to 20
        System.out.println("Player 1: Please enter a number between 1 and 20:");
        
        // now wait until a number is entered
        answer = myScanner.nextInt();
        
        // Note that there should be error checking here!
        
        
        // Now start getting guesses!
        while( true )
        {
            // Get a guess!
            System.out.println("Please guess a number between 1 and 20: ");
            guess = myScanner.nextInt();
            
            // Does the guess equal the answer?
            if ( guess == answer )
            {
                break; // they've solved the problem!
            }
            else if ( guess < 1 || guess > 20 )
            {
                System.out.println("Enter a guess between 1 and 20.");
                continue;
            }
            
            if ( guess > answer )
            {
                System.out.println("Guess is too high. Pick a lower number!");
                continue;
            }
            System.out.println("Guess is too low. Pick a higher number!");
        }
        
        System.out.println("You got it! The answer was: " + answer);
        
    }
}
