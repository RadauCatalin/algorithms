package org.fasttrackit;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your word or sentence for character count");
        String message = scanner.nextLine();
        int numberOfCharacters = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != ' ') {
                numberOfCharacters++;
            }
        }
        System.out.println("Number of character is: " + numberOfCharacters);
    }
}
