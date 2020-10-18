package be.vives.ti;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time_And_Date {
    public static void main( String[] args ) {
        //import java.util.Date
        Date currentDate = new Date();
        System.out.println(currentDate);
        //date formatting
        //import java.text.SimpleDateFormat

        // https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeFormat.format(currentDate));

        SimpleDateFormat newFormat = new SimpleDateFormat("MM/dd/yy");
        System.out.println(newFormat.format(currentDate));

    }
}
