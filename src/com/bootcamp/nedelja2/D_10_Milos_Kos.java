package com.bootcamp.nedelja2;

import java.util.Scanner;

public class D_10_Milos_Kos {
    public static void main(String[] args) {
        //Uneti broj ciji faktorijal zelite da izracunate (5! = 5 + 4 + 3 + 2 + 1).

        Scanner s = new Scanner(System.in);
        System.out.print("Uneiste broj ciji faktorijal zelite da izracunate: ");
        int x = s.nextInt();
        faktorijal(x);
    }
    public static int faktorijal(int x){
        int sum = 0;
        if (x>=0){
            for (int i = 0; i<=x; i++){
                sum += i;
            }
        } else {
            for (int i = x; i<= 0; i++){
                sum += i;
            }
        }
        System.out.println("Faktorijal broja " + x + " je " + sum);
        return sum;
    }
}
