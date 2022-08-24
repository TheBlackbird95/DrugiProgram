package com.bootcamp.nedelja2;

public class DragoljubZbirUNizu {
    public static void main(String[] args) {
        int[] niz = {0, 5, 1, 6, 4, 6};
        int sum = 0;
        for (int i = 0; i< niz.length; i++){
            if (i<niz[i]){
                sum += niz[i];
            }
        }
        System.out.println("Suma je: " + sum);
    }
}
