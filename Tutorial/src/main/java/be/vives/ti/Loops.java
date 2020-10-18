package be.vives.ti;

public class Loops {
    public static void main( String[] args ){
        //while loop
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        //do-while loop
        //belangrijkste verschil: Do-while voert minstens 1 keer uit en checkt na uitvoering body pas naar condition.
        int o = 0;
        do {
            o++;
            System.out.println(o);
        } while (o < 10);

        //if statement
        int p = 5;

        if(p == 5){
            System.out.println("de waarde van p is " + p);
        }
        else if(p > 5){
            System.out.println("de waarde van p is hoger dan 5");
        }
        else {
            System.out.println("de waarde van p is lager dan 5");
        }

        //for loops
        for(int q = 0;q<10;q++){
            System.out.println(q);
        }

        //for-each loop
        //gaat elke waarde in s 1 per 1 afgaan
        int[] s = {1,2,3,4,5};
        for(int x : s){
            System.out.println(x + 10);
            System.out.println(x);
        }

        //switch
        //gaat case per case zoeken, bij elke case MOET break!
        int a = 2;
         switch (a) {
             case 0:
                 System.out.println("nul");
                 break;
             case 1:
                 System.out.println("één");
                 break;
             case 2:
                 System.out.println("Twee");
                 break;
             default:
                 System.out.println("iets anders");
                 break;
         }

    }
}
