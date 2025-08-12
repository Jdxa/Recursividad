package Recur;
public class tpReP18 {
    public static void main(String[] args) {
        //Explota el n si es mayor a 3 en dos partes donde una mitad es: n/b y la otra es n-n/b
        explotar(15, 3);
    }
    public static void explotar(int n, int b){
        if (n > b) {
            explotar(n/b, b);
            explotar(n - n/b, b);
        }else{
            System.out.print(+n+", "); 
        }
        
    }
   
}
