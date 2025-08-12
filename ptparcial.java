public class ptparcial {
    //Retorna una string sin sus caracteres repetidos

    public static void main(String[] args) {
        int [][] mat = {{213,402,51},{1,2,7}};
        System.out.println(recorreMat(mat, 0, 0));
        
    }
    public static String eliminarRepe(String cad, int pos){
        
        String st = "";
        if (pos < cad.length()-1) {
            if (!cad.substring(pos, pos+1).equals(cad.substring(pos+1, pos +2))) {
                //Si mi char en pos es distinto a el siguiente lo guardo
                st += cad.substring(pos, pos+1);
            }
            st += eliminarRepe(cad, pos+1);     
        }else{
            if (pos == cad.length()-1) {
                
                st += cad.substring(pos, pos+1);
            }
        }
        return st;

    }
    public static boolean recorreMat(int [][]mat ,int i ,int j){
        boolean elemento = false;
        if (j == mat[0].length) {
            j = 0;
            i++;
        }
        if (i < mat.length) {
            if (existeNum(mat[i][j])) {
                elemento = true;
            }else{
                elemento = recorreMat(mat, i, j+1);
            }
        }

        return elemento;
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
    
    
}
