/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bac.myscanner;
import java.util.Scanner;

/**
 *
 * @author adam
 */
public class MyScanner {

    public static void main(String[] args) {
        // declare the number variables and initialize to 0
        String name = "";
        int age = 0;
        // int numComputers = 0;
        // String hometown = "";
        
        // declare and initialize a Scanner object - the Scanner reads
        // input from the console
        Scanner myScanner = new Scanner(System.in);
        
        // ask the user to input their name
        System.out.println("Please enter your name: ");
        // now wait until the user types something in - put the value in name
        name = myScanner.nextLine();
        
        // ask the user to input their age:
        System.out.println("Please enter your age: ");
        // now wait until the user types their age
        age = myScanner.nextInt();
        
        // We will get the other values in the next listing!
        
        // print the information to the console
        System.out.println("Hi " + name + " your age is " + age);
    }
}
