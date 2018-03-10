package ZadaniaTablice;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj wymiary tablicy");
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();

        int[][] tablica = {{6, 2, 3}, {4, 23, 6}, {7, 18, 9}};


        //sumowanie wyrazów, wyznaczanie MIN i MAX w tablicy
        int sumaWyrazow = 0;
        for (int i = 0; i < tablica.length; i++) {
            int min = tablica[i][0];
            int max = tablica[i][0];
            for (int j = 0; j < tablica[i].length; j++) {
                sumaWyrazow += tablica[i][j];
                if (tablica[i][j] < min) {
                    min = tablica[i][j];
                }
                if (tablica[i][j] > max) {
                    max = tablica[i][j];
                }
            }
            System.out.println("MIN: Wiersz " + i + " to " + min);
            System.out.println("MAX: Wiersz " + i + " to " + max);
        }
        System.out.println("Suma wyrasów: "+sumaWyrazow);

        //znajdowanie minimum

//        for (int i = 0; i < tablica.length; i++) {
//            int min = tablica[i][0];
//            int max = tablica[i][0];
//            for (int j = 0; j < tablica[i].length; j++) {
//                if (tablica[i][j] < min) {
//                    min = tablica[i][j];
//                }
//                if (tablica[i][j] > max) {
//                    max = tablica[i][j];
//                }
//            }
//            System.out.println("MIN: Wiersz " + i + " to " + min);
//            System.out.println("MAX: Wiersz " + i + " to " + max);
//        }
    }
}
