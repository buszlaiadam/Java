/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bac.birthstones;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class BirthStones {

    public static void main(String[] args) {
        
        int number = 0;
        String month = "";
        
        Scanner myScanner = new Scanner (System.in);
        
        System.out.println("Which month's birthstone do you want to know?");
        number = myScanner.nextInt();
        
        if (number == 1) {
            month = "January's birthstone is Garnet.";
        } else if (number == 2) {
            month = "February's birthstone is Amethyst.";
        } else if (number == 3) {
            month = "March's birthstone is Aquamarine.";
        } else if (number == 4) {
            month = "April's birthstone is Diamond.";
        } else if (number == 5) {
            month = "May's birthstone is Emerald.";
        } else if (number == 6) {
            month = "June's birthstone is Pearl.";
        } else if (number == 7) {
            month = "July's birthstone is Ruby.";
        } else if (number == 8) {
            month = "August's birthstone is Peridot.";
        } else if (number == 9) {
            month = "September's birthstone is Sapphire.";
        } else if (number == 10) {
            month = "October's birthstone is Opal.";
        } else if (number == 11) {
            month = "November's birthstone is Topaz.";
        } else if (number == 12) {
            month = "December's birthstone is Turquoise.";
        } else {
            month ="I think you must be confused, " + number + " doesn't match a month.";
        }
        
        System.out.println(month);
    }
}
