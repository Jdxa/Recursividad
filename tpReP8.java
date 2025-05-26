import java.util.Scanner;

public class tpReP8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase/palabra y te digo si es polindromo");
        String str = sc.nextLine();
        
        System.out.println(str+" es un polindromo? : "+polindromo(elimEspa(str, 0), 0));
        sc.close();
    }
    public static String elimEspa(String st, int p){
        //Elimina los espacios si tiene
        String sal = "";
        String aux;
        if (p == st.length() - 1) {
            sal = st.substring(p, p+1);
        }else{
            aux = sal + st.substring(p,p+1);
            if (aux.isBlank()) {
                sal = elimEspa(st, p+1);
            }else{
                sal = aux + elimEspa(st, p+1);
            }
        }

        return sal;
    }
    public static boolean polindromo(String st, int p){
        //Evalua si la palabra es polindromo
        boolean es;
        
        if (p == st.length()) {
            es = true;
        }else{
            int pF = st.length() - 1 - p;
            String sub1 = st.substring(p, p+1);           
            String sub2 = st.substring(pF,pF+1);

            
            if (sub1.equals(sub2)) {
                es = polindromo(st, p+1);
            }else{
                es= false;
            }
        }
        return es;
    }
}
