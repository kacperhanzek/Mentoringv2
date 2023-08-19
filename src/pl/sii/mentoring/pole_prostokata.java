package pl.sii.mentoring;

import java.util.Scanner;

public class pole_prostokata {

    double a;
    double b;
    double pole;

    public void czytaj_dane() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj bok A");
        a = scan.nextDouble();
        System.out.println("Podaj bok B");
        b = scan.nextDouble();
    }

    public void przetworz_dane() {
        pole = a * b;
    }

    public void wyswietl_wynik() {
        String sformatowanyWynik = String.format("Bok A: %.2f, Bok B: %.2f, Pole tego prostokąta to: %.2f", a, b, pole);
        System.out.println(sformatowanyWynik);

    }
}
