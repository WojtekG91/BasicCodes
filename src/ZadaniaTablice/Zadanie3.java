package ZadaniaTablice;

public class Zadanie3 {
    public static void main(String[] args) {
        int[] liczby = {1,1,1,1, 3, 4, 2, -20, -5, -6, -10};

        int counter = 0;
        int tempCounter = 0;
        for (int i = 0; i < liczby.length; i++) {
            for (int j = 0; j < liczby.length; j++) {
                if (liczby[j]==liczby[i]){
                    tempCounter++;
                }
            }
            if (tempCounter>counter){
                counter=tempCounter;
            }
        }
    }
}
