package pl.edu.uwm.wmii.olszakstas;
import java.util.Scanner;

public class ObjG {
    void sumMultiplyDouble() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość liczb: ");
        int n = scan.nextInt();
        double addResult=0, multiplyResult=1;

        for(int i=0; i<n; i++){
            System.out.println("\n A_"+i+": ");
            double temp = scan.nextDouble();
            addResult += temp;
            multiplyResult *= temp;
        }

        System.out.println("wynik dodawania: "+addResult);
        System.out.println("wynik mnozenia: "+multiplyResult);
    }
}
