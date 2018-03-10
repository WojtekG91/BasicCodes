package StringiZadania;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String text = scanner.nextLine();

        if (Character.isDigit(text.charAt(0))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
