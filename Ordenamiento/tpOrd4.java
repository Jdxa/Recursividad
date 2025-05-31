package Ordenamiento;

public class tpOrd4 {
    public static void main(String[] args) {
        int [] arr = {89,45,68,90,29,34,17};
        imprimirArr(arr);
        metBurb(arr);
        imprimirArr(arr);
        metBurbReves(arr);
        imprimirArr(arr);
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
