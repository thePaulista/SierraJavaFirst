package com.JavaStart;

public class Main {

    public static void main(String[] args) {

        // while loop
        int x = 1;
        System.out.println("Before the loop");
        while (x < 4) {
            System.out.println("In the loop");
            System.out.println("Value of x is " +  x);
                x = x + 1;
        }
        System.out.println("This is outside the loop");

        // Conditional branching - simple
        int y = 3;
        if ( y == 3 ) {
            System.out.println("y must be 3");
        }
        System.out.println("This runs no matter what");

        // conditional branching
        int z = 2;
        if (z == 3 ) {
            System.out.println("z must be 3");
        }  else {
            System.out.println("z is NOT 3");
        }
    }
}
