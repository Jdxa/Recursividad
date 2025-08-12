package Ordenamiento;
public class tpOrdP1 {
    public static void main(String[] args) {
    // Busqueda secuencial
        int [] arr = {89,45,63,90,29,34,17};
        int pos1 =busquedaSecAd(arr, 17);
        int pos2= busquedaSecAtr(arr, 17);
        System.out.print("posicion: "+pos1);
        System.out.println();
        System.out.print("posicion: "+pos2);
    }
    public static int busquedaSecAd(int []arr, int num){
        //Busca desde la 1ra pos a la ult
        int res= -1, i= 0;
        boolean encontrado = false;
        while (i < arr.length && !encontrado) {
            if (num == arr[i]) {
                res= i;
                encontrado= true;
            }
            i++;
        }
        return res;
    }
    public static int busquedaSecAtr(int []arr, int num){
        //Busca desde la ult posicion hacia la primera
        int res= -1, i = arr.length-1;
        boolean encontrado = false;
        while (i >= 0 && !encontrado) {
            if (num == arr[i]) {
                res= i;
                encontrado= true;
            }
            i--;
        }
        return res;
    }
}
