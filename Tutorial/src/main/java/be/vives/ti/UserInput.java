package be.vives.ti;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput {
    public static void main( String[] args ){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input");
        String input = scan.nextLine();
        System.out.println(input);
    }
}
