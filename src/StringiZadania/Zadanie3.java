package StringiZadania;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String text = scanner.nextLine();

        if (text.endsWith("m") || text.endsWith("M")){
            System.out.println("Tak");
        }else{
            System.out.println("Nie");
        }
    }
}
