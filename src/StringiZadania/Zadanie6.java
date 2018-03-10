package StringiZadania;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj Imie: ");
        String imie = scanner.nextLine();
        System.out.print("Podaj Nazwisko: ");
        String nazwisko = scanner.nextLine();

        System.out.println("Twoje imię i nazwisko to: "+imie+" "+nazwisko);
    }
}
