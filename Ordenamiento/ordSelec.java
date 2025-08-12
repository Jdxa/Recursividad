package Ordenamiento;

public class ordSelec {
    //Ordenamiento por seleccion
    public static void main(String[] args) {
        int [] arr = {3,5,6,1,8};
        imprimirArr(arr);
        metSelec(arr);
        imprimirArr(arr);
        metSelecReve(arr);
        imprimirArr(arr);
    }
    public static void metSelec(int []arr){
        int i,j,posMenor, aux;
        for(i= 0; i< arr.length-1; i++){ // -1 xq ya se q el ultimo es el max grande
            posMenor = i;
            for (j = i +1; j < arr.length; j++){
                if (arr[j]< arr[posMenor]) {
                    posMenor= j;
                    aux = arr[i];
                    arr[i]= arr[posMenor];
                    arr[posMenor] = aux;
                }
            }
        }
    }
        public static void metSelecReve(int []arr){
        int i,j,posMenor, aux;
        for(i= 0; i< arr.length-1; i++){ // -1 xq ya se q el ultimo es el max grande
            posMenor = i;
            for (j = i +1; j < arr.length; j++){
                if (arr[j]> arr[posMenor]) {
                    posMenor= j;
                    aux = arr[i];
                    arr[i]= arr[posMenor];
                    arr[posMenor] = aux;
                }
            }
        }
    }
    public static void imprimirArr(int[] arr){
        for (int i= 0; i< arr.length; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
}
