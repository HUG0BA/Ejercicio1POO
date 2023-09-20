public class Usuario{

    private String nombre;
    private String email;
    private int cantidadBoletos;
    private int presupuesto;


    /** 
     * Constructor con parámetros
     * @param nombre
     * @param email
     * @param cantidadBoletos
     * @param presupuesto
     */
    public Usuario(String nombre, String email, int cantidadBoletos, int presupuesto){
        this.nombre = nombre;
        this.email = email;
        this.cantidadBoletos = cantidadBoletos;
        this.presupuesto = presupuesto;
    }    

     /** 
     * Constructor predeterminado
     */

    public Usuario(){
        this.nombre = "Hugo";
        this.email = "hugo@gmail.com";
        this.cantidadBoletos = 1;
        this.presupuesto = 1000;
    }

    
    /** 
     * Geter de nombre
     * @return String
     */
    
    public String getNombre(){
        return this.nombre;
    }

    
    /** 
     * Seter de nombre
     * @param nombre
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    
    /** 
     * Geter de email
     * @return String
     */
    public String getEmail(){
        return this.email;
    }

    
    /** 
     * Seter de email
     * @param email
     */
    public void setEmail(String email){
        this.email = email;
    }

    
    /** 
     * Geter de cantidad boletos
     * @return int
     */
    public int getCantidadBoletos(){
        return this.cantidadBoletos;
    }

    
    /** 
     * Seter de cantidad boletos
     * @param cantidadBoletos
     */
    public void setCantidadBoletos(int cantidadBoletos){
        this.cantidadBoletos = cantidadBoletos;
    }

    
    /** 
     * geter de presupuesto
     * @return int
     */
    public int getPresupuesto(){
        return this.presupuesto;
    }

    
    /** 
     * Seter de presupuesto
     * @param presupuesto
     */
    public void setPresupuesto(int presupuesto){
        this.presupuesto = presupuesto;
    }

}