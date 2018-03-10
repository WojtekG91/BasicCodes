package ZadaniaTablice;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n");
        int n = scanner.nextInt();
        int[] tablica = new int[n];
        System.out.println("Podaj n elementów tablicy");
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = scanner.nextInt();
        }
        System.out.println("Podaj szukana liczbe k");
        int k = scanner.nextInt();

        int counter = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i]==k){
                counter++;
            }
        }
        System.out.println("Liczba "+k+" wystąpiła: "+counter+" razy");

    }
}
