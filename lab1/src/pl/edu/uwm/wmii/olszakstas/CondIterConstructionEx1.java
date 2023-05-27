package pl.edu.uwm.wmii.olszakstas;

public class CondIterConstructionEx1 {
    boolean isOdd(double v){
        return v%2==1;
    }

    boolean isDiv3Undiv5(double v){
        return v % 3 == 0 && v % 5 != 0;
    }

    boolean isSquareOfEven(double v){
        double temp = Math.sqrt(v);
        return !isOdd(temp);
    }

    boolean isDCondFulfilled(double v1, double v2, double v3){
        return v2 < (v1 + v3) / 2;
    }
}
