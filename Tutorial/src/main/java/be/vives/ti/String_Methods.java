package be.vives.ti;

public class String_Methods {
    public static void main( String[] args )
    {
        //belangrijkste String methods
        String naam = "   Gilles De Leus";
        String andereNaam = "Baron Beulens";
        System.out.println(naam);
        System.out.println(naam.toUpperCase());
        System.out.println(naam.charAt(5));
        System.out.println(naam.trim());
        System.out.println(naam.length());
        System.out.println(naam.charAt(naam.length()-1));
        System.out.println(naam.substring(3,10));
    }

}
