package StringiZadania;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String text = scanner.nextLine();
        System.out.println("podaj liczbę");
        int liczba = scanner.nextInt();

        String out = text.substring(text.length() - liczba, text.length());
        System.out.println(out);

    }
}

