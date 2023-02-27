/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bac.fortimes;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class ForTimes {

    public static void main(String[] args) {
        
        int number = 0;
        
        System.out.println("Which times table shall I recite?");
        
        Scanner myScanner = new Scanner(System.in);
        number = myScanner.nextInt();
        
        for(int i = 1; i < 16; i++)
        {
            System.out.println(i + " * " + number + " is: " + (i*number));
        }
    }
}
