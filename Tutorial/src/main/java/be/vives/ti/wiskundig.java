package be.vives.ti;

public class wiskundig {
    public static void main( String[] args ){
        //exponent en vierkantswortel.
        double exponent = Math.pow(2,3);
        int squareRoot = (int) Math.sqrt(16);

        System.out.println(exponent);
        System.out.println(squareRoot);

        //modulus = restwaarde -> 10/4 = 2 (+ 2 rest = modulus)
        int i = 10%4;
        System.out.println(i);

    }
}
