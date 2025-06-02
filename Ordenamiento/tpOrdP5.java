package Ordenamiento;

public class tpOrdP5 {
    //Metodo insercion
    public static void main(String[] args) {
        int [] arr = {89,45,68,90,29,34,17};
        imprimirArr(arr);
        insercion(arr, arr.length);
        imprimirArr(arr);
        insercionReves(arr,arr.length);
        imprimirArr(arr);
    }
    public static void insercion(int[] a, int n) {
        int i, j, aux;

        for (i = 1; i < n; i++) {                                          //
            j = i;                                                         //asignacion: 1
            aux = a[j];  // Guardamos el valor actual                      //asignacion + acceso: 2
            // Desplazamos hacia la derecha los valores mayores a 'aux'
            while (j > 0 && a[j - 1] > aux) {                           //cond: 4
                a[j] = a[j - 1];                                        //3(acceso al arreglo*2 + asignacion)
                j--;                                                    // 2 incremento
            }

            a[j] = aux;  // Insertamos en la posición correcta          //acceso y asignacion: 2
        }
    }
    public static void insercionReves(int[] a, int n) {
        int i, j, aux;

        for (i = 1; i < n; i++) {
            j = i;
            aux = a[j];  // Guardamos el valor actual

            // Desplazamos hacia la derecha los valores mayores a 'aux'
            while (j > 0 && a[j - 1] < aux) {
                a[j] = a[j - 1];
                j--;
            }

            a[j] = aux;  // Insertamos en la posición correcta
        }
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int aux = arr[i];  // Elemento actual a insertar
            int j = i - 1;

            // Mover elementos mayores que 'aux' a una posición adelante
            while (j >= 0 && arr[j] > aux) {
                arr[j + 1] = arr[j];  // Desplazar a la derecha
                j = j - 1;
            }

            // Insertar el elemento en su lugar
            arr[j + 1] = aux;
        }
    }
    
       public static void imprimirArr(int []arr){
        for (int i= 0; i < arr.length; i++){
            System.out.print(arr[i]+ ", ");
        }
        System.out.println();
    }
}
