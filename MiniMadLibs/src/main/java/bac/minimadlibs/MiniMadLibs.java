/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bac.minimadlibs;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class MiniMadLibs {

    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner (System.in);
        
        String noun = "", adjective = "", noun2 = "", adjective2 = "", pluralNoun = "", pluralNoun2 = "", pluralNoun3 = "", verb = "", verbPastP = "";
        int number = 0;
        
        System.out.println("Let's play MAD LIBS!\n");
        System.out.println("I need a noun: ");
        noun = inputReader.nextLine();
        System.out.println("Now an adjective: ");
        adjective = inputReader.nextLine();
        System.out.println("Another noun: ");
        noun2 = inputReader.nextLine();
        System.out.println("And a number: ");
        number = Integer.parseInt(inputReader.nextLine());
        System.out.println("Another adjective: ");
        adjective2 = inputReader.nextLine();
        System.out.println("A plural noun: ");
        pluralNoun = inputReader.nextLine();
        System.out.println("Another one: ");
        pluralNoun2 = inputReader.nextLine();
        System.out.println("One more: ");
        pluralNoun3 = inputReader.nextLine();
        System.out.println("A verb (infinitive form): ");
        verb = inputReader.nextLine();
        System.out.println("Same verb (past participle): ");
        verbPastP = inputReader.nextLine();
        System.out.println("");
        System.out.println("*** NOW LETS GET MAD (libs) ***");
        System.out.println(noun + ": the " + adjective + " frontier. These are the voyages of the starship " + noun2 + ".");
        System.out.println("Its " + number + "-year mission: to explore strange " + adjective2 + " " + pluralNoun + ", to seek out " + adjective2 + " " + pluralNoun2 + " and " + adjective2 + " " + pluralNoun3 + ", to boldly " + verb + " where no one has " + verbPastP + " before.");
    }
}
