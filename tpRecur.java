import java.util.Scanner;

public class tpRecur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Num tiene: "+digMultTres(num)+ " digitos multiplos a tres");
        sc.close();
    }
    public static int digMultTres(int num){
        //Retorna cuantos digitos multiplos de tres tiene num
        int sum, dig, aux;
        if (num == 0) {
            sum = 0;
        }else{
            dig = num % 10;
            if (dig %3 == 0 && dig != 0) {  //Condicion: digito no puede ser 0 y tiene que ser multiplo de 3
                aux = 1;
            }else{
                aux = 0;
            }
            sum = aux + digMultTres(num/10);
        }
        return sum;
    }   
}
