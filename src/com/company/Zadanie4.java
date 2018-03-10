package com.company;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();


        int temp = Math.min(a, b);
        int najmniejsza = Math.min(temp, c);

        System.out.println(najmniejsza);
    }
}
