package org.fasttrackit;

import java.util.Scanner;

public class StoryCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a noun");
        String noun = scanner.nextLine();
        System.out.println("Please insert a verb");
        String verb = scanner.nextLine();
        System.out.println("Please insert an adjective");
        String adjective = scanner.nextLine();
        System.out.println("Please insert adverb");
        String adverb = scanner.nextLine();

        System.out.println("Do you " + verb + " your " + adjective + ' ' + noun + ' ' + adverb + "? That's hilarious!");
    }
}
