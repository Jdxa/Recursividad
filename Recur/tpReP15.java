package Recur;
public class tpReP15 {
    public static void main(String[] args) {
        System.out.println(cantVocales("hola", 0));
    }
    public static boolean esVocal(String str){
        boolean es;
        es= false;
        switch (str) {
            case "a","e","i","o","u":
                es = true;
                break;
        }
        return es;
    }
    public static int cantVocales(String str, int pos){
        //Cuenta la cantidad de vocales
        int vocales= 0, aux;
        str = str.toLowerCase();
        if (pos < str.length()) {
            String st = str.substring(pos, pos+1);
            //Comprueba si es vocal o no, cuyo caso suma 1
            if (esVocal(st)) {
                aux= 1;
            }else{
                aux = 0;
            }
            vocales = aux + cantVocales(str, pos+1);

        }

        return vocales;
    }
}
