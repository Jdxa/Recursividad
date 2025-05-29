public class tpReP12 {
    public static void main(String[] args) {
        //Buscar un caracter en un arreglo
        char [] arr = {'h','o','l','a'};
        System.out.println(encontrarChar(arr, 'a', 0));
    }
    public static boolean encontrarChar(char[] arr, char c, int pos){
        boolean encontrado= false;
        if (!encontrado && pos < arr.length) {
            
            if (c == arr[pos]) {
                //si la encontro retorna true
                encontrado= true;
            }else{
                //sino sigue buscando
                encontrado = encontrarChar(arr, c, pos+1);
            }
            
        }
        //si no la encontro no entra al if y retorna falso
        return encontrado;
    }
}
