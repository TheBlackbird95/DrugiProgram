package com.bootcamp.nedelja3;

import java.util.Scanner;

public class ZadatakRandom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite manji broj: ");
        int x = s.nextInt();
        System.out.print("Unesite veci broj: ");
        int y = s.nextInt();
        System.out.println(random(x,y));
    }
    public static int random( int x, int y){
        return (int) ((Math.random() * (y - x + 1)) + x);
    }
}
