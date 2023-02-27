/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bac.fortimesfor;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class ForTimesFor {

    public static void main(String[] args) {
        
        int number = 0;
        int result = 0;
        int point = 0;
        
        System.out.println("Which times table shall I recite?");
        
        Scanner myScanner = new Scanner(System.in);
        number = myScanner.nextInt();
        
        for(int i = 1; i < 16; i++)
        {
            System.out.println(i + " * " + number + " is: ");
            result = myScanner.nextInt();
            
            if(result == (i*number)){
                System.out.println("Correct!");
                point ++;
            } else {
                System.out.println("Sorry no, the answer is: " + (i*number));
            }
        }
        
        System.out.println("You got " + point + " correct.");
            if (point < 8){
                System.out.println("You should study more!");
            } else if (point > 13){
                System.out.println("Congratulations!");
            }
    }
}
