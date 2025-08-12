public class otrop {
    //punto 1 b) simulacro
    public static void main(String[] args) {
        int [][] mat = {{2,3,2}, {101,3,10},{4,20,3}};
        System.out.println(recorrerDiag(mat, 0, 0));
    }
    public static boolean recorrerDiag(int [][]mat, int i, int j){
        boolean existe = false;
        if (i < mat.length && !existe) {
            if (sonPares(mat[i][j])) {
                existe = true;
            }else{
                existe = recorrerDiag(mat, i+1, j+1);
            }

        }
        return existe;
    }
    
    public static boolean sonPares(int num){
        boolean es = true;;
        int dig = num%10;
        if (dig % 2 != 0) {
            es = false;
        }else{
            if (num >= 10) {
                es = sonPares(num/10);
            }
        }
        return es;
    }
}
