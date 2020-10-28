package be.vives.ti;

import java.util.Iterator;
import java.util.HashSet;

public class HashSett {
    public static void main( String[] args )
    {

        HashSet<String> h = new HashSet<String>();
        h.add("Gilles");
        h.add("Mitch");
        h.add("Max");
        System.out.println(h);

        //h.remove("Mitch");
        //System.out.println(h);

        System.out.println(h.size());

        System.out.println(h.contains("Max"));

        System.out.println(h.isEmpty());

        //Iterator

        Iterator<String> it = h.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
