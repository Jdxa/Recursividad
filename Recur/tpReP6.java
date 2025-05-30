package Recur;
public class tpReP6 {
    public static void main(String[] args) {
        int [] arr = {11,17,16,2};
        
        System.out.println("El mayor num del arr es: "+ mayorArr(arr, 0));
    }
    public static int mayorArr(int [] arr, int pos){
        //Retorno el mayor numero entero del arreglo
        int mayor;
        if (pos == arr.length -1){
            mayor = arr[pos];
        }else{
            mayor = mayorArr(arr, pos+1);
            if (arr[pos]> mayor) {          //Condicion: Si el num de la pos actual es mayor sustituyo "mayor" sino se retorna el que ya es mayor
                mayor = arr[pos];
            }
        }


        return mayor;
    }
}
