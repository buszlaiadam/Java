/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bac.aboutyou;

/**
 *
 * @author adam
 */
public class AboutYou {

    public static void main(String[] args) {
        int age = 19;
        boolean registered = true;
        
        // See if a person can vote!
        if(age >= 18 && registered == true){
            System.out.println("You can vote!");
        }
        
        // See if they are not allowed to vote!
        if(age < 18 || registered != true){
            System.out.println("You are not eligible to vote!");
        }
    }
}
