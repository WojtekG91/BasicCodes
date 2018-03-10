package ZadaniaTablice;

import java.util.Scanner;

public class Zadanie6_SumaCzesciowa {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj n:");
        int n = scanner.nextInt();
        int[] tab = new int[n];

        //tworzenie tablicy zmienych a
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbę " + (i + 1));
            int podana = scanner.nextInt();
            tab[i] = podana;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println("\n");
        //obliczanie tablicy zmiennych b
        int[] tabb = new int[n];

        for (int i = 0; i < n; i++) {
            int b = 0;
            for (int j = i; j < n; j++) {
                b += tab[j];
            }
            tabb[i] = b;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(tabb[i] + " ");
        }
    }
}


