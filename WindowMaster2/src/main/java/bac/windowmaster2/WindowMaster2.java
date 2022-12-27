/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bac.windowmaster2;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class WindowMaster2 {

    public static void main(String[] args) {
        // declare variables for height and width
        float height;
        float width;
        
        // declare String variables to hold the user's height and
        // width input
        String stringHeight;
        String stringWidth;
        String stringGlassCost, stringTrimCost;
        String stringNumberOfWindows;
        
        // declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        float glassCost, trimCost;
        float numberOfWindows;
        
        // declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);
        
        // get input from the user
        System.out.println("Please enter glass cost: ");
        stringGlassCost = myScanner.nextLine();
        System.out.println("Please enter trim cost: ");
        stringTrimCost = myScanner.nextLine();
        System.out.println("Please enter window height: ");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width: ");
        stringWidth = myScanner.nextLine();
        System.out.println("Please enter the number of windows: ");
        stringNumberOfWindows = myScanner.nextLine();
        
        // convert String values of height and width to float values
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        glassCost = Float.parseFloat(stringGlassCost);
        trimCost = Float.parseFloat(stringTrimCost);
        numberOfWindows = Float.parseFloat(stringNumberOfWindows);
        
        // calculate the area of the window
        areaOfWindow = height * width;
        
        // calculate the perimeter of the window
        perimeterOfWindow = 2 * (height + width);
        
        // calculate the total cost - use a hard-coded value
        // for material cost
        cost = (numberOfWindows * ((glassCost * areaOfWindow) + (trimCost * perimeterOfWindow)));
        
        // display the results to the user
        System.out.println("Glass cost = " + stringGlassCost);
        System.out.println("Trim cost = " + stringTrimCost);
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Number of windows = " + stringNumberOfWindows);
        System.out.println("Total Cost = " + cost);
    }
}
