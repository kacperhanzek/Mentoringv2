package pl.sii.mentoring;

import java.io.BufferedReader;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {

    public static void main(String[] args)
    {

//        Exercises exercises = new Exercises();
//        exercises.listy();
//        pole_prostokata pole = new pole_prostokata();
//        pole.czytaj_dane();
//        pole.przetworz_dane();
//        pole.wyswietl_wynik();
        pierwiastki_kwadratowe pierwiastek = new pierwiastki_kwadratowe();
        pierwiastek.czytajDane();
        pierwiastek.przetworzDane();
        pierwiastek.wyswietlWynik();
    }
}