package ZadaniaTablice;

import java.util.Scanner;

public class Zadanie8_Modulo {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj n:");
//        int n = scanner.nextInt();
        int[] tab = new int[]{1,
                38,
                39,
                75,
                76,
                77,
                112,
                113,
                114,
                115,
                149,
                150,
                151,
                153,
                154};

        //tworzenie tablicy zmienych a
//        for (int i = 0; i < tab.length; i++) {
//            System.out.println("Podaj liczbę " + (i + 1));
//            int podana = scanner.nextInt();
//            tab[i] = podana;
//        }


        int[] modulo = new int[15];
        for (int i = 0; i < tab.length; i++) {
            modulo[i] = tab[i] % 37;
        }

        int count =0;
        for (int i = 0; i < modulo.length; i++) {
            boolean unique = false;
            for (int j = 0; j < i; j++) {
                if (modulo[i]==modulo[j]){
                    unique=true;
                    break;
                }
            }
            if(!unique){
                count++;
            }
        }
        System.out.println(count);
    }
}
