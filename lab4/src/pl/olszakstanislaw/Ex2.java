package pl.olszakstanislaw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class Ex2{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(System.in);

        System.out.print("Wprowadz znak, ktorego ilosc wystapien zliczamy: ");
        char inputChar = scan.next().charAt(0);

        System.out.print("Wprowadz nazwe pliku razem z jego rozszerzeniem: ");
        String fileName = scan.next();

//        File file = new File("src/" + fileName + ".txt");
        File file = new File("C:\\Users\\Dell\\JavaProjects\\po_gr3_olszakstanislaw\\" +
                "lab4\\src\\pl\\olszakstanislaw\\"+fileName);

        Scanner scanFile = new Scanner(file);
        int counter = 0;

        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();
            for(int i=0; i<line.length(); i++){
                if(line.charAt(i)==inputChar)
                    counter++;
            }
        }

        System.out.println("Ilosc wystopien znaku "+inputChar+", w pliku: "+fileName);
        System.out.println("wyniesie: "+ counter);
    }


}
