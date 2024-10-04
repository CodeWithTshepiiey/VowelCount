/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelcount;
import java.util.Scanner;
/**
 *
 * @author Makgotso Mokgoko
 */
public class VowelCount {

    public static void main(String[] args) {
        //create a scanner 
        Scanner scanner = new Scanner(System.in);
        //prompt the user to enter a sentence
        System.out.print("Please enter a sentence: ");
        String sentence = scanner.nextLine();
        
        int vowelCount = countVowels(sentence);
        //output the number of vowels found in the sentence
        System.out.println("The number of vowels: " + vowelCount);
        
        scanner.close();
    }

    public static int countVowels(String sentence) {
        //initialize the vowl count
        int count = 0;
        String lowerCaseSentence = sentence.toLowerCase();
        String vowels = "aeiou";
        
        for (int i = 0; i < lowerCaseSentence.length(); i++) {
            char currentChar = lowerCaseSentence.charAt(i);
            if (vowels.indexOf(currentChar) != -1) {
                count++;
            }
        }
        
        return count;
    }
}

