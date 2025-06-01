package Ordenamiento;

public class tpOrd4_6 {
    public static void main(String[] args) {
        int [] arr = {89,45,68,90,29,34,17};
        imprimirArr(arr);
        metBurbMej(arr);
        imprimirArr(arr);
        metBurbMejReves(arr);
        imprimirArr(arr);
    }
    public static void metBurbMej(int []arr){
        // Crear bandera de corte
        int i, j, aux;
        boolean ordenado = false;
        i = 0;
        while (i < arr.length -1 && !ordenado ) {
            ordenado = true;
            for (j= 0; j< arr.length - i -1; j++){
                if (arr[j]> arr[j+1]) {
                    ordenado = false;
                    aux =  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
            i++;
        }
    }
    public static void metBurbMejReves(int []arr){
        // Crear bandera de corte
        int i, j, aux;
        boolean ordenado = false;
        i = 0;
        while (i < arr.length -1 && !ordenado ) {
            ordenado = true;
            for (j= 0; j< arr.length - i -1; j++){
                if (arr[j] < arr[j+1]) {
                    ordenado = false;
                    aux =  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
            i++;
        }
    }
    public static void metBurb(int [] arr){
        int i,j,aux,corte;
        for(i= 0; i < arr.length - 1; i++){
            corte = arr.length - i -1;
            for (j= 0; j < corte; j++ ){
                if (arr[j]> arr[j+1]) {
                    aux= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }
        public static void metBurbReves(int [] arr){
        int i,j,aux,corte;
        for(i= 0; i < arr.length - 1; i++){
            corte = arr.length - i -1;
            for (j= 0; j < corte; j++ ){
                if (arr[j]< arr[j+1]) {
                    aux= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }
    public static void imprimirArr(int []arr){
        for (int i= 0; i < arr.length; i++){
            System.out.print(arr[i]+ ", ");
        }
        System.out.println();
    }
}
