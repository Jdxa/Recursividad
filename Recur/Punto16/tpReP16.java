package Recur.Punto16;

public class tpReP16 {
    //Arreglo TDA Producto
    public static void main(String[] args) {
        Producto prod1 = new Producto(0, "salchica", 30, "alimento", 400);
        Producto prod2 = new Producto(1, "fideos", 4, "alimento", 3000);
        Producto prod3 = new Producto(1, "trapo", 4, "limpieza", 1000);
        Producto [] arr = {prod1,prod2,prod3};
        int productosMen =cantMenoresA(arr, 0, 1100);
        System.out.println(productosMen);
    }
    public static int cantMenoresA(Producto []arr, int pos, int n){
        //N es el valor dado
        int sum = 0, aux;
        if (pos < arr.length ) {
            int pre = arr[pos].getPrecio();
            if (pre < n) {
                aux = 1;
            }else{
                aux = 0;
            }
            sum+= aux + cantMenoresA(arr, pos+1, n);
        }

        return sum;
    }
}


