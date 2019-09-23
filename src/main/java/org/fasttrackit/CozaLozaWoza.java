package org.fasttrackit;

import javax.swing.*;
import java.util.Scanner;

public class CozaLozaWoza {
    private int  first;
    private int second;

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public static void main(String[] args) {
        CozaLozaWoza exercise = new CozaLozaWoza();
        exercise.setFirst(15);
        exercise.setSecond(185);
        {
            for (int i = exercise.getFirst(); i <= exercise.getSecond(); i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("CozaLoza");
                } else if (i % 3 == 0) {
                    System.out.print("Coza");
                } else if (i % 5 == 0) {
                    System.out.print("Loza");
                } else if (i % 7 == 0) {
                    System.out.print("Woza");
                } else {
                    System.out.print(i);
                }if (i % 11 == 0){
                System.out.println();
                }else
                    System.out.print(" ");
                }
                }
            }
    }


