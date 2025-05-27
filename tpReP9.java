import java.util.Scanner;

public class tpReP9 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero y el divisor que quiere usar: ");
        int dividendo = leer.nextInt();
        int divisor = leer.nextInt();
        System.out.print("El cociente de 56 es: "+restasSuc(divisor, dividendo));
        leer.close();
    }
    public static int restasSuc(int divisor, int dividendo){
        //Sumo 1 por la cantidad de restas sucesivas, equivaliendo al cociente entero
        int fin ;
        int res = dividendo - divisor;
        if (res > divisor) {
            fin = 1 + restasSuc(divisor, res);
        }else{
            fin = 1;
        }

        return fin;
    }
}
