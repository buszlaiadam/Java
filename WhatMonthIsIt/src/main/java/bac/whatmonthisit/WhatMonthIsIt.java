/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bac.whatmonthisit;

/**
 *
 * @author adam
 */
public class WhatMonthIsIt {

    public static void main(String[] args) {
        
        int number = 5;
        String month = "";
        
        if (number == 1) {
            month = "January";
        } else if (number == 2) {
            month = "February";
        } else if (number == 3) {
            month = "March";
        } else if (number == 4) {
            month = "April";
        } else if (number == 5) {
            month = "May";
        } else if (number == 6) {
            month = "June";
        } else if (number == 7) {
            month = "July";
        } else if (number == 8) {
            month = "August";
        } else if (number == 9) {
            month = "September";
        } else if (number == 10) {
            month = "October";
        } else if (number == 11) {
            month = "November";
        } else if (number == 12) {
            month = "December";
        } else {
            month ="Oops!";
        }
        
        System.out.println("What month is it?");
        System.out.println("It's " + month);
        
    }
}
