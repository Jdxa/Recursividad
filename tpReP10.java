public class tpReP10 {
    public static void main(String[] args) {
        System.out.println(hastaPun("hola.comostas", 0));
    }
    public static String hastaPun(String st, int p){
        //Retorna la frase sin punto?
        String str;
        if (p == st.length()){
            str = "";
        }else{
            str = st.substring(p, p+1);
            if (str.equals(".")) {
                str= "";
            }else{
                str= str.concat(hastaPun(st, p+1));
            }
        }

        return str;
    }
}
