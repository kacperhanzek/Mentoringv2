package pl.sii.mentoring;

import java.io.BufferedReader;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {

//        Exercises exercises = new Exercises();
//        exercises.ex44();
//        pole_prostokata pole = new pole_prostokata();
//        pole.czytaj_dane();
//        pole.przetworz_dane();
//        pole.wyswietl_wynik();
//        pierwiastki_kwadratowe pierwiastek = new pierwiastki_kwadratowe();
//        pierwiastek.czytajDane();
//        pierwiastek.przetworzDane();
////        pierwiastek.wyswietlWynik();
        macierzRandom mr = new macierzRandom();
        mr.czytaj_dane();
        mr.przetworz_dane();
        mr.wyswietl_wynik();
    }
}
