package pl.edu.uwm.wmii.olszakstas;

public class Matrix {
    int rows;
    int columns;
    int[][] array;

    public Matrix(int rows, int columns, int array){
        this.rows = rows;
        this.columns = columns;
//        System.arraycopy();
    }

//    public void fulfill()

    void print(){
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
