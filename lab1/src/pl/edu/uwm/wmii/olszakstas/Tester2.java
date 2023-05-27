package pl.edu.uwm.wmii.olszakstas;
import java.util.Scanner;

public class Tester2 {
    //public enum Section {A, B, C, D, E, F, G;}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write a number of subsection: ");
        int subsection = scan.nextInt();

        System.out.println("Write a number of elements: ");
        int numb = scan.nextInt();
        int result=0;

        switch(subsection){
            case 1:
                for(int i=0; i<numb; i++){
                    System.out.println("\n A_"+i+": ");
                    double v = scan.nextDouble();
                    CondIterConstructionEx1 s1 = new CondIterConstructionEx1();
                    if(s1.isOdd(v))
                        result += 1;
                }
                System.out.println("result: "+ result);
                break;

            case 2:
                for(int i=0; i<numb; i++){
                    System.out.println("\n A_"+i+": ");
                    double v = scan.nextDouble();

                    CondIterConstructionEx1 s3 = new CondIterConstructionEx1();

                    if(s3.isDiv3Undiv5(v))
                        result += 1;
                }
                System.out.println("result: "+ result);
                break;

            case 3:
                for(int i=0; i<numb; i++){
                    System.out.println("\n A_"+i+": ");
                    double v = scan.nextDouble();

                    CondIterConstructionEx1 s2 = new CondIterConstructionEx1();

                    if(s2.isSquareOfEven(v))
                        result += 1;
                }
                System.out.println("result: "+ result);
                break;
        }

    }
}
