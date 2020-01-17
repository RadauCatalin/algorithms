package org.fasttrackit;

import java.util.Scanner;

public class Calculator {
    public int firstNumber;
    public int secondNumeber;
    public int repeatTimes;

        public void initCalculator() {
            System.out.println("Please insert repeat times");
            repeatTimes = scanner.nextInt();
            Calculator calculator = new Calculator();
            while (repeatTimes > 0) {
                repeatTimes = repeatTimes - 1;
                calculator.setRepeatTimes();
                System.out.println();
            }
        }

        Scanner scanner = new Scanner(System.in);
        public void displayfirstNumber () {
            System.out.println("Please insert your first number");
            firstNumber = scanner.nextInt();
            if (firstNumber < 1 || firstNumber > 200) {
                System.out.println("Please insert a number > 1 and <200");
                displayfirstNumber();
            }
        }
        public void displaySecondNumber () {
            System.out.println("Please insert your second number");
            secondNumeber = scanner.nextInt();
            if (secondNumeber < 1 || secondNumeber > 10000) {
                System.out.println("Please insert a number >1 and <10000");
                displaySecondNumber();
            }
        }
        public void sumOfEvenNumber () {
            int sumOfEvenNumber = 0;
            int sumOfOddNumber = 0;
            for (int i = firstNumber; i <= secondNumeber; i++) {
                if (i % 2 == 0) {
                    sumOfEvenNumber = sumOfEvenNumber + i;
                } else {
                    sumOfOddNumber = sumOfOddNumber + i;
                }
            }
            System.out.print(sumOfEvenNumber);
            System.out.print(" ");
            System.out.print(sumOfOddNumber);
        }

        public void setRepeatTimes () {
            Calculator calculator = new Calculator();
            calculator.displayfirstNumber();
            calculator.displaySecondNumber();
            calculator.sumOfEvenNumber();
        }
        public static void main (String[]args){
            Calculator calculator = new Calculator();
            calculator.initCalculator();
        }
    }
