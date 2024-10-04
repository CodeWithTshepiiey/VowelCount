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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels: " + vowelCount);
        
        scanner.close();
    }

    public static int countVowels(String sentence) {
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

