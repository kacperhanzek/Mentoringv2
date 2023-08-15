package pl.sii.mentoring;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Random;
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

        System.out.printf(Locale.US, "Wynik dodawania liczby " + x + " oraz liczby " + y + " to " + "%.2f%n", suma);
        System.out.printf(Locale.US, "Wynik odejmowania liczby " + x + " oraz liczby " + y + " to " + "%.2f%n", różnica);
        System.out.printf(Locale.US, "Wynik mnożenia liczby " + x + " oraz liczby " + y + " to " + "%.2f%n", iloczyn);
        System.out.printf(Locale.US, "Wynik dzielenia liczby " + x + " oraz liczby " + y + " to " + "%.2f%n", iloraz);
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
        String symbolDzialania = "+";

        System.out.println("Cześć, jestem kalukatorem który ma 4 możliwości. Dodawanie (+), odejmowanie (-), mnożenie (*) oraz dzielenie (/).\n" +
                "Warunkiem jest użycie liczb rzeczywistych, prawidłowego symbolu działania oraz nie dzielenie przez zero!");
        do {
            System.out.println("Podaj pierwszą liczbę rzeczywistą która nie jest zerem");
            try {
                liczbaUzytkownika = scan.nextInt();
                if (liczbaUzytkownika == 0) {
                    System.out.println("Błąd! Podaj liczbę która nie jest zerem");
                    continue;
                } else {
                    System.out.println("Poprawna liczba, przechodzę do kolejnego kroku");
                    break;
                }
            } catch (InputMismatchException err) {
                System.out.println("Nieprawidłowy znak, podaj liczbę");
                scan.nextLine();
            }
        } while (true);
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
            System.out.println("Podaj pierwszą liczbę rzeczywistą która nie jest zerem");
            try {
                drugaLiczbaUzytkownika = scan.nextInt();
                if (drugaLiczbaUzytkownika == 0) {
                    System.out.println("Błąd! Podaj liczbę która nie jest zerem");
                    continue;
                } else {
                    System.out.println("Poprawna liczba, przechodzę do kolejnego kroku");
                    break;
                }
            } catch (InputMismatchException err) {
                System.out.println("Nieprawidłowy znak, podaj liczbę");
                scan.nextLine();
            }
        } while (true);
        scan.nextLine();

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

    public void ex31() {
        for (int x = 0; x < 10; x++) {
            int y = 3 * x;
            System.out.println("Wynik działania y = 3x dla x równego " + x + " to: " + y);
        }
    }

    public void ex32() {
        int x = 0;
        do {
            if (x < 10) {
                int y = 3 * x;
                x++;
                System.out.println("Wynik działania y = 3x dla x równego " + x + " to: " + y);
            }

        } while (x < 10);
        System.out.println("Koniec pętli");
    }

    public void ex33() {
        int x = 0;
        while (x < 10) {
            int y = 3 * x;
            x++;
            System.out.println("Wynik działania y = 3x dla x równego " + x + " to: " + y);

        }
    }

    public void ex34() {
        for (int x = 0; x < 20; x++) {
            System.out.println("Liczba całkowita to " + (x + 1));
        }
    }

    public void ex35() {
        int x = 0;
        do {
            if (x < 20) {
                System.out.println("Liczba całkowita to " + (x + 1));
                x++;
            }
        } while (x < 20);
    }

    public void ex36() {
        int x = 0;
        while (x < 20) {
            System.out.println("Liczba całkowita to " + (x + 1));
            x++;
        }
    }

    public void ex37() {
        int suma = 0;
        for (int x = 1; x <= 100; x++) {
            suma = suma + x;
        }
        System.out.println("Suma wszystkich liczb całkowitych od 1 do 100 to " + suma);
    }

    public void ex38() {
        int suma = 0;
        int x = 1;
        do {
            if (x <= 100) {
                suma = suma + x;
                x++;
            }
        } while (x <= 100);
        System.out.println("Suma wszystkich liczb całkowitych od 1 do 100 to ;" + suma);
    }

    public void ex39() {
        int suma = 0;
        int x = 1;
        while (x <= 100) {
            suma = suma + x;
            x++;
        }
        System.out.println("Suma wszystkich liczb całkowitych od 1 do 100 to " + suma);
    }

    public void ex310() {
        int suma = 0;
        for (int x = 1; x <= 100; x++) {
            if (x % 2 == 0) {
                suma = suma + x;
            }
        }
        System.out.println("Suma wszystkich liczb parzystych w zakresie od 1 do 100 to : " + suma);
    }

    public void ex311() {
        int suma = 0;
        int x = 1;
        do {
            if (x <= 100) {
                if (x % 2 == 0) {
                    suma = suma + x;
                }
                x++;
            }
        } while (x <= 100);
        System.out.println("Suma wszystkich liczb parzystych w zakresie od 1 do 100 to : " + suma);
    }

    public void ex312() {
        int suma = 0;
        int x = 1;
        while (x <= 100) {
            x++;
            if (x % 2 == 0) {
                suma = suma + x;
            }
        }
        System.out.println("Suma wszystkich liczb parzystych w zakresie od 1 do 100 to : " + suma);
    }

    public void ex313() {
        int suma = 0;
        for (int x = 1; x <= 100; x++) {
            if (x % 2 != 0) {
                suma = suma + x;
            }
        }
        System.out.println("Suma wszystkich liczb nieparzystych w zakresie od 1 do 100 to : " + suma);
    }

    public void ex314() {
        int suma = 0;
        int x = 1;
        do {
            if (x <= 100) {
                if (x % 2 != 0) {
                    x++;
                    suma = suma + x;
                }
            }
        } while (x <= 100);
        System.out.println("Suma wszystkich liczb nieparzystych w zakresie od 1 do 100 to : " + suma);
    }

    public void ex315() {
        int suma = 0;
        int x = 1;
        while (x <= 100) {
            if (x % 2 != 0) {
                suma = suma + x;
            }
            x++;
        }
        System.out.println("Suma wszystkich liczb nieparzystych w zakresie od 1 do 100 to : " + suma);
    }

    public void ex316() {
        int iloscLiczb = 5;
        int x;
        double liczba;
        double suma = 0;
        double min;
        double max;
        System.out.println("Program losuje " + iloscLiczb + " liczb całkowitych od 0 do 99");
        System.out.println("a następnie znajduje najmniejszą i największą");
        System.out.println("oraz oblicza średnia ze wszystkich wylosowanych liczb.");

        Random losowa = new Random();
        min = Math.round(100 * (losowa.nextDouble()));
        System.out.println();
        System.out.print("Wylosowano liczby: " + min + ", ");
        max = min;
        suma = suma + max;


        for (x = 1; x <= iloscLiczb - 1; x++) {
            liczba = Math.round(100 * (losowa.nextDouble()));
            System.out.print(liczba + ", ");
            if (max < liczba) {
                max = liczba;
            }
            if (liczba < min) {
                min = liczba;
            }
            suma = suma + liczba;
        }
        System.out.println();
        System.out.println("Najwieksza liczba to " + max);
        System.out.println("Najmniejsza liczba to " + min);
        System.out.println("Średnia liczb to " + suma / iloscLiczb);
    }

    public void ex317() {
        int iloscLiczb = 5;
        int x = 1;
        double liczba;
        double suma = 0;
        double min;
        double max;
        System.out.println("Program losuje " + iloscLiczb + " liczb całkowitych od 0 do 99");
        System.out.println("a następnie znajduje najmniejszą i największą");
        System.out.println("oraz oblicza średnia ze wszystkich wylosowanych liczb.");

        Random losowa = new Random();
        min = Math.round(100 * (losowa.nextDouble()));
        System.out.println();
        System.out.print("Wylosowano liczby: " + min + ", ");
        max = min;
        suma = suma + max;

        do {
            if (x <= iloscLiczb) {
                liczba = Math.round(100 * (losowa.nextDouble()));
                System.out.print(liczba + ", ");
                if (max < liczba) {
                    max = liczba;
                }
                if (liczba < min) {
                    min = liczba;
                }
                suma = suma + liczba;
                x++;
            }
        } while (x <= iloscLiczb);
        System.out.println();
        System.out.println("Najwieksza liczba to " + max);
        System.out.println("Najmniejsza liczba to " + min);
        System.out.println("Średnia liczb to " + suma / iloscLiczb);
    }

    public void ex318() {
        int iloscLiczb = 5;
        int x = 1;
        double liczba;
        double suma = 0;
        double min;
        double max;
        System.out.println("Program losuje " + iloscLiczb + " liczb całkowitych od 0 do 99");
        System.out.println("a następnie znajduje najmniejszą i największą");
        System.out.println("oraz oblicza średnia ze wszystkich wylosowanych liczb.");

        Random losowa = new Random();
        min = Math.round(100 * (losowa.nextDouble()));
        System.out.println();
        System.out.print("Wylosowano liczby: " + min + ", ");
        max = min;

        while (x <= iloscLiczb) {
            liczba = Math.round(100 * (losowa.nextDouble()));
            System.out.print(liczba + ", ");
            if (max < liczba) {
                max = liczba;
            }
            if (liczba < min) {
                min = liczba;
            }
            suma = suma + liczba;
            x++;
        }
        System.out.println();
        System.out.println("Najwieksza liczba to " + max);
        System.out.println("Najmniejsza liczba to " + min);
        System.out.println("Średnia liczb to " + suma / iloscLiczb);
    }

    public void ex319() {
        int x = 10;
        int wiersze;
        int kolumny;

        System.out.println("Jestem programem który wyświetla tablieczke mnożenia dla liczb od 1 do 100");

        for (wiersze = 1; wiersze <= x; wiersze++) {
            for (kolumny = 1; kolumny <= x; kolumny++) {
                System.out.print(wiersze * kolumny + "\t");
            }
            System.out.println();
        }
    }

    public void ex320() {
        int x = 10;
        int wiersze = 1;
        int kolumny;
        System.out.println("Jestem programem który wyświetla tablieczke mnożenia dla liczb od 1 do 100");
        do {
            kolumny = 1;
            do {
                System.out.print(wiersze * kolumny + "\t");
                kolumny++;
            } while (kolumny <= x);
            wiersze++;
            System.out.println();
        } while (wiersze <= x);

    }

    public void ex321() {
        int x = 10;
        int wiersze = 1;
        int kolumny;

        while (wiersze <= x) {
            kolumny = 1;
            while (kolumny <= x) {
                System.out.print(wiersze * kolumny + "\t");
                kolumny++;
            }
            wiersze++;
            System.out.println();
        }
    }

    public void ex322() {
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.print(letter + " ");
        }
        System.out.println();
        for (char letter = 'Z'; letter >= 'A'; letter--) {
            System.out.print(letter + " ");
        }
    }

    public void ex323() {
        char letterA = 'A';
        char letterZ = 'Z';
        do {
            System.out.print(letterA + " ");
            letterA++;
        } while (letterA <= 'Z');
        System.out.println();
        do {
            System.out.print(letterZ + " ");
            letterZ--;
        } while (letterZ >= 'A');
    }

    public void ex324() {
        char letterA = 'A';
        char letterZ = 'Z';

        while (letterA <= 'Z') {
            System.out.print(letterA + " ");
            letterA++;
        }
        System.out.println();
        while (letterZ >= 'A') {
            System.out.print(letterZ + " ");
            letterZ--;
        }
    }

    public void ex41() {
        int x = 10;
        int i;
        int[] tablica = new int[x];

        for (i = 0; i < 10; i++) {
            tablica[i] = i;
            System.out.println("Tablica[" + i + "] = " + tablica[i]);
        }

    }

    public void ex42() {
        int x = 10;
        int i;
        int t = 0;
        int[] tablica = new int[x];

        for (i = 9; i >= 0; i--) {
            tablica[i] = i;
            System.out.println("Tablica[" + t + "] = " + tablica[i]);
            t++;
        }
    }

    public void ex43() {
        int x = 10;
        int i;
        int[][] macierz = new int[x][x];


        for (i = 0; i < 10; i++) {
            macierz[i][i] = i;
            System.out.println("Tablica[" + i + "][" + i + "] = " + (macierz[i][i] - i + 1));
        }
        System.out.println("Suma wartośći po przękątnej = " + i);

    }

    public void ex43v2() {
        int x = 10;
        int i;
        int j;
        int suma;
        int[][] macierz = new int[x][x];

        for (i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
                if (j == i) {
                    macierz[i][j] = 1;
                } else {
                    macierz[i][j] = 0;
                }
            }
        }
        for (i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
        suma = 0;
        for (i = 0; i < x; i++) {
            suma = suma+macierz[i][i];
        }
        System.out.println("Suma wartosci po przekątnej to " + suma);

    }

    public void ex44() {
        int x = 10;
        int i;
        int j;
        int suma;
        int[][] macierz = new int[x][x];

        for (i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
                if (j == i) {
                    macierz[i][j] = i;
                } else {
                    macierz[i][j] = 0;
                }
            }
        }
        for (i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
        suma = 0;
        for (i = 0; i < x; i++) {
            suma = suma+macierz[i][i];
        }
        System.out.println("Suma wartosci po przekątnej to " + suma);
    }

    public void ex45() {
        int x = 10;
        int i;
        int j;
        int suma;
        int[][] macierz = new int[x][x];

        for (i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
                if (x == i + j + 1) {
                    macierz[i][j] = 1;
                } else {
                    macierz[i][j] = 0;
                }
            }
        }
        for (i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
        suma = 0;
        for (i = 0; i < x; i++) {
            suma = suma+macierz[i][x - i - 1];
        }
        System.out.println("Suma wartosci po przekątnej to " + suma);
    }

    public void ex46() {
        int x = 10;
        int i;
        int j;
        int suma;
        int[][] macierz = new int[x][x];

        for (i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
                if (x == i + j + 1) {
                    macierz[i][j] = i;
                } else {
                    macierz[i][j] = 0;
                }
            }
        }
        for (i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
        suma = 0;
        for (i = 0; i < x; i++) {
            suma = suma+macierz[i][x - i - 1];
        }
        System.out.println("Suma wartosci po przekątnej to " + suma);
    }

    public void ex47() {
        int x = 10;
        int i;
        int j;
        int sumaI;
        int sumaJ;
        int[][] macierz = new int[x][x];

        for (i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
                if (j == 0) {
                    macierz[i][j] = i;
                } else if (j == 1){
                    macierz[i][j] = i*i;
                } else  {
                    macierz[i][j] = 0;
                }
            }
        }
        for (i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
        sumaI = 0;
        for (i = 0; i < x; i++) {
            sumaI = sumaI+macierz[i][0];
        }
        System.out.println("Suma pierwszej kolumny to " + sumaI);

        sumaJ = 0;
        for (i = 0; i < x; i++) {
            sumaJ = sumaJ+macierz[i][1];
        }
        System.out.println("Suma drugiej kolumny to " + sumaJ);

    }

    public void ex48() {
        int x = 10;
        int i;
        int j;
        int sumaI;
        int sumaJ;
        int[][] macierza = new int[x][x];
        int[][] macierzb = new int[x][x];

        System.out.println("Pierwsza tablica 10x10");

        for (i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
                    macierza[i][j] = j;
            }
        }
        for (i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
                System.out.print(macierza[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Przepisuje wartości do drugiej tablicy");
        System.out.println("Druga tablica 10x10");


        for (i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
                macierzb[j][i] = j;
            }
        }
        for (i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
                System.out.print(macierzb[i][j] + " ");
            }
            System.out.println();
        }

    }

}

