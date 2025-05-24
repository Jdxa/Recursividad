public class bin {
    public static void main(String[] args) {
        int bin1 = decToBin(8);
        System.out.println(bin1);
    }
    public static int decToBin(int dec){
        int bin, resto;
        
        if (dec > 0){
            //Saco el resto 
            resto = dec % 2;                   
            bin = resto+ + 10 * decToBin(dec/2);        
            
        }else{
            bin = 0;
        }

        return bin;
    }
}
