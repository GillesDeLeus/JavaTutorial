package be.vives.ti;

/*
* interface bepaalt welke methods een class MOET hebben.
* */
interface Interface1 {
    String color = "Red";

    void useColor();

}

class Interface2 implements Interface1 {
    public static void main( String[] args ) {
        System.out.println(color);
        Interface2 in = new Interface2();
        in.useColor();
            }
    @Override
    public void useColor() {

    }
}
