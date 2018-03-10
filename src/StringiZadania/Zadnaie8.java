package StringiZadania;

import java.util.Scanner;

public class Zadnaie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj Imie 1: ");
        String imie1 = scanner.nextLine();
        System.out.print("Podaj Imie 2: ");
        String imie2 = scanner.nextLine();

        if (imie1.equals(imie2)){
            System.out.println("Tak");
        }else{
            System.out.println("Nie");
        }
    }
}
