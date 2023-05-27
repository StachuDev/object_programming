package pl.edu.uwm.wmii.olszakstas;
import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        printMatrix(3, 2, 3);




    }

    public static void printM(int array[][], int rows, int columns){
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }

    public static void printMatrix(int m, int n, int k) {
        Random r = new Random();
        int[][] arr1 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = r.nextInt(5);
            }
        }

        int[][] arr2 = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                arr2[i][j] = r.nextInt(5);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        int[][] c = new int[m][k];

        for (int row = 0; row < m; row++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < k; j++) {
                    c[row][j] += (arr1[row][i]*arr2[i][j]);
                }
            }
        }

        printM(c, m, k);
    }
}
