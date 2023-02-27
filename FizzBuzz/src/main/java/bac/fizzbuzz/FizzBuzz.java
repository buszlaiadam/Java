/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bac.fizzbuzz;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class FizzBuzz {

    public static void main(String[] args) {
        
        int number = 0;
        int count = 0;
        int i = 0;
        
        Scanner myScanner = new Scanner (System.in);
        System.out.print("How many units of fizzing and buzzing do you need in your life? ");
        number = myScanner.nextInt();
        
        do {
            if ((i != 0) && (i%3 == 0) && (i%5 == 0)){
            System.out.println("fizz buzz");
            count ++;
        } else if ((i != 0) && (i%3 == 0)){
            System.out.println("fizz");
            count ++;
        } else if ((i != 0) && (i%5 == 0)){
            System.out.println("buzz");
            count ++;
        } else {
            System.out.println(i);
        }    
            i++;
        } while (count != number);
        
        System.out.println("TRADITION!!!!!");
    }
}
