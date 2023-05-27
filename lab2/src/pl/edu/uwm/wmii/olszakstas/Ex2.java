package pl.edu.uwm.wmii.olszakstas;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        int[] tab;
        tab = new int[5];
        generuj(tab, 4, 10, 20);
        printTab(tab);
    }

    public static void generuj(int[] tab, int n, int minWartosc, int maxWartosc) {
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            tab[i] = r.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
        }
    }

    public static void printTab(int[] tab){
        for(int el : tab){
            System.out.print(el + " ");
        }
        System.out.println(" ");
    }

    public static int howManyOdd(int[] array){
        int oddCount = 0;

        for(int i=0; i< array.length; i++){
            if(array[i]%2==1)
                oddCount += 1;
        }
        return oddCount;
    }
}


