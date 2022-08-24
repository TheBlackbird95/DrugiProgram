package com.bootcamp.nedelja3;

public class FizzBuzz {
    public static void main(String[] args) {
        int x = 1;
        int y = 100;
        fizzbuzz(x, y);
    }

    public static void fizzbuzz(int x, int y) {
        int i;
        for (i = x; i <= y; i++) {
            if (i % 15 == 0) {
                System.out.print(" FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print(" Fizz ");
            } else if (i % 5 == 0) {
                System.out.print(" Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
