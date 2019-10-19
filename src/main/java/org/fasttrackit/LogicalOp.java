package org.fasttrackit;


import java.util.Scanner;

public class LogicalOp {
    public void Counting() {
        int num1;
        System.out.println("Please insert number for counting to 100 and -100");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        System.out.println("Counting to 100: ");
        for (int i = num1 + 1; i < 101; i++) {
            if (i % 10 == 0) {
                System.out.println();
                System.out.print(i + ", ");
            } else {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        System.out.println("Counting to -100: ");
        for (int i = num1 - 1; i > -101; i--) {
            if (i % 10 == 0) {
                System.out.println();
                System.out.print(i + ", ");
            } else {
                System.out.print(i + ", ");
            }
        }
    }

    public void between() {
        int num1;
        int num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert first number for between counting");
        num1 = scanner.nextInt();
        System.out.println("Please insert second number for between counting");
        num2 = scanner.nextInt();
        System.out.println("Ascending counting: ");
        if (num1 > num2) {
            for (int i = num2 + 1; i < num1; i++) {
                if (i % 10 == 0) {
                    System.out.println();
                    System.out.print(i + ", ");
                } else {
                    System.out.print(i + ", ");
                }
            }
        } else {
            for (int i = num1 + 1; i < num2; i++) {
                if (i % 10 == 0) {
                    System.out.println();
                    System.out.print(i + ", ");
                } else {
                    System.out.print(i + ", ");
                }
            }
        }
        System.out.println();
        System.out.println("Descending counting: ");
        if (num1 > num2) {
            for (int i = num1 - 1; i > num2; i--) {
                if (i % 10 == 0) {
                    System.out.println();
                    System.out.print(i + ", ");
                } else {
                    System.out.print(i + ", ");
                }
            }
        } else {
            for (int i = num2 - 1; i > num1; i--) {
                if (i % 10 == 0) {
                    System.out.println();
                    System.out.print(i + ", ");
                } else {
                    System.out.print(i + ", ");
                }
            }
        }
    }

    //Counting 0 to 100
    //even number and odd number
    public void Number() {
        System.out.println("Even number between 0 and 100:");
        for (int i = 0; i  < 101; i++) {
            if (i % 10 == 0) {
                System.out.println();
                System.out.print(i + ", ");
            } else if (i % 2 == 0) {
                System.out.print(i + ", ");
            }

        }
        System.out.println();
        System.out.println("Odd number between 0 and 100:");
        for (int i = 0; i < 101; i++) {
            if (i % 10 == 0) {
                System.out.println();
            } else if (i % 2 != 0){
                System.out.print(i + ", ");
            }
        }
    }
    public int SumOfNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your number for sum");
        int numbers = scanner.nextInt();
        int sum = 0;
        for (int i = numbers ; i <= 100; i++)
            sum = sum +i;
        return sum;
    }
    public int AverageOfNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your number for average");
        int numbers = scanner.nextInt();
        int sum = 0, numberOfNumbers= 0;
        for (int i = numbers ; i <= 100; i++){
            sum = sum +i;
            numberOfNumbers++;
        }

        return sum/numberOfNumbers;
    }

    public void Asterix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your number fo asterix");
        int number = scanner.nextInt();
        for (int i = number; i >= 1; i--) {
            System.out.println();
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
        }
    }
}