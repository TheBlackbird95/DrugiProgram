package com.bootcamp.nedelja2;

public class ZadatakDragoljubOduzimanje {
    public static void main(String[] args) {
        int[] niz = {1, 3, 6, 9, 8};

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < niz.length; j++) {
                if (i == niz[j]) {
                    break;
                } else if (j == niz.length - 1) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
