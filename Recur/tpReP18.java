package Recur;
public class tpReP18 {
    public static void main(String[] args) {
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
