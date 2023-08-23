package pl.sii.mentoring;

import java.util.Scanner;

public class pierwiastki_kwadratowe {

    double a, b, c, x, x2, delta;
    char liczbaPierwiastkow;

    public void czytajDane() {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Podaj a");
            a = scan.nextDouble();
            if (a == 0) {
                System.out.println("Niepoprawna liczba, a nie może się równac 0");
                continue;
            } else {
                System.out.println("Podaj b");
            }
        } while (a == 0);
        b = scan.nextDouble();
        System.out.println("Podaj c");
        c = scan.nextDouble();
    }

    public void przetworzDane() {
        delta = b * b - 4 * a * c;
        if (delta < 0) {
            liczbaPierwiastkow = 0;
        } else if (delta == 0) {
            liczbaPierwiastkow = 1;
        } else if (delta > 0) {
            liczbaPierwiastkow = 2;
        }

        switch (liczbaPierwiastkow) {
            case 1:
                x = -b/(2 * a);
                break;
            case 2: {
                x = (-b-Math.sqrt(delta))/(2 * a);
                x2 = (-b+Math.sqrt(delta))/(2 * a);
            }
            break;
        }
    }

    public void wyswietlWynik() {
        String sformatowanyWynik = String.format("A: %.2f, B: %.2f, C: %.2f", a, b, c);
        System.out.println(sformatowanyWynik);

        switch (liczbaPierwiastkow) {
            case 0:
                System.out.println("Brak pierwiastków");
                break;
            case 1:
                System.out.printf("Wystepuje jeden pierwiastek:" + "x = " + "%.2f", x);
                break;
            case 2: {
                System.out.println("Wystepuja dwa pierwiastki: ");
                System.out.printf("x = " + "%.2f,\n", x);
                System.out.printf("x2 = " + "%.2f", x2);
            }
            break;
        }
    }
}