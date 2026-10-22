//package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;

public class LottoUserInput {

    public static void main(String[] args) {
        if (args.length != 6) {
            System.out.println("podaj dokladnie 6 liczb");
            return;
        }
        ArrayList<Integer> typy = new ArrayList<>();
        for (String arg : args) {
            try {
                int typ = Integer.parseInt(arg);
                if (typ < 1 || typ > 49) {
                    System.out.println("podaj liczby z zakresu 1-49");
                    return;
                }
                if (typy.contains(typ)) {
                    System.out.println("podaj unikalne liczby");
                    return;
                }
                typy.add(typ);
            } catch (NumberFormatException e) {
                System.out.println("podaj tylko liczby calkowite");
                return;
            }
        }
        Random random = new Random();
        ArrayList<Integer> wyniki = new ArrayList<>();
        int i = 0;
        while (i <= 5) {
            int liczba = random.nextInt(49) + 1;

            if (!wyniki.contains(liczba)) {
                wyniki.add(liczba);
                i++;
            }
        }
        int traf = 0;
        for (Integer typ : typy) {
            if (wyniki.contains(typ)) {
                traf++;
            }
        }
        System.out.println("typy uzytkownika: " + typy);
        System.out.println("liczby wylosowane: " + wyniki);
        System.out.println("trafionych: " + traf);
    }
}
