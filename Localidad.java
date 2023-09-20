public class Localidad{
    
    private String nombre;
    private int precio;
    private int boletosDisponibles;
    private int boletosComprados;

     /** 
     * Constructor predeterminado con parametros
     * @param nombre
     * @param precio
     */

    public Localidad(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
        this.boletosDisponibles = 20;
        this.boletosComprados = 0;
    }

    
    /** 
     * @return String
     * Geter de nombre
     */
    public String getNombre(){
        return this.nombre;
    }

    
    /** 
     * @param nombre
     * Seter de nobmre
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    
    /** 
     * geter de precio
     * @return int
     */
    public int getPrecio(){
        return this.precio;
    }

    
    /** 
     * seter de precio
     * @param precio
     */
    public void setPrecio(int precio){
        this.precio = precio;
    }

    
    /** 
     * geter de boletos disponbibles
     * @return int
     */
    public int getBoletosDisponibles(){
        return this.boletosDisponibles;
    }

    
    /** 
     * seter de boletos disponibles
     * @param boletosDisponibles
     */
    public void setBoletosDisponbiles(int boletosDisponibles){
        this.boletosDisponibles = boletosDisponibles;
    }

    
    /** 
     * geter de boletos comprados
     * @return int
     */
    public int getBoletosComprados(){
        return this.boletosComprados;
    }

    
    /** 
     * seter de boletos comprados
     * @param boletosComprados
     */
    public void setBoletosComprados(int boletosComprados){
        this.boletosComprados = boletosComprados;
    }

    
    /** 
     * Método boolean que devuelve true si la localidad tiene boletos disponibles
     * @return boolean
     */
    public boolean evaluarDisponibilidad(){
        if(boletosDisponibles <= 0){
            return false;
        }
        return true;
    }

    
    /** 
     * método boolean que devuvleve true si existen suficientes boletos disponbiles según parámetro
     * @param cantidad
     * @return boolean
     */
    public boolean evaluarDisponibilidad(int cantidad){
        if(boletosDisponibles <= 0 || boletosDisponibles < cantidad){
            return false;
        }
        return true;
    }

    /** 
     * Boolean que devuvlve true si el precio total es menor igual al presupuesto
     * @param cantidad
     * @param presupuesto
     */

    public boolean evaluarCompraPrecio(int cantidad, int presupuesto){
        int total = cantidad * precio;

        if(total <= presupuesto){
            return true;
        }

        return false;
    }

    
    /** 
     * Método para modificar valores al comprar boletos
     * @param cantidad
     */
    public void Comprar(int cantidad){
        boletosDisponibles -= cantidad;
        boletosComprados += cantidad;
    }


}