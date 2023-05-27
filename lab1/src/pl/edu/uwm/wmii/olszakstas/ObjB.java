package pl.edu.uwm.wmii.olszakstas;
import java.util.Scanner;

public class ObjB {
    void multiplyDouble(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość liczb do wymnozenia: ");
        int n = scan.nextInt();
        double wynik=1;

        for(int i=0; i<n; i++){
            System.out.println("\n A_"+i+": ");
            wynik *= scan.nextDouble();
        }

        System.out.println("wynik: "+wynik);
    }
}
