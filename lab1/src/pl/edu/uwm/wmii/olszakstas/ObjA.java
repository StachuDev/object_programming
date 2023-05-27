package pl.edu.uwm.wmii.olszakstas;
import java.util.Scanner;

public class ObjA {
    void sumaDouble() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość liczb do zsumowania: ");
        int n = scan.nextInt();
        double wynik=0;

        for(int i=0; i<n; i++){
            System.out.println("\n A_"+i+": ");
            wynik += scan.nextDouble();
        }

        System.out.println("wynik: "+wynik);
    }
}
