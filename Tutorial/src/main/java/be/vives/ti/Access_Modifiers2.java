package be.vives.ti;

public class Access_Modifiers2 {
    public static void main( String[] args )
    {
        Access_Modifiers1 a = new Access_Modifiers1();
        System.out.println(a.hours);
        System.out.println(a.minutes);
        // System.out.println(a.seconds);   //werkt niet want private.
        System.out.println(a.miliseconds);  //protected geeft toegang als in zelfde package zit. tenzij subclasses
        System.out.println(a.getHours());
        //System.out.println(a.getMinutes()); //Werkt niet want private
        System.out.println(a.getSeconds()); //werkt wel want method is public
    }
}
