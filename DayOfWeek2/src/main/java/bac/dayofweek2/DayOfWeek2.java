/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bac.dayofweek2;

/**
 *
 * @author adam
 */
public class DayOfWeek2 {

    public static void main(String[] args) {
        int day = 4;
        String dayName = "";
        
        if (day == 1) {
            dayName = "Monday";
        } else if(day == 2) {
            dayName = "Tuesday";
        } else if(day == 3) {
            dayName = "Wednesday";
        } else if(day == 4) {
            dayName = "Thursday";
        } else if (day == 5) {
            dayName = "Friday";
        } else if (day == 6) {
            dayName = "Saturday";
        } else if (day == 7){
            dayName = "Sunday";
        } else {
            dayName = "Oops!";
        }
        
        System.out.println("The day is " + dayName);
    }
}
