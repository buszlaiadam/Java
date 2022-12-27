/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bac.birthstones2;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class BirthStones2 {

    public static void main(String[] args) {
        
        int number = 0;
        String month = "";
        
        Scanner myScanner = new Scanner (System.in);
        
        System.out.println("Which month's birthstone do you want to know?");
        number = myScanner.nextInt();
        
        switch (number) {
        case 1:
            month = "January's birthstone is Garnet.";
            break;
        case 2:
            month = "February's birthstone is Amethyst.";
            break;
        case 3:
            month = "March's birthstone is Aquamarine.";
            break;
        case 4:
            month = "April's birthstone is Diamond.";
            break;
        case 5:
            month = "May's birthstone is Emerald.";
            break;
        case 6:
            month = "June's birthstone is Pearl.";
            break;
        case 7:
            month = "July's birthstone is Ruby.";
            break;
        case 8:
            month = "August's birthstone is Peridot.";
            break;
        case 9:
            month = "September's birthstone is Sapphire.";
            break;
        case 10:
            month = "October's birthstone is Opal.";
            break;
        case 11:
            month = "November's birthstone is Topaz.";
            break;
        case 12:
            month = "December's birthstone is Turquoise.";
            break;
        default:
            month ="I think you must be confused, " + number + " doesn't match a month.";
    }
        
        System.out.println(month);
        
    }
}
