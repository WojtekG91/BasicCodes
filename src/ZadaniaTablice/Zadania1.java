package ZadaniaTablice;

public class Zadania1 {
    public static void main(String[] args) {
        int[] liczby = {1, 2, 3, 4};

        for (int i = liczby.length-1; i >= 0; i--) {
            System.out.println(liczby[i]);
        }
    }
}
