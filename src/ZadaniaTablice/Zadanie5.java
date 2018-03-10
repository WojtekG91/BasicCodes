package ZadaniaTablice;

public class Zadanie5 {
    public static void main(String[] args) {
        int [] tablica = {1, 5, 23, 41, 23, 12, -5, 50};

        int min = tablica[0];
        int max = tablica[0];
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i]<min){
                min = tablica[i];
            }
            if (tablica[i]>max){
                max = tablica[i];
            }
        }
        System.out.println("Wartosc minimalna to: "+ min);
        System.out.println("Wartosc maksymalna to :" +max);
    }
}
