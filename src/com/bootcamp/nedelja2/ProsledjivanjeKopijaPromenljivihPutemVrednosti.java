package com.bootcamp.nedelja2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProsledjivanjeKopijaPromenljivihPutemVrednosti {
    public static void main(String[] args) {
      /*  int x = 10;
        System.out.println(x);
        int y = x;
        System.out.println(y);
        x=x+5;
        System.out.println(y);
        System.out.println(x);*/

        int[] dobitnaKombinacija = {30, 21, 1, 2, 5, 6, 20};

        int[] nizX = dobitnaKombinacija;

        nizX[0] = 5;

        System.out.println(Arrays.toString(nizX));
        System.out.println(Arrays.toString(dobitnaKombinacija));

        int [] nizY = Arrays.copyOf(dobitnaKombinacija, dobitnaKombinacija.length);
        nizY[0] = 1;
        System.out.println(Arrays.toString(nizY));
    }
}
