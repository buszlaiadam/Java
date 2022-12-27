/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bac.comparestrings;

/**
 *
 * @author adam
 */
public class CompareStrings {

    public static void main(String[] args) {
        
        String stringOne = "apples";
        String stringTwo = "bananas";
        String stringThree = "grapes";
        
        
        int result = 0;
        
        result = stringOne.compareTo(stringTwo);
        if (result == 0) {
            System.out.println( stringOne + " equals " + stringTwo);
        } else if (result < 0){
            System.out.println( stringOne + " are less than (before) " + stringTwo);
        } else {
            System.out.println( stringOne + " are greater than (after) " + stringTwo);
        }
        
        result = stringThree.compareTo(stringTwo);
        if (result == 0) {
            System.out.println( stringThree + " equals " + stringTwo);
        } else if (result < 0){
            System.out.println( stringThree + " are less than (before) " + stringTwo);
        } else {
            System.out.println( stringThree + " are greater than (after) " + stringTwo);
        }
    }
}
