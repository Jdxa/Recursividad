package Ordenamiento;

public class tpOrd2 {
    public static void main(String[] args) {
        //Busca la posicion del numero en el arreglo ordenado "dividiendolo" 
        int [] arr = {2,4,6,8,10,12,14,16,18,20};
        System.out.println(busquedaBin(arr, 16));   //desde adelante hacia atras
        System.out.println(busquedaBinReves(arr, 16)); //desde atras a adelante
    }
    public static int busquedaBin(int []arr, int num){
        int res= -1, i=0, fin= arr.length-1, medio;
        boolean encontrado = false;
        while (!encontrado && i <= fin ) {
            medio = (i+fin)/2;
            if (arr[medio]== num) {
                encontrado = true;
                res= medio;
            }else{
                if (arr[medio] < num) {
                    //Creamos un intervalo desde medio+1 xq sabemos q medio no es hasta fin
                    i = medio + 1;

                }else{
                    //Creamos un intervalo desde i hasta medio -1 xq sabemos q medio no es el num
                    fin = medio -1;
                }
            }
        }
        return res;
    }
    public static int busquedaBinReves(int []arr, int num){
        int res= -1, fin=0, i= arr.length-1, medio;
        boolean encontrado = false;
        while (!encontrado && i >= fin ) {
            medio = (i+fin)/2;
            if (arr[medio]== num) {
                encontrado = true;
                res= medio;
            }else{
                if (arr[medio] < num) {
                    //Creamos un intervalo desde medio+1 xq sabemos q medio no es hasta fin
                    fin = medio +1;

                }else{
                    //Creamos un intervalo desde i hasta medio -1 xq sabemos q medio no es el num
                    i= medio-1;
                }
            }
        }
        return res;
    }
}
