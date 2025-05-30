package Recur;
import java.util.Scanner;

public class tpReP11 {
    public static void main(String[] args) {
    //No se si piden esto
    //Sumar por un lado pos pares y por el otro impares    1- hacer 2 modulos
    Scanner sc = new Scanner(System.in);

    int [] arr = {2,4,5,7,8,6};
    imprimirSuma(arr, 0);
    sc.close();
    }
    public static int sumaArrPar (int []arr, int pos){
        //Suma posiciones pares
        int suma = 0;
        if (pos >= arr.length) {
            suma = 0;
        }else{
            suma = arr[pos] + sumaArrPar(arr, pos + 2);
        }
        
        return suma;    
    }

    public static int sumaArrImPar (int []arr, int pos){
        int suma = 0;
        //Suma posiciones impares
        if (pos >= arr.length) {
            suma = 0;
        }else{
            if (pos % 2!= 0) {
                //suma si es impar la pos
                suma = arr[pos] + sumaArrImPar(arr, pos+2);
            }else{
                //para continuar la recursiva
                suma = sumaArrImPar(arr, pos+1);
            }
        }
        
        return suma;    
    }
    public static void imprimirSuma(int []arr, int pos){
        System.out.print("La suma de las posiciones pares es: "+sumaArrPar(arr, pos));
        System.out.print("La suma de las posiciones impares es: "+sumaArrImPar(arr, pos));   
    }
}

