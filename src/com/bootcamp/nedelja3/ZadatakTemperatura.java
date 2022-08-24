package com.bootcamp.nedelja3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ZadatakTemperatura {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite temperaturu u Celzijusu: ");
        double c = s.nextDouble();
        temperatura(c);
    }
    public static double temperatura (double c){
        DecimalFormat format = new DecimalFormat("#.000");
        double f = c * 1.8 + 32;
        System.out.println("Temperatura " + c + " C je " + format.format(f) + " F");
        return f;
    }
}

// potpis metode - tip promenljive (double), ime metode (temperatura), povratni tip podatka (double c)