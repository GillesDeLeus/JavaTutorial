package be.vives.ti;

import java.util.ArrayList;

public class Arrays_and_arraylist {
    public static void main( String[] args )
    {

     /*definieer een array
    - vaste grootte, moeilijk met sout -> zie output
     */
        String[] food = new String[5];
        food[0] = "tomato";
        food[1] = "lettuce";
        food[2] = "steak";
        food[3] = "eggs";
        food[4] = "nacho's";
        System.out.println(food);
        //we kunnen ook het volgende doen
        String[] fruit = {"lettuce", "tomato"};
        System.out.println(fruit);

        //met Arraylists variabele grootte + handiger in gebruik
        // heeft ook meer methodes om mee te werken.
        ArrayList sports = new ArrayList();
        sports.add("football");
        sports.add("tennis");
        sports.remove("tennis");
        //sports.clear();
        System.out.println(sports.size());
        System.out.println(sports);
        //Generic type casting, wordt gebruikt om gecreeerde objecten op te slaan bv Arraylist<Student> indien we objecten van klasse student willen toevoegen.
        ArrayList<String> lijst = new ArrayList<String>();

        //2D-array
        int [][] location = {{1,2,3},{10,20,30},{100,200,300}};

        System.out.println(location[0][0]);

        int[][] location2 = new int[5][5];
        location2[0][0] = 5;
        //gebruikt om alle elementen in array te overlopen.
        for (int a = 0;a < 5;a++){
            for(int b = 0;b < 5;b++){
                System.out.println(location2[a][b]);
            }
        }
    }
}
