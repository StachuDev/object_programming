package pl.olszakstanislaw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        if(args.length != 1){
            System.err.println("Sposob uzycia: java Ex3.java nazwaWczytywanegoPliku ");
            System.exit(1);
        }

        System.out.print("Wprowadz wyraz, ktorego ilosc wystapien zliczamy: ");
        String inputString = scan.next();

        File file = new File("C:\\Users\\Dell\\JavaProjects\\po_gr3_olszakstanislaw\\" +
                "lab4\\src\\pl\\olszakstanislaw\\"+args[0]);

        Scanner scanFile = new Scanner(file);

        int counter = 0;

        while (scanFile.hasNext()) {
            String word = scanFile.next();
            if(word.equals(inputString))
                counter++;
        }

        System.out.println("Ilosc wystopien słowa: "+inputString+", w pliku: "+args[0]);
        System.out.println("wyniesie: "+ counter);
    }
}
