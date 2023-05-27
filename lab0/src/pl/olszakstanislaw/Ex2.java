package pl.olszakstanislaw;

public class Ex2 {
    public static void main(String[] args){
        int iter=1;
        int sum=0;
        while(iter <= 10){
            sum += iter;
            iter ++;
        }
        System.out.println("1+2+...+10=" + sum);
    }

}
