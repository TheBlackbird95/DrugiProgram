package com.bootcamp.nedelja3;

public class Metode {
    public static void main(String[] args) {
        System.out.println("Pocetak programa...");
//        int x = 5;
//        int y = 5;
//        int proizvod = x * y;
//        System.out.println(proizvod);
//
//        int x2 = 10;
//        int y2 = 10;
//        int proizvod2 = x2 * y2;
//        System.out.println(proizvod2);
        int rezultat = proizvod (2,3);
        long rezultat1 = (long) proizvod(5,6);
        System.out.println("Kraj programa");
    }

    public static int/*povrati tip metode/returntype*/ proizvod(int x, int y /*  */){
        //apstrakcija, mogucnost ponovnog koriscenja bloka koda - reusability, lakse otkljanjanje greske
        //metoda pravi kopije argumenata i cuva ih u promenljive x i y
        //x i y se nazivaju lokalne promenljive osto su lokalne za ovu metodu

        int proizvod = x * y;
        System.out.println(proizvod);
        return proizvod; //vraca vrednost promenljive 'proizvod'
    }
}
