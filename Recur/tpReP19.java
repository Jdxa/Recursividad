package Recur;

public class tpReP19 {
    //Imprimir piramide desde 1 hasta n
    public static void main(String[] args) {
        imprPiramide(5, 1);
    }
    public static void imprPiramide(int n, int ini){
        if (ini <= n) {
            int espacios = n-ini;
            imprEspacios(espacios);
            imprIzDer(1, ini);
            imprDerIz(ini-1);
            System.out.println();

            imprPiramide(n, ini+1);
        }
    }
    public static void imprEspacios(int cant){
        //Imprime los espacios necesarios para la fila actual de izq a derecha
        if (cant > 0) {
            System.out.print(" ");
            imprEspacios(cant-1);
        }
    }
    public static void imprIzDer(int pos, int limite){
       //Imprime los numeros q van desde el 1 hasta el limite q es n en cada it
        if (pos <= limite) {
            System.out.print(pos);
            imprIzDer(pos + 1, limite);
       }
    }
    public static void imprDerIz(int actual){
        //imprime los numeros que van desde el limite hasta 1 consiguientes
        if (actual > 0) {
            System.out.print(actual);
            imprDerIz(actual-1);
        }
    }
}
