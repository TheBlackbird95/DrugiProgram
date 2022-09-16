package com.bootcamp.nedelja5OOP;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] niz = {44,2,13,233,1};

        selectionSort(niz);

        System.out.println(Arrays.toString(niz));
    }

    public static void selectionSort(int[] niz) {
        for (int j = 0; j < niz.length-1; j++) {

            int min = j;
            for (int i = j; i < niz.length; i++) {
                if (niz[i] < niz[min]) {
                    min = i;
                }

                int temp = niz[j];
                niz[j] = niz[min];
                niz[min] = temp;
            }
        }
    }
}
