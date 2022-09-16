/*Kad završite, projekat stavite na lokaciju: https://drive.google.com/drive/folders/1MZXVGRKVc9omcULfI8AOIjGc85DyWW9A
 Projekat treba da bude u jednoj klasi, koja će sadržati sve implementirane metode.
 POTPISI METODA TREBA DA OSTANU ISTI. Ovo će uveliko olakšati pregledanje.
 Ime klase neka bude vaše ime i prezime, npr: PeraPeric.
 Rok za predaju je 4.9.2022. u 23:59 PM.
 Zadaci sa * nisu obavezni.*/

package com.bootcamp.projekat;

import java.util.Arrays;
import java.util.Scanner;

public class Projekat_Milos_Kos {
    //0. Implementirati metode za unos elemenata niza varijabilne dužine. Elementi treba da budu tipa int, String i char.

    public static char[] unosChar(int x) {
        Scanner s = new Scanner(System.in);
        char[] nizChar = new char[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Unesite " + (i + 1) + ". clan niza: ");
            nizChar[i] = s.nextLine().charAt(0);
        }
        return nizChar;
    }

    public static String[] unosString(int x) {
        Scanner s = new Scanner(System.in);
        String[] nizString = new String[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Unesite " + (i + 1) + ". clan niza: ");
            nizString[i] = s.nextLine();
        }
        return nizString;
    }

    public static int[] unosInt(int x) {
        Scanner s = new Scanner(System.in);
        int[] nizInt = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Unesite " + (i + 1) + ". clan niza: ");
            nizInt[i] = s.nextInt();
        }
        return nizInt;
    }

    /*
    1. Implementirati metodu int zbirCifara(int n) koja sabira cifre sve dok rezultat ne bude samo jedna cifra.
    Npr. 1234 -> 1, 43 -> 7, 55 -> 1, 556 -> 7
    */

    public static int zbirCifara(int n) {
        //1234
        int sum = 0;
        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    /*
    2. Implementirati metodu boolean stepenBroja(int n, int m) koja vraća true ukoliko je n stepen broja m.
    Npr: (9, 3) -> true, (125, 5) -> true, (13, 4) -> false
     */

    public static boolean stepenBroja(int n, int m) {
        boolean jesteStepenBroja;
        double stepenBroja = 0;
        for (int i = 0; stepenBroja < n; i++) {
            stepenBroja = Math.pow(m, i);
        }
        if (stepenBroja == n) {
            jesteStepenBroja = true;
        } else {
            jesteStepenBroja = false;
        }
        return jesteStepenBroja;
    }

    /**
    3. Implementirati metodu int[] zbirIndexaNizaMeta(int[] niz, int meta) koja vraća indekse dva elementa koji kada se saberu daju rezultat koji je jednak meti.
    Npr. ({2, 3, 10, -2}, 5) -> {0, 1}
     */

    public static int[] zbirIndexaNizaMeta(int[] niz, int meta) {
        int[] noviNiz = new int[niz.length];
        int k = 0;
        for (int i = 0; i < niz.length; i++) {
            for (int j = i; j < niz.length; j++) {
                if (niz[j] + niz[i] == meta && j != i) {
                    noviNiz[k] = i;
                    k++;
                    noviNiz[k] = j;
                    k++;
                }
            }
        }
        return Arrays.copyOf(noviNiz, k);
    }

    /*
    4. Implementirati metodu String toBinary(int n) koja vraća broj n u binarnom formatu. Uzeti apsolutnu vredost n.
    Npr. 10 -> 1010, 100 -> 1100100
     */

    public static String toBinary(int n) {

        String s = "";
        while (n > 0) {
            s = n % 2 + s;
            n = n / 2;
        }
        return s;

    /*drugi nacin
        return Integer.toBinaryString(n); */
    }

    /*
    5. Implementirati metodu int brojPonavljanja(String s, String recenica) koja vraća broj ponavljanja stringa "s" u rečenici. Hint: istražiti s.split("") metodu.
    Npr. ("cao", "cao kako si cao") -> 2
    */

    public static int brojPonavljanja(String s, String recenica) {
        String[] reci = recenica.split(" ");
        int brojac = 0;
        for (int i = 0; i < reci.length; i++) {
            if (reci[i].equalsIgnoreCase(s)) {
                brojac++;
            }
        }
        return brojac;
    }

    /*
    6. Implementirati metodu int[] pomeriNule(int[] niz) koja vraća niz u kome su sve nule pomerene na kraj niza.
    Npr. {1, 0, 0, 2, 3} -> {1, 2, 3, 0, 0}
    */

    public static int[] pomeriNule(int[] niz) {
        // moze i da se ispisuju brojevi samo ukoliko su razliciti od 0, jer ce sve preostalo biti
        // po default-u 0, ali ne bi radilo u slucaju da se trazi neki drugi broj da bude na kraju
        int[] noviNiz = new int[niz.length];
        for (int i = 0, j = 0, k = 1; i < niz.length; i++) {
            if (niz[i] != 0) {
                noviNiz[j] = niz[i];
                j++;
            } else {
                noviNiz[niz.length - k] = niz[i];
                k++;
            }
        }
        return noviNiz;
    }

    /*
    7. Implementirati metodu int[] izbaciDuplikate(int[] niz) koja vraća niz bez duplikata.
    Npr. {1, 2, 3, 3} -> {1, 2, 3}, {3, 4, 3, 4, 3, 4, 5} -> {3, 4, 5}
     */

    public static int[] izbaciDuplikate(int[] niz) {
        int[] noviNiz = new int[niz.length];
        int brojac = 0;
        for (int i = 0, k = 0; i < niz.length; i++) {
            boolean tuJe = true;
            for (int j = 0; j < noviNiz.length; j++) {
                if (niz[i] == noviNiz[j]) {
                    tuJe = false;
                    break;
                }
            }
            if (tuJe) {
                noviNiz[k] = niz[i];
                brojac++;
                k++;
            }
        }
        return Arrays.copyOf(noviNiz, brojac);
    }

    /*
    8.* Implementirati metodu int[][] powerSet(int[] niz) koja vraća partitivni skup, odnosno, skup svih podskupova niza.
    Npr. {1, 2} -> {{1, 2}, {1}, {2}, {}}, {1, 2, 3} -> {{1, 2, 3}, {1, 2}, {1, 3}, {2, 3}, {1}, {2}, {3}, {}}
     */

//    public static int[][] powerSet(int[] niz) {
//        int brojPonavljanja = (int) Math.pow(2, niz.length);
//        int[][] rezultat = new int[brojPonavljanja][];
//        for (int i = 0; i < brojPonavljanja; ++i) {
//            rezultat[i] = new int[Integer.bitCount(i)];
//            for (int j = 0, b = i, k = 0; j < niz.length; ++j, b >>= 1) //zasto ov b >>= 1
//                if ((b & 1) != 0) //st znaci ovo b & 1
//                    rezultat[i][k++] = niz[j];
//       }
//       return rezultat;
//    }

    /*
    9.* Implementirati metodu boolean validatePhone(String num) koja proverava da li je broj napisan u odgovarajućem formatu.
    Pretpostaviti da se validan telefonski broj može pojaviti u jednom od sledećih formata:
    (xxx) xxx-xxxx ili xxx-xxx-xxxx gde 'x' predstavlja jednu cifru.
    Za ovaj zadatak koristiti regex.
     */

    public static boolean validatePhone(String num) {
        String patterns = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
        boolean patternMatcher;
        patternMatcher = num.matches(patterns);
        return patternMatcher;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // System.out.println("Vas niz je: " + Arrays.toString(unosChar(5)));
        // System.out.println("Vas niz je: " + Arrays.toString(unosString(5)));
        // System.out.println("Vas niz je: " + Arrays.toString(unosInt(5)));
        // System.out.println("Zbir svih cifara je: " + zbirCifara(9999999));
        // System.out.println(stepenBroja(6, 2));
        // System.out.println(Arrays.toString(zbirIndexaNizaMeta(new int[]{2, 3, 5, 10}, 5)));
        // System.out.println(toBinary(10));
        // System.out.println(brojPonavljanja("cao", "Cao cao kako si, caO"));
        // System.out.println(Arrays.toString(pomeriNule(new int[]{1,0,0,2,3})));
        // System.out.println(Arrays.toString(izbaciDuplikate(new int[]{3, 4, 3, 4, 3, 4, 5})));
        // System.out.println(Arrays.deepToString(powerSet(new int[]{1, 2, 3})));
//        System.out.println(validatePhone("0644851346"));
//        System.out.println(validatePhone("(064) 485 1346"));
//        System.out.println(validatePhone("064 485 1346"));
//        System.out.println(validatePhone("064 485 13 46"));
//        System.out.println(validatePhone("(064)-485-1346"));
    }

}
