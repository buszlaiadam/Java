/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bac.comparestrings2;
import java.util.Scanner;

/**
 *
 * @author adam
 */
public class CompareStrings2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int userNumber = 0;
        String userNumberString;
        
        do {
            System.out.println("Please enter a number between 1 and 20: ");
            userNumberString = sc.nextLine();
            userNumber = Integer.parseInt(userNumberString);
        } while (userNumber < 1 || userNumber > 20);
        
        System.out.println("Thank you!!! Your number was: " + userNumber);
    }
}
