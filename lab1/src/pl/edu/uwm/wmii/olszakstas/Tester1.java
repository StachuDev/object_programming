package pl.edu.uwm.wmii.olszakstas;
import java.util.Scanner;

public class Tester1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Write object number: ");
        int num = s.nextInt();

        switch (num) {
            case 1:
                ObjA z1 = new ObjA();
                z1.sumaDouble();
                break;

            case 2:
                ObjB z2 = new ObjB();
                z2.multiplyDouble();
                break;

            case 3:
                ObjC z3 = new ObjC();
                z3.sumAbsDouble();
                break;

            case 4:
                ObjD z4 = new ObjD();
                z4.sumSqrtAbsDouble();
                break;

            case 5:
                ObjE z5 = new ObjE();
                z5.multiplyAbs();
                break;

            case 6:
                ObjF z6 = new ObjF();
                z6.sumaPowDouble();
                break;

            case 7:
                ObjG z7 = new ObjG();
                z7.sumMultiplyDouble();
                break;

            case 8:
                ObjH z8 = new ObjH();
                z8.addSubtractionDouble();
                break;

            case 9:
                ObjI z9 = new ObjI();
                z9.sumSubtractionFactorialDouble();
                break;

            default:
                throw new IllegalStateException("Invalid number of object:"+num);
        }
    }
}
