package org.fasttrackit;

import java.util.Scanner;

public class Quotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the quote?");
        String quote = scanner.nextLine();
        System.out.println("Who said it?");
        String author = scanner.nextLine();
        System.out.println(author + " says, " + '"' + quote + '"');
    }
}