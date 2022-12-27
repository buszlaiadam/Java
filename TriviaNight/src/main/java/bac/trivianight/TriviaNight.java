/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bac.trivianight;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class TriviaNight {

    public static void main(String[] args) {
        
        int answer = 0, score = 0, remainingQuestions = 3;
        
        Scanner myScanner = new Scanner (System.in);
        
        
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        System.out.println("");
        System.out.println("FIRST QUESTION!");
        System.out.println("What is the lowest-level of programming language?");
        System.out.println("1) Source code");
        System.out.println("2) Assembly language");
        System.out.println("3) C#");
        System.out.println("4) Machine code");
        System.out.println("YOUR ANSWER: ");
        answer = myScanner.nextInt();
        if(answer == 4){
            score ++;
            System.out.println("Your answer is correct");
        } else {
            System.out.println("Your answer is not correct");
        }
        remainingQuestions --;
        System.out.println("Current score: " + score);
        System.out.println("Remaining questions: " + remainingQuestions);
        System.out.println("");
        
        
        System.out.println("SECOND QUESTION!\n Website security CAPTCHA forms are descended from the work of? \n 1) Grace Hopper\n 2) Alan Turing\n 3) Charles Babbage\n 4) Larry Page");
        
        System.out.println("YOUR ANSWER: ");
        answer = myScanner.nextInt();
        if(answer == 2){
            score ++;
            System.out.println("Your answer is correct");
        } else {
            System.out.println("Your answer is not correct");
        }
        remainingQuestions --;
        System.out.println("Current score: " + score);
        System.out.println("Remaining questions: " + remainingQuestions);
        System.out.println("");
        
        
        System.out.println("LAST QUESTION!\n" +
        "Which of these sci-fi ships was once slated for a full-size replica in\n" +
        "Las Vegas?\n" +
        "1) Serenity\n" +
        "2) The Battlestar Galactica\n" +
        "3) The USS Enterprise\n" +
        "4) The Millennium Falcon");
        
        System.out.println("YOUR ANSWER: ");
        answer = myScanner.nextInt();
        if(answer == 3){
            score ++;
            System.out.println("Your answer is correct");
        } else {
            System.out.println("Your answer is not correct");
        }
        remainingQuestions --;
        System.out.println("Current score: " + score);
        System.out.println("Remaining questions: " + remainingQuestions);
        System.out.println("");
        
        
        if(score > 0){
            System.out.println("Nice job - you got " + score + " correct!");
        } else {
            System.out.println("Maybe next time - you got " + score + " correct!");
        }
        
    }
}
