package com.company;

import java.util.Scanner;

public class BinaryGap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę N:");
        int NumberN = scanner.nextInt();

        String binaryValue = Integer.toString(NumberN, 2);
        System.out.println("Binary Value is: "+binaryValue);

        int counter = 0, maxCount = 0;
        char[] symbols = new char[binaryValue.length()];

        for (int i = 0; i < binaryValue.length(); i++) {
            char charIs = binaryValue.charAt(i);
            symbols[i] = charIs;
            if (symbols[i] == '0') {
                counter++;
            } else {
                if (counter > maxCount) {
                    maxCount = counter;
                }
                counter = 0;
            }
        }
        System.out.println("Longest binary gap equals: " + maxCount);
    }

}
