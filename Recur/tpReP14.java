package Recur;
public class tpReP14 {
    public static void main(String[] args) {
        int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        cambioColumna(mat, 0, 0);
    }
    public static int sumaColum(int [][]mat, int i, int j){
        //Recorre cada elemento de la columna y lo suma
        int suma;
        if (i == mat.length-1) {
            suma = mat[i][j];
        }else{
            suma = mat[i][j] + sumaColum(mat, i+1, j);
        }
        
        return suma;
    }
    public static void cambioColumna(int [][]mat, int i, int j){
        //Cambia la posiciones de la columna a sumar
        if (j < mat.length) {
            System.out.println(sumaColum(mat, i, j));
            cambioColumna(mat, i, j+1);
        }
    }
}
