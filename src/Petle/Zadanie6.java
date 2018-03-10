package Petle;

import java.util.Random;
import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Random random = new Random();
        int losowa = random.nextInt(600);
        System.out.println(losowa);
        Scanner scanner = new Scanner(System.in);

        int zgadywana;
        do {
            System.out.println("Zgaduj: ");
            zgadywana = scanner.nextInt();
            if (zgadywana>losowa){
                System.out.println("Za duzo");
            }else if (zgadywana<losowa){
                System.out.println("Za mało");
            }else {
                System.out.println("Zgadles");
            }
        }while (zgadywana != losowa);
    }
}
