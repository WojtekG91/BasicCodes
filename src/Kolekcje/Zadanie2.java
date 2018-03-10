package Kolekcje;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb do wczytania");
        int n = scanner.nextInt();
        ArrayList<Integer> liczby = new ArrayList<>();
        System.out.println("podaj liczby:");
        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            liczby.add(k);
        }

        
    }
}
