public class recursivaMatPar {
    //punto 1 a) simulacro
     public static void main(String[] args) {
        
        int [][]mat = {{2,2,2},{101,11,10},{4,20,2}};
       
        System.out.println(recorrerMat(mat, 0, 0));
        
     }
    
    public static int recorrerMat(int[][]mat, int i, int j){
        //1 es true, 0 es false
        int sum = 0;
        
        if (i < mat.length) {
            int aux = suma(mat, i, j);
            sum+= aux + recorrerMat(mat, i+1, j);
        } 
        return sum;
    }
    public static int suma(int [][]mat, int i, int j){
        //Cuento cuantos cuentan la condicion en la primera fila
        int sum= 0;
       
        if (j < mat[0].length) {
            if (sumaDigImp(mat[i][j])== (i+j)) {
                System.out.println("este: "+ mat[i][j] );
                sum+= 1 + suma(mat, i, j+1);
            }else{
                sum+= 0 + suma(mat, i, j+1);
            }
        }
        return sum;
    }
    
    public static int sumaDigImp(int num){
        int sum = 0;
        
        if (num >= 10) {
            int dig = num % 10;
            if (dig % 2 != 0) {
                //Si es impar suma el digito
                sum += dig + sumaDigImp(num/10);
            }else{
                //Sino no lo suma y llama a la recursiva de num/10
                sum+= sumaDigImp(num/10);
            }
        }else{
            //Cuando es de un solo digito
            if (num % 2!= 0) {
                sum+= num;
            }
        }
        return sum;
    }
}