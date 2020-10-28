package be.vives.ti;

//Abstract class helpt normale classes te maken, kan geen object van abstract class maken
abstract class dog {
    String breed;

    public void bark() {
        System.out.println("bark");
    }

    // abstract method moet een klasse die abstract extend ook hebben.
    public abstract void breed();
}
class poedel extends dog {

    @Override
    public void breed() {
        System.out.println("breeding...");
    }
}

public class Abstraction {

    public static void main(String[] args) {

    }
}

