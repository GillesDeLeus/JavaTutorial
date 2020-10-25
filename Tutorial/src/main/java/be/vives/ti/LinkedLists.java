package be.vives.ti;

import java.util.Iterator;
import java.util.LinkedList;

/*  Een LinkedList weet de vorige waarde en de volgende waarde
*
* */

public class LinkedLists {
    public static void main(String[] args) {

        LinkedList<String> listy = new LinkedList<String>();
        listy.add("gilles");
        listy.add("robje");
        listy.add("makke");

        System.out.println(listy);

        Iterator it = listy.iterator();
        while(it.hasNext()) {
            if ((String)it.next() == "robje"){
                System.out.println("robje");
            }
        }
    }
}
