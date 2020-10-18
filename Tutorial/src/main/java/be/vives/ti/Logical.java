package be.vives.ti;

public class Logical {
    public static void main( String[] args )
    {
        int i = 5;
        int o = 10;
        //and operator
        if (i == 5 && o == 10){
            System.out.println(i);
        }
        //or operator
        if (i == 5 || o == 10){
            System.out.println(i);
        }
        //not operator = negatie
        if (!(i == 5)){
            System.out.println(i);
        }

    }
}
