package Recur.Punto16;

import java.util.Scanner;

public class TestProducto {
    
    public static void main(String[] args) {
       
       
       Producto prod = new Producto(1, "hola como andas", 0, "fideos", 200);
       System.out.println(prod.getNombre().substring(1,2));
       System.out.println(prod.abreviar());
    }
    public static Producto cargarProducto(Scanner leer){
        Producto prod1;
        System.out.println("Ingrese el id del producto: ");
        int cod = leer.nextInt();
        System.out.println("Ingrese el nombre del producto: ");
        String nn = leer.nextLine();
        System.out.println("Ingrese el stock del producto: ");
        int cant = leer.nextInt();
        System.out.println("Ingrese la categoria del producto: ");
        String cat = leer.nextLine();
        System.out.println("Ingrese un precio unitario: ");
        int pre = leer.nextInt();
        prod1 = new Producto(cod, nn, cant, cat, pre);
        return prod1;
    }
    public static void cargarMatriz(Scanner leer, Producto [][] arr){
        int i = 0;
        int j= 0;

        while (i < arr.length && arr[i][j]== null) {
           if (arr[i-1][j].equals(arr[i][j]) || arr[i-1][j] == null){
            while (j < arr[0].length && arr[i][j]== null) {
                 arr[i][j] = cargarProducto(leer);
                j++;
            }
            }else{
                i++;
            }
            
        }
    }
    
    
}
