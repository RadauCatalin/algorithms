package org.fasttrackit;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        DecimalFormat df2 = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the bill amount (the amount need to be an integer number)");
        int bill = scanner.nextInt();
        System.out.println("Please insert the tip procentage(the tip procentage need to be an integer number)");
        int tip = scanner.nextInt();
        float tipAmount = (float)tip / 100 *bill;
        float total = bill + tipAmount;
        System.out.println("What is the bill ? $" +df2.format(bill));
        System.out.println("What is the tip procentage " + tip + "%");
        System.out.println("The tip is $" + df2.format(tipAmount));
        System.out.println("The total is $" + df2.format(total));
    }
}
