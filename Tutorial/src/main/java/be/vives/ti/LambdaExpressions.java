package be.vives.ti;

import java.util.function.*;


public class LambdaExpressions {

    public static void main(String[] args) {

        //takes one argument, returns boolean
        //using the test method of Predicate
        Predicate<String> stringLen  = (s)-> s.length() < 10;
        System.out.println(stringLen.test("Apples") + " - Apples is less than 10");

        //accepts single argument with no return value
        //Consumer example uses accept method
        Consumer<String> consumerStr = (s) -> System.out.println(s.toLowerCase());
        consumerStr.accept("ABCDefghijklmnopQRSTuvWxyZ");

        //accepts one argument and produces a result
        //Function example
        Function<Integer,String> converter = (num)-> Integer.toString(num);
        System.out.println("length of 26: " + converter.apply(26).length());

        //represents a supplier of results
        //Supplier example
        Supplier<String> s  = ()-> "Java is fun";
        System.out.println(s.get());

        //single argument with a return value
        //Binary Operator example
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("add 10 + 25: " + add.apply(10, 25));

        //takes two arguments and returns one
        //Unary Operator example
        UnaryOperator<String> str  = (msg)-> msg.toUpperCase();
        System.out.println(str.apply("This is my message in upper case"));
    }

}
