package com.bootcamp.nedelja2;

public class ZadatkNizPetlja {
    public static void main(String[] args) {
        // niz od 10 elemenata, proveriti da li su brojevi deljivi sa 3 i/ili 5
        int[] mojNiz = {3, 5, 6, 8, 10, 15, 17, 18, 20, 30};
        for (int i = 0; i < mojNiz.length; i++) {
            System.out.print("Broj " + mojNiz[i]);
            if (mojNiz[i] % 3 == 0  && mojNiz[i] % 5 == 0) {
                System.out.println("  Ovaj broj je deljiv i sa 3, i sa 5");
            } else if (mojNiz[i] % 5 == 0) {
                System.out.println("  Ovaj broj je deljiv sa 5");
            } else if (mojNiz[i] % 3 == 0) {
                System.out.println("  Ovaj broj je deljiv sa 3");
            } else {
                System.out.println("  Ovaj broj nije deljiv ni sa 3 ni sa 5");
            }
        }
    }
}
