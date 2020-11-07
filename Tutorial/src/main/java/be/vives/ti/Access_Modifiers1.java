package be.vives.ti;

public class  Access_Modifiers1 {

    //default, public, private protected

    int hours = 3;
    public int minutes = 5;
    private int seconds = 10;
    protected int miliseconds = 15;

    public int getHours(){
        return hours;
    }
    private int getMinutes(){
        return minutes;
    }

    public int getSeconds(){
        return seconds;
    }
}
