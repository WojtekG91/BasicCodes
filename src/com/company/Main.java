package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int dogAge = 5;
        int footSize = 43;

        String imie = "Wojtek";
        String nazwisko = "Gałka";

        float taxAmmount = 1020.10f;
        float transportBill = 60.10f;

        char mark = 'B';
        char printChar = 't';

        int cos4 = (int) 100L; //po przekroczeniu zakresu int w longu nastepuje przekrecenie licznika i wygenerowanie pozostalej liczby
        int cos5 = (int) 200.66f; //ucina czesci dziesietne

        String cos7 = "123";
        int cos8 = Integer.valueOf(cos7);

        String cos9 = "4.2345";
        double cos10 = Double.valueOf(cos9);

        float a = 123;
        String konwersjaInt = String.valueOf(a);
        System.out.println(konwersjaInt);

        int intNum = Integer.MAX_VALUE;
        System.out.println(intNum);



    }
}
