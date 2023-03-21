/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bac.fortunecookie;

import java.util.Random;

/**
 *
 * @author adam
 */
public class FortuneCookie {

    public static void main(String[] args) {
        
        Random rng = new Random();
        
        String[] fortunes = new String[] {"Those aren't the droids you're looking for.",
"Never go in against a Sicilian when death is on the line!",
"Goonies never say die.",
"With great power, there must also come great responsibility.",
"Never argue with the data.",
"Try not. Do, or do not. There is no try.",
"You are a leaf on the wind, watch how you soar.",
"Do absolutely nothing, and it will be everything that you thought it could be.",
"Kneel before Zod.", "Make it so."};
        
        int randomIndex = rng.nextInt(fortunes.length);
        String randomFortune = fortunes[randomIndex];
        
        System.out.println("Your Geek Fortune: " + randomFortune);
    }
}
