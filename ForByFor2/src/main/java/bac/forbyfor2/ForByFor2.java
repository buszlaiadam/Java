/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package bac.forbyfor2;

/**
 *
 * @author adam
 */
public class ForByFor2 {

    public static void main(String[] args) {
        
        for (int i = 0; i < 3; i++){
            System.out.print("|");
            if (i == 1) {
                for (int l = 0; l < 3; l++){
                for (int m = 0; m < 3; m++){
                    if (l == 1) {
                       System.out.print("#"); 
                    } else {
                    System.out.print("@");
                    }
                }
                System.out.print("|");
               } 
            } else {
            for (int j = 0; j < 3; j++){
                for (int k = 0; k < 3; k++){
                    if (j == 1) {
                       System.out.print("$"); 
                    } else {
                    System.out.print("*");
                    }
                }
                System.out.print("|");
                
            }
            }
            System.out.println("");
            
        }
    }
        
}
