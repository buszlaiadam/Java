/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bac.fieldday;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class FieldDay {

    public static void main(String[] args) {
        
        String name = "";
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("What's your last name? ");
        name = myScanner.nextLine();
        
        if((name.compareTo("Baggins") < 0)) {
            System.out.println("Aha! You're on the team Red Dragons!");
        }
        
        if((name.compareTo("Baggins") >= 0) && (name.compareTo("Dresden") < 0)){
            System.out.println("Aha! You're on the team Dark Wizards!");
        }
        
        if((name.compareTo("Dresden") >= 0) && (name.compareTo("Howl") < 0)){
            System.out.println("Aha! You're on the team Moving Castles!");
        }
        
        if((name.compareTo("Howl") >= 0) && (name.compareTo("Potter") < 0)){
            System.out.println("Aha! You're on the team Golden Snitches!");
        }
        
        if((name.compareTo("Potter") >= 0) && (name.compareTo("Vimes") < 0)){
            System.out.println("Aha! You're on the team Night Guards!");
        }
        
        if(name.compareTo("Vimes") >= 0){
            System.out.println("Aha! You're on the team Black Holes!");
        }
        
        System.out.println("Good luck in the games!");
        
    }
}
