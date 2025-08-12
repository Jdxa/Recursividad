package Recur;
public class tpReP13 {
    //Buscar el mayor numero en una matriz numerica
    public static void main(String[] args) {
        int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(mayorNumMat(mat, 0, 0));
    }
    public static int mayorNumMat(int [][]mat, int i, int j){
        int mayor;
        
        if (j == mat[i].length){
            j= 0;
            i++;
            
        }
        if (i== mat.length-1 && j== mat[i].length-1){
            mayor = mat[i][j];
        }else{
            mayor = mayorNumMat(mat, i, j+1);
            if (mayor <  mat[i][j]) {
                mayor= mat[i][j];
            }
            
        }
        
        return mayor;
    }
}
