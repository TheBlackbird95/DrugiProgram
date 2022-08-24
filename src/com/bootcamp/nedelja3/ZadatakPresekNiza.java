package com.bootcamp.nedelja3;

import java.util.Arrays;
import java.util.Scanner;

public class ZadatakPresekNiza {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite duzinu prvog niza: ");
        int n1 = s.nextInt();
        int[] niz1 = new int[n1];
        for (int i = 0; i<niz1.length; i++){
            System.out.print("Unesite " + (i+1) + ". element niza: ");
            niz1[i] = s.nextInt();
        }

        System.out.print("Unesite duzinu drugog niza: ");
        int n2 = s.nextInt();
        int[] niz2 = new int[n2];
        for (int i = 0; i<niz2.length; i++){
            System.out.print("Unesite " + (i+1) + ". element niza: ");
            niz2[i] = s.nextInt();
        }

        System.out.println("Niz 1 je: " + Arrays.toString(niz1));
        System.out.println("Niz 2 je: " + Arrays.toString(niz2));
        System.out.println("Presek dva niza sa ponavljanjima je: " + Arrays.toString(noviNiz(niz1, niz2)));

        System.out.println("Presek dva niza bez duplikata je: " + Arrays.toString(nizBezNula(niz1, niz2)));
    }

    //broji koliko ima istih cifara ima u oba niza
    public static int brojac(int[] niz1, int[] niz2) {
        int brojacIstih = 0;

        for (int i = 0; i < niz1.length; i++) {
            for (int j = 0; j < niz2.length; j++) {
                if (niz1[i] == niz2[j]) {
                    brojacIstih++;
                }
            }
        }
        return brojacIstih;
    }

    //pravi niz preseka sa duplim brojevima
    public static int[] noviNiz(int[] niz1, int[] niz2) {
        int brojacIstih = brojac(niz1, niz2);
        int[] noviNiz = new int[brojacIstih];
        int k = 0;
        for (int i = 0; i < niz1.length; i++) {
            for (int j = 0; j < niz2.length; j++) {
                if (niz1[i] == niz2[j]) {
                    noviNiz[k] = niz1[i];
                    k++;
                }
            }
        }
        return noviNiz;
    }

    //broji duple brojeve u nizu sa duplim brojevima
    public static int brojacDuplikati(int[] noviNiz) {
        int brojacDuplih = 0;
        for (int i = 0; i < noviNiz.length; i++) {
            for (int j = 0; j < noviNiz.length; j++) {
                if (i != j && noviNiz[i] == noviNiz[j]) {
                    brojacDuplih++;
                }
            }
        }
        return brojacDuplih;
    }

    //broji koliko istih cifara u nizu 1 i nizu 2
    public static int brojacIstihUNizu(int[] niz1, int[] niz2) {
        int brojacNiz1 = 0;
        for (int i = 0; i < niz1.length; i++) {
            for (int j = 0; j < niz1.length; j++) {
                if (niz1[i] == niz1[j]) {
                    brojacNiz1++;
                }
            }
        }
        int brojacNiz2 = 0;
        for (int i = 0; i < niz2.length; i++) {
            for (int j = 0; j < niz2.length; j++) {
                if (niz2[i] == niz2[j]) {
                    brojacNiz2++;
                }
            }
        }
        return brojacNiz1 + brojacNiz2;
    }

    //brise duple brojeve ali ima nule
    public static int[] nizBezDuplih(int[] niz1, int[] niz2) {
        int[] noviNiz = noviNiz(niz1, niz2);
        int brojac = brojacDuplikati(noviNiz);
        int brojacIstih = brojacIstihUNizu(niz1, niz2);
        int[] kraj = new int[noviNiz.length - (brojac / brojacIstih)];

        for (int i = 0, k = 0; i < noviNiz.length; i++) {
            boolean nijeIstaRec = true;
            for (int j = 0; j < kraj.length; j++) {
                if (noviNiz[i] == kraj[j]) {
                    nijeIstaRec = false;
                    break;
                }
            }
            if (nijeIstaRec) {
                kraj[k] = noviNiz[i];
                k++;
            }
        }

        return kraj;
    }

        //broji nule i radi kopiju
    public static int[] nizBezNula(int[] niz1, int[] niz2){
        int brojacNula = 0;
        int[] kraj = nizBezDuplih(niz1, niz2);
        for (int i = 0; i < kraj.length; i++){
            if (kraj[i] == 0){
                brojacNula++;
            }
        }
        return Arrays.copyOf(kraj, kraj.length-brojacNula);
     }
}
