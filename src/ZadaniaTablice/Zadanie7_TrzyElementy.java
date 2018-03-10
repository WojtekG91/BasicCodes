package ZadaniaTablice;

import java.util.Scanner;

public class Zadanie7_TrzyElementy {

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

        int count = 0;


        for (int i = 0; i < n; i++) {
            int tempNum = tab[i];
            int tempCount = 0;
            for (int j = 0; j < n; j++) {
                int tempNum2 = tab[j];
                if (tempNum == tempNum2) {
                    tempCount++;
                }
            }
            if (tempCount > count) {
                count = tempCount;
            }
        }
        System.out.println("Count wynosi " + count);
        if (count >= 3) {
            System.out.println("TAK");
        } else {
            System.out.println("NO");
        }
    }
}

