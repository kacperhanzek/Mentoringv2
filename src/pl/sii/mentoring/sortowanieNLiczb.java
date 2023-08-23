package pl.sii.mentoring;

public class sortowanieNLiczb {

    public void czytaj_dane(int[] liczby, int n) {
        int i;

        liczby[0] = 9;
        liczby[1] = 3;
        liczby[2] = 2137;
        liczby[3] = 997;
        liczby[4] = 1025;
        liczby[5] = 234;

        System.out.print("Liczby nie posortowane to :");

        for (i = 0; i < n; i++) {
            if (i < n - 1) {
                System.out.print(liczby[i] + ", ");
            } else
                System.out.print(liczby[i] + ".");
        }
        System.out.println();
    }

    public void przetworz_dane(int[] liczby, int n) {
        int i;
        int j;
        int x;
        for (i = 1; i <= n - 1; i++) {
            for (j = n - 1; j >= i; --j) {
                if (liczby[j - 1] > liczby[j]) {
                    x = liczby[j - 1];
                    liczby[j - 1] = liczby[j];
                    liczby[j] = x;
                }
            }
        }
    }
    public void wyswietl_wynik(int [] liczby, int n) {
        int i;
        System.out.print("Liczby posortowane to : ");
        for (i = 0; i < n; i++) {
            if (i < n - 1) {
                System.out.print(liczby[i] + ", ");
            } else {
                System.out.print(liczby[i] + ".");
            }
        }
        System.out.println();
    }
}
