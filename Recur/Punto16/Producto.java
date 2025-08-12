package Recur.Punto16;

public class Producto {
    private int id;
    private String nombre;
    private int cantidad;
    private String categoria;
    private int precio;
    //constru
    Producto (int cod, String nn, int cant, String cat, int pre){
        this.id = cod;
        this.nombre = nn;
        this.cantidad = cant;
        this.categoria = cat;
        this.precio = pre;

    }

    public int getID (){
        return this.id;
    }
    public String getNombre (){
        return this.nombre;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public int getPrecio(){
        return this.precio;
    }

    public void setCantidad(int nuevaCant){
       this.cantidad = nuevaCant;
    }
    public void setPrecio (int nuevoPre){
        this.precio = nuevoPre;
    }

    public String abreviar(){
        String nuevaCad = "";
        String cadena = this.nombre;
        boolean noEsVacio = true;
        cadena = cadena.trim();
        for (int i = 0; i< cadena.length(); i++){
            String c = cadena.substring(i, i+1);
            if (c.isBlank()) {
                noEsVacio = true; //Para que la siguiente iteracion si no es un espacio la haga mayuscula
            }else{
                if(noEsVacio){
                    nuevaCad += c.toUpperCase(); 
                    noEsVacio = false; //Hago falso para que las letras de en medio no me las haga mayuscula
                }else{
                    if(!esVocal(c)){
                        nuevaCad += c;
                    }
                }
            }
            
        }
        return nuevaCad;
    }
    public static boolean esVocal(String c){
        switch (c.toLowerCase()) {
            case "a": case "e" : case "i" : case "o":case "u":
                
                return true;
        
            default:
                return false;
        }
    }
    public boolean equals(Producto prod){
        
        return this.categoria.equals(prod.getCategoria());
    }
}    