package Kolekcje;

import java.util.HashSet;
import java.util.Random;

public class Zadanie1 {
    public static void main(String[] args) {
        Random generator = new Random();
        HashSet<Integer> lotto = new HashSet<>();

        do {
            lotto.add(generator.nextInt(48) + 1);
        } while (lotto.size() < 6);
        System.out.println(lotto);
    }
}
