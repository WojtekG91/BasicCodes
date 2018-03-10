package StringiZadania;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String text = scanner.nextLine();

        if (text.charAt(0) == text.charAt(text.length()-1)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
