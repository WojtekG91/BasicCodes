package ZadaniaTablice;

public class Zadanie2 {
    public static void main(String[] args) {
        int[] liczby = {1, 3, 4, 2, -20, -5, -6, -10, -2, -20, -100};

        int wartMin = liczby[0];
//        for (int i = 0; i < liczby.length; i++) {
//            for (int j = 0; j < liczby.length ; j++) {
//                if (liczby[j]<liczby[i]){
//                    wartMin = liczby[j];
//                }
//            }
//        }
        for (int anInt : liczby){
            if(wartMin>anInt){
                wartMin = anInt;
            }
        }

        System.out.println(wartMin);
    }
}
