package pl.sii.mentoring;

import org.w3c.dom.ls.LSOutput;

public class silnia {

    public static long silniaD (int x) {
        if (x <= 1) {
            return 1;
        } else {
            return x * silniaD(x - 1);
        }
    }



}
