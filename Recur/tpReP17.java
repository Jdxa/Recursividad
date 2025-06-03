package Recur;

public class tpReP17 {
    
    public static void main(String[] args) {
        mediaPira(9, 1);
    }
    public static void mediaPira(int n, int linea){
        //Imprime lineas 
        if (linea <= n) {
            imprimirLinea(linea);
            System.out.println(); //Salto de linea
            mediaPira(n, linea+1);
        }
        
    }
    public static void imprimirLinea(int num){
        //Imprime desde num hasta 1 en una misma linea
        if (num > 0) {
            System.out.print(num);
            imprimirLinea(num-1);
        }
    }
}
