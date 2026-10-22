//package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class LottoSuccess {

    public static void main() {
        Random random = new Random();
        ArrayList<Integer> typy = new ArrayList<>();
        int i = 0;
        while (i <= 5) {
            int liczba = random.nextInt(49) + 1;
            if (!typy.contains(liczba)) {
                typy.add(liczba);
                i++;
            }
        }
        ArrayList<Integer> wyniki = new ArrayList<>();
        long liczbaProb = 0;
        int trafienia = 0;
        long start = System.currentTimeMillis();
        while (trafienia != 6) {
            liczbaProb++;
            wyniki.clear();
            i = 0;
            while (i <= 5) {
                int liczba = random.nextInt(49) + 1;

                if (!wyniki.contains(liczba)) {
                    wyniki.add(liczba);
                    i++;
                }
            }
            trafienia = 0;
            for (Integer typ : typy) {
                if (wyniki.contains(typ)) {
                    trafienia++;
                }
            }
        }
        long koniec = System.currentTimeMillis();
        double czasDzialania = koniec - start;
        System.out.println("wygrywajace liczby: " + typy);
        System.out.println("zwycieski kupon: " + wyniki);
        System.out.println("trafiono szostke po " + liczbaProb + " losowaniach ");
        System.out.println("wykonanie programu zajelo: " + czasDzialania / 1000 + " sekund");
    }
}
