package ZadaniaTablice;

import java.util.Scanner;

public class Zadanie11_cyclicRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        int rozmTablicy = scanner.nextInt();
        int[] tabl1 = new int[rozmTablicy];
        int[] tabl2 = new int[rozmTablicy];
        //uzupełnianie tablicy
        System.out.println("podaj elementy tablicy");
        for (int i = 0; i < rozmTablicy; i++) {
            tabl1[i] = scanner.nextInt();
        }
        //rotacja
        System.out.println("Podaj liczbę rotacji");
        int rotacje = scanner.nextInt();
        for (int i = 1; i <= rotacje; i++) {
            for (int j = 0; j < rozmTablicy; j++) {

                if ((j) == rozmTablicy - 1) {
                    tabl2[0] = tabl1[j];
                } else {
                    tabl2[j + 1] = tabl1[j];
                }

            }
            for (int j = 0; j < tabl1.length; j++) {
                tabl1[j] = tabl2[j];
            }
        }
        for (int i = 0; i < tabl1.length; i++) {
            System.out.println(tabl1[i]);
        }
    }
}

