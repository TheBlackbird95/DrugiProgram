/**
 * MOCK TEST JAVA 1
 * Stavljamo test na lokaciju: https://drive.google.com/drive/folders/1rLfz7gEpb9I0d42yq21Ogpq8J4LQG-xp
 * Vreme trajanja: 1h
 * Ime klase neka vase ime i prezime.
 */

package com.bootcamp.probniTest;

import java.util.Arrays;
import java.util.Scanner;

public class MilosKos {
    /**
     * Implementirati metodu koja vraca motorno vozilo koje odgovara kategoriji.
     * @param kategorija vozacka kategorija
     * A -> "motor"
     * a -> "motor"
     * b -> "automobil"
     * c -> "kamion"
     * d -> "autobus"
     * e -> "kamionSaPrikolicom"
     * @return motorno vozilo koje odgovara kategoriji
     */

    public static String vozackaKategorija(String kategorija) {
        String motornoVozilo;
        switch (kategorija){
            case "a":
                motornoVozilo = "motor";
                break;
            case "b":
                motornoVozilo = "automobil";
                break;
            case "c":
                motornoVozilo = "kamion";
                break;
            case "d":
                motornoVozilo = "autobus";
                break;
            case "e":
                motornoVozilo = "kamion sa prikolicom";
                break;
            default:
                motornoVozilo = "Pogresna kategorija!";
        }

        return motornoVozilo;
    }

    /**
     * Implementirati metodu tako da racuna sumu elemenata stepenovih na dati index u nizu.
     * @param niz ulazni parametar niz
     * {1, 2, 3, 4, 5} -> 1^0 + 2^1 + 3^2 + 4^3 + 5^4
     * {} -> 0
     * {999} -> 999^0
     * @return suma
     */
    public static int sumaStepenaIndexaNiza(int[] niz) {
        int sum = 0;
        int indexBroja = 4;
        for (int i = 0; i < indexBroja; i++){
            sum += Math.pow(niz[i], indexBroja);
        }
        /* trebalo je ovako
        for (int i = 0; i < indexBroja; i++){
        sum += Math.pow(niz[i], i);
        }
         */

        return sum;

        //nisam siguran da li sam razumeo zadatak. Svaki broj u nizu stepenovan na odabrani index se sabira?
        // u ovom slucaju 1^4 + 2^4 + 3^4....
    }

    /**
     * Implementirati metodu koja trazi razliku niza a-b, odnosno, metodu koja vraca
     * sve elemente koji se nalaze u prvom skupu, a ne nalaze se u skupu b.
     * @param a niz a
     * @param b niz b
     * ({1, 2, 3}, {2, 3, 4, 10}) -> {1}
     * ({7, 5, -1}, {9, 5, 6, 3, 2}) -> {-1, 7}
     * ({1, 2, 3}, {}) -> {1, 2, 3}
     *
     * @return razlika nizova a-b
     */
    public static int[] razlikaNizova(int[] a, int[] b) {
        int brojac = 0;
        int[] kraj = new int[a.length];
        for (int i = 0,k = 0; i<a.length; i++){
            boolean tuJe = true;
            for (int j = 0; j<b.length; j++){
                if (a[i] == b[j]){
                    tuJe = false;
                    break;
                }
            }
            if (tuJe){
                kraj[k] = a[i];
                brojac ++;
                k++;
            }
        }

        return Arrays.copyOf(kraj, brojac);
    }


    public static void main(String[] args) {
        // Testovi idu ovde. Pozeljno je dodati i sopstvene pozive sa drugim parametrima.
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite vasu kategoriju: ");
        String kategorija = s.next().toLowerCase();

        System.out.println("Vase vozilo je: " + vozackaKategorija(kategorija));
        System.out.println(sumaStepenaIndexaNiza(new int[]{1, 2, 3, 4, 5}));
        System.out.println(Arrays.toString(razlikaNizova(new int[]{1, 2, 3}, new int[]{2,3,4})));

    }
}
