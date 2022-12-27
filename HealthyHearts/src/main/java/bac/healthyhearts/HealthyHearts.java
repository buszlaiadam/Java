/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bac.healthyhearts;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class HealthyHearts {

    public static void main(String[] args) {
        int age = 0;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("What is your age?");
        age = myScanner.nextInt();
        
        System.out.println("Your maximum heart rate should be " + (220 - age) + " beats per minute.");
        System.out.println("Your target HR Zone is " + ((220-age)*50/100) + " - " + ((220-age)*85/100) + " beats per minute");
    }
}
