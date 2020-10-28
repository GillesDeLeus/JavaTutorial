package be.vives.ti;

/* Comment input door scanner uit om werking programma te zien.
* */

import java.io.*;
import java.nio.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

public class Input_Output {
    public static void main(String[] args) throws IOException{
        File x = new File("C:/Users/Laptop_Thuis_1/Desktop/TestFile.txt"); //maak file object

        //Naar een bestand schrijven
        try {
            FileWriter writer = new FileWriter(x); // maak nieuwe FileWriter.
            writer.write("sjaloom");           // Schrijf naar het bestand.
            writer.write("\n" + "wereld");
            writer.close();                       // Sluit het bestand zodat het wordt opgeslagen
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (EOFException e) {
            System.out.println("End of File exception");
        }


        //een bestand lezen
        Charset charset = Charset.forName("US-ASCII");
        Path path = Paths.get("C:/Users/Laptop_Thuis_1/Desktop/TestFile.txt");
        try (BufferedReader reader = Files.newBufferedReader(path,charset)){
            String line = reader.readLine();
            System.out.println(line);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (EOFException e) {
            System.out.println("End of File exception");
        } catch (IOException e) {
            System.out.println("A problem has occured with I/O.");
        }

        //input door Scanner
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Vul een getal in.");
        String inputline = scanner2.nextLine();
        System.out.println(inputline);
        try {
            FileWriter writer = new FileWriter(x); // maak nieuwe FileWriter.
            writer.write(inputline);               // Schrijf naar het bestand.
            writer.close();                       // Sluit het bestand zodat het wordt opgeslagen
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (EOFException e) {
            System.out.println("End of File exception");
        }

        //output door scanner
        Scanner scanner = new Scanner(x);
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
        
    }
}


