/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bac.dayofweek;

/**
 *
 * @author adam
 */
public class DayOfWeek {

    public static void main(String[] args) {
        int day = 5;
        String dayName = "";
        
        if (day == 1)
        {
        dayName = "Monday";
        }
        if (day == 2)
        {
        dayName = "Tuesday";
        }
        if (day == 3)
        {
        dayName = "Wednesday";
        }
        if (day == 4)
        {
        dayName = "Thursday";
        }
        if (day == 5)
        {
        dayName = "Friday";
        }
        if (day == 6)
        {
        dayName = "Saturday";
        }
        if (day == 7)
        {
        dayName = "Sunday";
        }
        
        System.out.println("The day is " + dayName);
    }
}
