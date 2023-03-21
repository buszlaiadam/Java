/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bac.guessmemore;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author adam
 */
public class GuessMeMore {

    public static void main(String[] args) {
        
        int answer = 0;
        int guess = 0;
        int numberOfGuesses = 0;
        int min = -100;
        int max = 100;
        Random rng = new Random();

        Scanner myScanner = new Scanner(System.in);
        
        // Generate a random number between -100 and 100
        answer = rng.nextInt(max - min) + min;

        while ( true )
        {
            
            System.out.println("Please guess a number between " + min + " and " + max + ": ");
            guess = myScanner.nextInt();
            numberOfGuesses++;

            if (guess == answer)
                break;

            else if (guess < min || guess > max)
            {
                System.out.println("Enter a guess between " + min + " and " + max + ".");
                continue;
            }

            if (guess > answer)
            {
                System.out.println("Guess is too high. Pick a lower number!");
                continue;
            }
            
            System.out.println("Guess is too low. Pick a higher number!");
            
        }
        
        System.out.println("You got it! The answer was: " + answer);
        System.out.println("Number of guesses: " + numberOfGuesses);
    }
}
