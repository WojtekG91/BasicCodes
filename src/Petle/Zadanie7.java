package Petle;

import java.util.Random;

public class Zadanie7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] losowa = new int[6];
        int[] pileczki = new int[50];
        for (int i = 1; i <= 49; i++) {
            pileczki[i] = i;
        }

        for (int i = 0; i < 6; i++) {
            int randomIndex = random.nextInt(49)+1;
            losowa[i] = pileczki[randomIndex];
            for (int j = 0; j < i; j++) {
                if (pileczki[j] == pileczki[i]) {
                    randomIndex = random.nextInt(50);
                    losowa[i] = pileczki[randomIndex];
                }
            }
            System.out.println(losowa[i]);


        }

        int[] arrayOfInt = new int[6];
        boolean ended = false;

        while (!ended){
            int randomInt = random.nextInt(50-1)+1;
            boolean hasNumber = false;
            int counterOfZero = 0;
            for (int i = 0; i < arrayOfInt.length; i++) {
                if (arrayOfInt[i]==randomInt){
                    hasNumber = true;
                }
            }
            if(hasNumber){
                continue;
            }
            boolean added = false;
            for (int i = 0; i < arrayOfInt.length; i++) {
                if (arrayOfInt[i]==0){
                    counterOfZero++;
                }
            }
        }





    }


}
