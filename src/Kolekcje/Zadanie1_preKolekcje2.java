package Kolekcje;

import java.util.ArrayList;

public class Zadanie1_preKolekcje2 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("ala");
        lista.add("ma");
        lista.add("kota");
        lista.add("ala1");
        boolean wynik = Check(lista);
        System.out.println(wynik);
    }

    public static boolean Check(ArrayList<String> provided) {
        for (int i = 0; i < provided.size() - 1; i++) {
            for (int j = i + 1; j < provided.size(); j++) {
                if (provided.get(i).equals(provided.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }
}
