public class tpReP7 {
    public static void main(String[] args) {
        int [][] mat = {{10,1,2},{30,20,4},{5,6,30}};
        mostrarSum(mat,0,0);
    }
    public static int sumaFilas(int [][] mat , int i, int j){
        int suma= 0;
        if(j == mat[i].length-1){
            suma = mat [i][j];

        }else{
            suma = mat [i][j] + sumaFilas(mat, i, j+1);
        }
        return suma;

    }
    public static void mostrarSum(int[][] mat, int i, int j){
        int sum;
        if (i < mat.length) {   
            sum = sumaFilas(mat, i, j);
            System.out.println(sum);
            mostrarSum(mat, i+1, j);
        }
    }
}
