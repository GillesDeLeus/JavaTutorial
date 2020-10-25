package be.vives.ti;

import java.io.IOException;

/* ongecontroleerde exceptions:
* ArithmeticException
* ArrayIndexOutOfBoundsException
* ClassNotFoundException
* IOException
* InterruptedException
* NoSuchFieldException
* NoSuchMethodException
* NumberFormatException
* RuntimeException
* StringIndexOutOfBoundsException
* */
public class FoutAfhandeling {
    public static void main(String[] args) {
        try {
        String str = null;
        System.out.println(str.length());
        }
        catch (Exception e){
            System.out.println("length is undefined for null");
        }
        finally {
            System.out.println("finally is always excecuted");
        }

        try {
            substract();
        } catch (ArithmeticException e) {
            System.out.println("error");
        }
    }

    public static void substract() throws ArithmeticException{
        int a = 5;
        int b = 0;
        int c = a/b;
    }
    //creëer een eigen exception
    public class NewException extends Exception{
    }
}
