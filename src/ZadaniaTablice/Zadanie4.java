package ZadaniaTablice;

public class Zadanie4 {
    public static void main(String[] args) {
        int [] tablica = {1, 5, 23, 41, 23, 12};

        int suma =0;
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i];

        }
        System.out.println("Suma ciągu to: "+suma);
        System.out.println("Srednia arytmetyczna to: " + (suma/tablica.length));
    }
}
