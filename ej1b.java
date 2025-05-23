
public class ej1b {
    //Retornar la cantidad de digitos impares
    public static void main(String[] args) {
        int num = 6;
        
        System.out.println(""+cantMensajes(num) );
    }
    public static int cantImp(int num){
        int dig = 1;
        int cociente = num / 100;
        if (cociente != 0) {
           
            dig = dig + digImp(cociente); 
            
        }

        return dig;
    }
    public static int digImp(int num){
        int res, aux, dig;
        if (num == 0) {
            //Caso base, mi num es 0
            res = 0;
        }else{
            //Dig es el ultimo digito del numero
            dig = num % 10;
            
            if (dig % 2 != 0) {
                // Si es impar suma 1
                aux = 1;
            }else{
                //Si es par suma 0
                aux = 0;
            }
            //Sumo si es par o impar
            res = aux + digImp(num/10);
        }
        
    
        return res;
    }
    public static int cantMensajes(int num){
        int res=0, aux;
        if (num == 1) {
            //Caso base, num llega a 1
            res = 1;
        }else{
            if (num % 2 == 0) {
                // si x es par x = x/2
                aux = num/2;
            }else{
                // si x es impar x = x*3 +1
                aux = 3* num + 1;
            }
            //suma de cantidad de mensajes enviados
            res = num + cantMensajes(aux);
        }
        
        return res;
    }
}



