package pl.edu.uwm.wmii.olszakstas;
import java.util.Scanner;

public class ObjE {
    void multiplyAbs() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość liczb: ");
        int n = scan.nextInt();
        double wynik=1;

        for(int i=0; i<n; i++){
            System.out.println("\n A_"+i+": ");

            double temp = Math.abs(scan.nextDouble());
            wynik *= temp;
        }

        System.out.println("wynik: "+wynik);
    }
}
