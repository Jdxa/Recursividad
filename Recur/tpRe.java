package Recur;
import java.util.Scanner;

public class tpRe {
    //Este no es ningun punto es un test para github
    public static void main(String[] args) {
        System.out.println(imprimir(4));
        Scanner leer = new Scanner(System.in);
        int [] arr = {1,2,3,4};
        impArr(arr);
        System.out.println("hola");
        leer.close();
    }
    public static String imprimir(int num){
        String st = "";
        if (num == 0) {
            st = "";
        }else{
            st = "Hola mundo ";
            st = st + imprimir(num -1);
        }
        return st;
    }
    public static void impArr(int [] arr){
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]);
        } 
    }
    public static int [] cargar (Scanner leer){
        System.out.println("Ingrese el largo del arr");
        int p = leer.nextInt();
        int [] arr = new int[p];

        for (int i = 0 ; i < arr.length; i=i+2){
            arr[i] = leer.nextInt();
        }
        return arr;
    }
}

