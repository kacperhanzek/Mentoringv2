package pl.sii.mentoring;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercises {
    public void ex11() {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double poleProstokata = a * b;
        System.out.println(poleProstokata);
    }
    public void ex12() {
        Double Pi = Math.PI;
        String sformatowanePi = String.format("%.5f", Pi);
        System.out.println(sformatowanePi);
    }

    public void ex13() {
        double PI = Math.PI;
        double pierwiastekZPi = Math.sqrt(PI);
        System.out.println(pierwiastekZPi);
        String sformatowanyPierwiastek = String.format("%.2f", pierwiastekZPi);
        System.out.println(sformatowanyPierwiastek);
    }
    public void ex14() {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double V = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        String formatedV = String.format("%.2f", V);
        System.out.println("Objętość kuli o premieniu " + r + " to " + formatedV);
    }

    public void ex15() {
        int a = 37;
        int b = 11;
        int dzielenie = a / b;
        System.out.println("Wynik dzielenie liczby " + a + " oraz liczby " + b + " to " + dzielenie);
    }

    public void ex16() {
        int a = 37;
        int b = 11;
        int reszta = a % b;
        System.out.println("Reszta z dzielenia liczby " + a + " oraz liczby ," + b + " to " + reszta);
    }

    public void ex17() {
        Scanner scan = new Scanner(System.in);
        float x = scan.nextFloat();
        float y = scan.nextFloat();

        float suma = x + y;
        float różnica = x - y;
        float iloczyn = x * y;
        float iloraz = x / y;

        System.out.printf(Locale.US, "Wynik dodawania liczby " + x + " oraz liczby " + y  + " to " + "%.2f%n", suma);
        System.out.printf(Locale.US, "Wynik odejmowania liczby " + x + " oraz liczby " + y  + " to " + "%.2f%n", różnica);
        System.out.printf(Locale.US, "Wynik mnożenia liczby " + x + " oraz liczby " + y  + " to " + "%.2f%n", iloczyn);
        System.out.printf(Locale.US, "Wynik dzielenia liczby " + x + " oraz liczby " + y  + " to " + "%.2f%n", iloraz);
    }

    public void jk1() {
        Scanner scan = new Scanner(System.in);
        float stopnieC = scan.nextFloat();
        double stopnieF = stopnieC * 1.8 + 32;
        System.out.println("Termometr wskazuje dziś " + stopnieC + " stopni Celsjusza " + "co daje po konwersji " + stopnieF + " stopni Fahrenheita");
    }

    public void jk2() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);

        System.out.println("Użytkownik podał trzy liczby: " + a + "," + b + "," + c + ". Najwieksza z nich to " + max + ". Natomiast najmniejsza " + min);
    }

    public void jk3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wage w kg");
        double waga = scan.nextDouble();
        System.out.println("Podaj wzrost w metrach");
        double wzrost = scan.nextDouble();

        double BMI = waga / Math.pow(wzrost, 2);
        System.out.printf("Twoje BMI jest na poziomie " + "%.1f%n", BMI);
        if (BMI > 18.5 && BMI < 24.9) {
            System.out.println("Waga prawidłowa");
        } else if (BMI < 18.5) {
            System.out.println("Niedowaga");
        } else if (BMI > 24.9) {
            System.out.println("Nadwaga");
        }
    }

    public void jk4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dochód w złotówkach");
        double dochod = scan.nextDouble();

        if (dochod < 85528) {
            double niskiPodatek = (dochod * 0.18) - 556.02;
            System.out.println("Podatek wynosi " + niskiPodatek + " zł");
        } else if (dochod > 85528) {
            double trzyDwa = (dochod - 85528) * 0.32;
            double wysokiPodatek = 14839.02 + trzyDwa;
            System.out.printf("Podatek wynosi %.2f zł", wysokiPodatek);
        }
    }

    public void jk5() {
        Scanner scan = new Scanner(System.in);
        double wartoscTowaru;
        double iloscRat;
        double oprocentowanie = 0;

        do {
            System.out.println("Podaj cene towaru w zakresie od 100 do 10000 zł");
            wartoscTowaru = scan.nextDouble();

            if (wartoscTowaru < 100 || wartoscTowaru > 10000) {
                System.out.println("Wartość nieprawidłowa, użyj wymaganego zakresu");
            }
        } while (wartoscTowaru <= 100 || wartoscTowaru >= 10000);
        System.out.println("Wartość prawidłowa, przejdź do kolejnego kroku");

        do {
            System.out.println("Ilość rat, która Cię interesuje, w zakresie od 6 do 48");
            iloscRat = scan.nextDouble();
            if (iloscRat < 6 || iloscRat > 48) {
                System.out.println("Wartość nieprawidłowa, użyj wymaganego zakresu");
            }
        } while (iloscRat <= 6 || iloscRat >= 48);
        System.out.println("Wartość prawidłowa, przechodzimy do kalkulacji");

        if (iloscRat >= 6 && iloscRat <= 12) {
            oprocentowanie = 0.025;
        } else if (iloscRat > 12 && iloscRat <= 24) {
            oprocentowanie = 0.05;
        } else if (iloscRat > 24 && iloscRat <= 48) {
            oprocentowanie = 0.1;
        }

        double kwotaZOprocentowaniem = (wartoscTowaru * oprocentowanie) + wartoscTowaru;
        System.out.println("Całkowita kwota do spłatu to " + kwotaZOprocentowaniem);
        double kwotaRaty = kwotaZOprocentowaniem / iloscRat;
        System.out.println("Kredyt składa się z " + iloscRat + " rat." + " Każda rata będzie kosztować " + kwotaRaty + "zł");
        double kosztKredytu = kwotaZOprocentowaniem - wartoscTowaru;
        System.out.println("Koszt kredytu nie wliczając ceny produktu to " + kosztKredytu + "zł");
    }

    public void jk6() {
        Scanner scan = new Scanner(System.in);
        int liczbaUzytkownika = 0;
        int drugaLiczbaUzytkownika = 0;
        int dzialanie = 0;
        int error = 0;
        String symbolDzialania = "+";

        System.out.println("Cześć, jestem kalukatorem który ma 4 możliwości. Dodawanie (+), odejmowanie (-), mnożenie (*) oraz dzielenie (/).\n" +
                "Warunkiem jest użycie liczb rzeczywistych, prawidłowego symbolu działania oraz nie dzielenie przez zero!");
        do {
            System.out.println("Podaj pierwszą liczbę rzeczywistą która nie jest zerem");
            try {
                liczbaUzytkownika = scan.nextInt();
            } catch (InputMismatchException err) {
                System.out.println("Nieprawidłowy znak, podaj liczbę");
                error = 1;
            }

            if (liczbaUzytkownika != 0) {
                System.out.println("Poprawna liczba, przechodze do kolejnego kroku");
            } else {
                System.out.println("Bład! Podaj liczbę która nie jest zerem");
            }
        } while (liczbaUzytkownika == 0 && error == 1);
        scan.nextLine();
        do {
            System.out.println("Podaj symbol działania. Dodawanie (+), odejmowanie (-), mnożenie (*) oraz dzielenie (/)");
            symbolDzialania = scan.nextLine();

            switch (symbolDzialania) {
                case "+":
                case "-":
                case "*":
                case "/":
                    System.out.println("Poprawny symbol działania: " + symbolDzialania);
                    break;
                default:
                    System.out.println("Nieprawidłowy symbol działania. Spróbuj ponownie.");
            }
        } while (!symbolDzialania.equals("+") && !symbolDzialania.equals("-") && !symbolDzialania.equals("*") && !symbolDzialania.equals("/"));

        do {
            System.out.println("Podaj drugą liczbę rzeczywistą która nie jest zerem");
            try {
                drugaLiczbaUzytkownika = scan.nextInt();
            } catch (InputMismatchException err) {
                System.out.println("Nieprawidłowy znak, podaj liczbę");
            }

            if (drugaLiczbaUzytkownika != 0) {
                System.out.println("Poprawna liczba, przechodzę do kalkulacji");
            } else {
                System.out.println("Bład! Podaj liczbę która nie jest zerem");
            }
        } while (drugaLiczbaUzytkownika == 0);

        if (symbolDzialania.equals("+")) {
            dzialanie = liczbaUzytkownika + drugaLiczbaUzytkownika;
        } else if (symbolDzialania.equals("-")) {
            dzialanie = liczbaUzytkownika - drugaLiczbaUzytkownika;
        } else if (symbolDzialania.equals("*")) {
            dzialanie = liczbaUzytkownika * drugaLiczbaUzytkownika;
        } else if (symbolDzialania.equals("/")) {
            dzialanie = liczbaUzytkownika / drugaLiczbaUzytkownika;
        }

        System.out.println("Wynik twojego działania to: " + liczbaUzytkownika + symbolDzialania + drugaLiczbaUzytkownika + " = " + dzialanie);
    }
}
