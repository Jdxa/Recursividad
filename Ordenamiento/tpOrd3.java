package Ordenamiento;

public class tpOrd3 {
    public static void main(String[] args) {
        int []arr = {7,6,11,17,3,15,5,19,30,14};
        imprimir(arr);
        ordSelec(arr); //Ordena de menor a mayor
        imprimir(arr);
        ordSelec2(arr); //Ordena de mayor a menor
        imprimir(arr);

    }
    public static void ordSelec(int []arr){
        int i, n= arr.length, aux, posMenor;
        for (i = 0; i < n; i++){
            posMenor= busqMenor(arr, i);
            if (arr[posMenor] < arr[i]) {
                aux = arr[i];
                arr[i] = arr[posMenor];
                arr[posMenor]= aux;
            }
        }

    }
    public static int busqMenor (int []arr, int pos){
        int menor = pos;
        int aux = arr[pos];
        for (int i= pos; i < arr.length; i++){
            if (arr[i]< aux) {
                aux = arr[i];
                menor = i;
            }
        }


        return menor;
    }
    public static void ordSelec2(int []arr){
        int i, n= 0, aux, posMenor;
        for (i = arr.length-1; i >= n; i--){
            posMenor= busqMenor2(arr, i);
            if (arr[posMenor] < arr[i]) {
                aux = arr[i];
                arr[i] = arr[posMenor];
                arr[posMenor]= aux;
            }
        }

    }
    public static int busqMenor2 (int []arr, int pos){
        int menor = pos;
        int aux = arr[pos];
        for (int i= pos; i >= 0; i--){
            if (arr[i]< aux) {
                aux = arr[i];
                menor = i;
            }
        }


        return menor;
    }
    public static void imprimir(int [] arr){
        for (int i= 0; i < arr.length; i++){
            System.out.print(arr[i]+", ");
            
        }
        System.out.println();
    }
}
