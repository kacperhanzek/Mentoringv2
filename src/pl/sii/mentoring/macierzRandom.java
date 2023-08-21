package pl.sii.mentoring;

public class macierzRandom {
    int rozmiar = 10;
    int i;
    int j;
    int suma;
    double[][] macierz = new double[rozmiar][rozmiar];
    String redColorCode = "\u001B[31m";
    String resetColorCode = "\u001B[0m";

    public void czytaj_dane() {
        for (i = 0; i < rozmiar; i++) {
            for (j = 0; j < rozmiar; j++) {
                if (j == i) {
                    macierz[i][j] = (int) (Math.random() * 10);
                } else {
                    macierz[i][j] = 0;
                }
            }
        }
    }

    public void przetworz_dane() {
        suma = 0;
        for (i = 0; i < rozmiar; i++) {
            suma = (int) (suma + macierz[i][i]);
        }
        System.out.println("Suma wartosci po przekątnej to " + redColorCode + suma + resetColorCode);
    }

    public void wyswietl_wynik() {
        for (i = 0; i < rozmiar; i++) {
            for (j = 0; j < rozmiar; j++) {
                if (j == i) {
                    System.out.print(redColorCode + macierz[i][j] + " " + resetColorCode);
                } else {
                    System.out.print(macierz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
