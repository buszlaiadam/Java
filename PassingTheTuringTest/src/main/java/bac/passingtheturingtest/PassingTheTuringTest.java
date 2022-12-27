/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bac.passingtheturingtest;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class PassingTheTuringTest {

    public static void main(String[] args) {
        String name = "", color = "", fruit = "";
        int number = 0;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Hello there!");
        System.out.println("What's your name?");
        name = inputReader.nextLine();
        
        System.out.println("Hi " + name + "! I'm Alice.");
        System.out.println("What's your favorite color?");
        color = inputReader.nextLine();
        
        System.out.println("Huh, " + color + "? Mine's Electric Lime.");
        
        System.out.println("I really like limes. They're my favorite fruit, too.");
        System.out.println("What's YOUR favorite fruit, " + name + "?");
        fruit = inputReader.nextLine();
        
        System.out.println("Really? " + fruit + "? That's wild!");
        System.out.println("Speaking of favorites, what's your favorite number?");
        number = Integer.parseInt(inputReader.nextLine());
        
        System.out.println(number + " is a cool number. Mine's -7.");
        System.out.println("Did you know " + number + " * -7 is " + number * (-7) + "? That's a cool number too!");
        
        System.out.println("Well, thanks for talking to me, " + name + "!");
    }
}
