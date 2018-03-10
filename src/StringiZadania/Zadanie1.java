package StringiZadania;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String dlugosc = scanner.nextLine();
        System.out.println(dlugosc.length());
    }
}
