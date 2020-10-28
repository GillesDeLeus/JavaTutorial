package be.vives.ti;

import java.util.Enumeration;
import java.util.Scanner;

/*
*Used for things that never change.
*/
public enum Enumeration1 {
    CHOCOLATE, VANILLA, COOKIES;
}

class Enumeration2 {
    public static void main( String[] args ) {
        Enumeration1 flav = Enumeration1.VANILLA;

        if (flav == flav.VANILLA){
            System.out.println("vanilla");
        }
        else {
            System.out.println("no vanilla");
        }
    }

}
