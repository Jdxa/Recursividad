import java.util.Scanner;

public class bin {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero y te lo paso a bin: ");
        int num = leer.nextInt();
        int bin1 = decToBin(num);
        System.out.print(num+" a binarios es: " +bin1);
        leer.close();
    }
    public static int decToBin(int dec){
        int bin, resto;
        
        if (dec > 0){
            //Saco el resto 
            resto = dec % 2; 
            //Sumo el resto con el siguiente bin                  
            bin = resto+ + 10 * decToBin(dec/2);        
            
        }else{
            bin = 0;
        }

        return bin;
    }
}
