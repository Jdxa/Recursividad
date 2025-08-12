public class recursivaMat {
    public static void main(String[] args) {
        int [][]mat = {{23,32,44},{12,23,38}};
        System.out.println(recorrerMat(mat, 0, 0));
        System.out.println(existeNum(44));
    }
    public static boolean existeNum(int num){
        boolean esta = false;;
        if (num >= 10) {
            int coc = num /10;
            if (num%10 == coc %10) {
                esta= true;
            }else{
                esta= existeNum(num/10);
            }
        }

        return esta;
    }
    public static boolean recorrerMat(int [][] mat, int i, int j){
        boolean existe = false;
        if (i < mat.length) {
            if (j < mat[0].length) {
                if (existeNum(mat[i][j])) {
                    existe= true;
                }else{
                   existe= recorrerMat(mat, i, j+1);
                }
                    
            }
            else{
                existe = recorrerMat(mat, i+1, j);
            }
        }


        return existe;
    }

}
