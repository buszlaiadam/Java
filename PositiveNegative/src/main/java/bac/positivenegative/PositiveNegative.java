/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bac.positivenegative;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class PositiveNegative {

    public static void main(String[] args) {
        
        int number = 0;
        String stringValue = "";
        
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        stringValue = inputReader.nextLine();
        number = Integer.parseInt(stringValue);
        
        if(number >= 0){
        System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }
}
