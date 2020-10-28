package be.vives.ti;

import java.util.Scanner;

public class Try_Catch_Examples {
    public static void main( String[] args )
    {

        try{
        int[] a = {1,4,5,8};
        System.out.println(a[4]);
        } catch(Exception e) {
            System.out.println("an exception happend");
        }
        try {
        Scanner scan = new Scanner(System.in);
        System.out.println("type in a number between 1 and 10");
        int n = scan.nextInt();
        System.out.println(n);} catch (Exception r){
            System.out.println("please enter a number ");
        }
    }

}
