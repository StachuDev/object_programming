package pl.edu.uwm.wmii.olszakstas;
import java.util.Scanner;

public class ObjF {
    void sumaPowDouble() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość liczb: ");
        int n = scan.nextInt();
        double wynik=0;

        for(int i=0; i<n; i++){
            System.out.println("\n A_"+i+": ");

            double temp = Math.pow(scan.nextDouble(), 2);
            wynik += temp;
        }

        System.out.println("wynik: "+wynik);
    }
}
