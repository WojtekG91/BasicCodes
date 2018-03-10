package Petle;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int podana = scanner.nextInt();
        int suma = 0;
        for (int i = 1; i <= podana; i++) {
            suma += i;
        }

        System.out.println(suma);
    }
}
