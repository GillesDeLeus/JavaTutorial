package be.vives.ti;

import java.sql.SQLOutput;
import java.util.HashMap;


public class HashmapsT {
    public static void main( String[] args )
    {
    //import java.util.HashMap
    /*Hashmap stores Key-value pairs
    1ste waarde is "naam"
    2de waarde is value
    HASHMAPS zijn unordered -> groot verschil
     */
    HashMap<String,Integer> map1 = new HashMap<String,Integer>( );
    map1.put("Gilles",1);
    map1.put("mitch", 2);
    map1.put("luke",3);
    System.out.println(map1);
    map1.remove("Luke");
    //get value of Key:
    System.out.println(map1.get("Gilles"));
    System.out.println(map1.containsValue(1));
    System.out.println(map1.containsKey("luke"));
    System.out.println(map1.size());
    System.out.println(map1.replace("mitch",4));
    System.out.println(map1.values());
    System.out.println(map1.keySet());


    }
}
