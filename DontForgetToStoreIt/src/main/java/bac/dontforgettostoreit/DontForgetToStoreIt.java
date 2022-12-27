/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bac.dontforgettostoreit;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class DontForgetToStoreIt {

    public static void main(String[] args) {
        
        int meaningOfLifeAndEverything = 42;
        double pi = 3.14159;
        String cheese, color;
        
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Give me pi to at least 5 decimals: ");
        pi = Double.parseDouble(inputReader.nextLine());
        
        // We've used Double.parseDouble but meaningOfLifeAndEverything is in INT
        // so we'll have to use Integer.parseInt
        
        System.out.println("What is the meaning of life, the universe and everything? ");
        meaningOfLifeAndEverything = Integer.parseInt(inputReader.nextLine());
        
        System.out.println("What is your favourite kind of cheese? ");
        cheese = inputReader.nextLine();
        
        System.out.println("Do you like the color red or blue more? ");
        color = inputReader.nextLine();
        
        System.out.println("Ooh, " + color + " " + cheese + " sounds delicious!");
        System.out.println("The circumference of life is " +( 2 * pi * meaningOfLifeAndEverything));
        
        
    }
}
