package pl.edu.uwm.wmii.olszakstas;
import java.util.Scanner;

public class ObjI {
    void sumSubtractionFactorialDouble() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość liczb: ");
        int n = scan.nextInt();
        double wynik=0;
        double factorial = 1;

        boolean add = false;
        for(int i=0; i<n; i++){
            System.out.println("\n A_"+i+": ");
            double input = scan.nextDouble(), temp=0;

            factorial *= (i+1);

            temp = input/factorial;

            if(add) {
                wynik += temp;
                add = false;
            }
            else {
                wynik -= temp;
                add = true;
            }

        }

        System.out.println("wynik: "+wynik);
    }
}
