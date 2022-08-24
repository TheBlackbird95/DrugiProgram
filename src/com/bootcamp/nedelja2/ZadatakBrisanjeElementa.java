package com.bootcamp.nedelja2;


import java.util.Arrays;
import java.util.Scanner;

public class ZadatakBrisanjeElementa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    int[] niz = {0,1,2,3,4,5};
        System.out.print("Unesite index koji zelite da obrisete: ");
    int index = s.nextInt();
    int[] noviNiz = new int[niz.length-1];
    int j=0;

    for (int i = 0; i< niz.length; i++){
        if (i!=index){
            noviNiz[j] = niz[i];
            j++;
        }
    }

        System.out.println(Arrays.toString(noviNiz));
    }
}
