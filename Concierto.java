import java.util.Random;
import java.util.Scanner;

public class Concierto{

    private Usuario usuarioActual;
    private int ticketActual;
    private Localidad localidad1;
    private Localidad localidad5;
    private Localidad localidad10;
    private Scanner scanner;
    private Random random;
    private boolean programa;

    /** 
     * Constructor predeterminado
     */

    public Concierto(){
        scanner = new Scanner(System.in);
        random = new Random();
        usuarioActual = new Usuario();
        localidad1 = new Localidad("Localidad 1", 100);
        localidad5 = new Localidad("Localidad 5", 500);
        localidad10 = new Localidad("Localidad 10", 1000);
        programa = true;
    }

    
    /** 
     * @return Usuario
     */
    public Usuario getUsuarioActual(){
        return this.usuarioActual;
    }

    
    /** 
     * @param usuarioActual
     */
    public void setUsuarioActual(Usuario usuarioActual){
        this.usuarioActual = usuarioActual;
    }

    
    /** 
     * @return int
     */
    public int getTicketActual(){
        return this.ticketActual;
    }

    
    /** 
     * @param ticketActual
     */
    public void setTicketActual(int ticketActual){
        this.ticketActual = ticketActual;
    }

    
    /** 
     * @return Localidad
     */
    public Localidad getLocalidad1(){
        return this.localidad1;
    }

    
    /** 
     * @param localidad1
     */
    public void setLocalidad1(Localidad localidad1){
        this.localidad1 = localidad1;
    }

    
    /** 
     * @return Localidad
     */
    public Localidad getLocalidad5(){
        return this.localidad5;
    }

    
    /** 
     * @param localidad5
     */
    public void setLocalidad5(Localidad localidad5){
        this.localidad5 = localidad5;
    }

    
    /** 
     * @return Localidad
     */
    public Localidad getLocalidad10(){
        return this.localidad10;
    }

    
    /** 
     * @param localidad10
     */
    public void setLocalidad10(Localidad localidad10){
        this.localidad10 = localidad10;
    }

    /** 
     * Método para modificar campo de comprador actual
     */

    public void nuevoComprador(){
        System.out.println("Ingresar la información del nuevo comprador");

        System.out.println("Nombre:");
        String nuevoNombre = scanner.nextLine();

        System.out.println("Email:");
        String nuevoEmail = scanner.nextLine();

        System.out.println("Cantidad boletos: ");
        int nuevoCantidadBoletos = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Presupuesto: ");
        int nuevoPresupuesto = scanner.nextInt();
        scanner.nextLine();

        usuarioActual.setNombre(nuevoNombre);
        usuarioActual.setEmail(nuevoEmail);
        usuarioActual.setCantidadBoletos(nuevoCantidadBoletos);
        usuarioActual.setPresupuesto(nuevoPresupuesto);
        ticketActual = random.nextInt(14999)+1;

        System.out.println("Usuario regstrado exitosamente");

    }

    
    /** 
     * Método que evalua si el ticket del comprador actual es válido dentro de un rango aleatorio
     * @return boolean
     */
    public boolean evaluarSolicitudBoletos(){
        int a = random.nextInt(14999)+1;
        int b = random.nextInt(14999)+1;

        //random.nextInt(14999)+1;

        if(a > b){
            if(ticketActual >= b && ticketActual <= a){
                System.out.println("Ticket valido con valor " + ticketActual + " ya que se encuentra dentro del rango de b: " + b + " y a: " + a);
                return true;
            }
        }
        else{
            if(ticketActual >= a && ticketActual <= b){
                System.out.println("Ticket valido con valor " + ticketActual + " ya que se encuentra dentro del rango de a: " + a + " y b: " + b);
                return true;
            }
        }
        System.out.println("Ticket invalido con valor " + ticketActual + " por estar fuera de rango de valor a: " + a + " y valor b: " + b + " suerte para el próximo concierto");
        return false;
    }


    /** 
     * Método que compra boletos si se cumplen todas las verificaciones
     */

    public void solicitudBoletos(){

        if(evaluarSolicitudBoletos()){

            int opcion = random.nextInt(2)+1;

            switch (opcion){

                case 1:
                    if(localidad1.evaluarDisponibilidad(usuarioActual.getCantidadBoletos()) && localidad1.evaluarCompraPrecio(usuarioActual.getCantidadBoletos(), usuarioActual.getPresupuesto())){
                        localidad1.Comprar(usuarioActual.getCantidadBoletos());
                        System.out.println("Factura");
                        System.out.println("Usted ha comprado " + usuarioActual.getCantidadBoletos() + " en la localidad aleatoria 1");
                        System.out.println("Nombre: " + usuarioActual.getNombre());
                        System.out.println("Email: " + usuarioActual.getEmail());
                        System.out.println("Presupuesto: " + usuarioActual.getPresupuesto());
                        System.out.println("¡Disfrute su concierto! Cerrando programa para usuario actual");
                        nuevoComprador(); 
                    }
                    else{
                        System.out.println("Lamentamos informar que no existen suficientes boletos para la localidad seleccionada aleatoriamente o su presupuesto no es suficiente. Debido a esto cambiaremos a un nuevo comprador, suerte en el próximo concierto");
                        System.out.println("------------------------------------------------------------------------------------------------------------------");
                        nuevoComprador();
                    }
                    break;

                case 2:
                    if(localidad5.evaluarDisponibilidad(usuarioActual.getCantidadBoletos()) && localidad5.evaluarCompraPrecio(usuarioActual.getCantidadBoletos(), usuarioActual.getPresupuesto())){
                        localidad5.Comprar(usuarioActual.getCantidadBoletos());  
                        System.out.println("Factura");
                        System.out.println("Usted ha comprado " + usuarioActual.getCantidadBoletos() + " en la localidad aleatoria 5");
                        System.out.println("Nombre: " + usuarioActual.getNombre());
                        System.out.println("Email: " + usuarioActual.getEmail());
                        System.out.println("Presupuesto: " + usuarioActual.getPresupuesto());
                        System.out.println("¡Disfrute su concierto! Cerrando programa para usuario actual");
                        nuevoComprador();               
                    }
                    else{
                        System.out.println("Lamentamos informar que no existen suficientes boletos para la localidad seleccionada aleatoriamente o su presupuesto no es suficiente. Debido a esto cambiaremos a un nuevo comprador, suerte en el próximo concierto");
                        System.out.println("------------------------------------------------------------------------------------------------------------------");
                        nuevoComprador();
                    }
                    break;

                case 3:
                    if(localidad10.evaluarDisponibilidad(usuarioActual.getCantidadBoletos()) && localidad10.evaluarCompraPrecio(usuarioActual.getCantidadBoletos(), usuarioActual.getPresupuesto())){
                        localidad10.Comprar(usuarioActual.getCantidadBoletos());         
                        System.out.println("Factura");
                        System.out.println("Usted ha comprado " + usuarioActual.getCantidadBoletos() + " en la localidad aleatoria 10");
                        System.out.println("Nombre: " + usuarioActual.getNombre());
                        System.out.println("Email: " + usuarioActual.getEmail());
                        System.out.println("Presupuesto: " + usuarioActual.getPresupuesto());
                        System.out.println("¡Disfrute su concierto! Cerrando programa para usuario actual");
                        System.out.println("¡Disfrute su concierto! Cerrando programa para usuario actual");
                        nuevoComprador();         
                    }
                    else{
                        System.out.println("Lamentamos informar que no existen suficientes boletos para la localidad seleccionada aleatoriamente o su presupuesto no es suficiente. Debido a esto cambiaremos a un nuevo comprador, suerte en el próximo concierto");
                        System.out.println("------------------------------------------------------------------------------------------------------------------");
                        nuevoComprador();
                    }
                    break;


            }

        }
    }

    /** 
     * Método que evalua la disponibilidad de todas las localidades
     */
    public void consultarDisponibilidadTotal(){
        System.out.println("Boletos disponibles localidad 1: " + localidad1.getBoletosDisponibles() + " Boletos vendidos localidad 1: " + localidad1.getBoletosComprados());
        System.out.println("Boletos disponibles localidad 5: " + localidad5.getBoletosDisponibles() + " Boletos vendidos localidad 5: " + localidad5.getBoletosComprados());
        System.out.println("Boletos disponibles localidad 10: " + localidad10.getBoletosDisponibles() + " Boletos vendidos localidad 10: " + localidad10.getBoletosComprados());
    }

    /** 
     * Método que evalua disponiblidad de una localidad 
     */
    public void consultarDisponibilidadIndividual(){
        System.out.println("Ingrese el número de la localidad que desea para verificar su disponibilidad.");
        System.out.println("1. Localidad 1");
        System.out.println("2. Localidad 5");
        System.out.println("3. Localidad 10");

        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion){
            case 1:
                System.out.println("Boletos disponibles localidad 1: " + localidad1.getBoletosDisponibles());
                break;
            case 2:
                System.out.println("Boletos disponibles localidad 5: " + localidad5.getBoletosDisponibles());
                break;
            case 3:
                System.out.println("Boletos disponibles localidad 10: " + localidad10.getBoletosDisponibles());
                break;         

        }
    }


    /** 
     * Método que brinda resumen de las operaciones realizadas
     */
    public void reporteCaja(){
        int total1 = localidad1.getBoletosComprados() * localidad1.getPrecio();
        int total2 = localidad5.getBoletosComprados() * localidad5.getPrecio();
        int total3 = localidad10.getBoletosComprados() * localidad10.getPrecio();

        System.out.println("Ganacia total de localidad 1: " + total1);
        System.out.println("Ganacia total de localidad 5: " + total2);
        System.out.println("Ganacia total de localidad 10: " + total3);
    }

    /** 
     * Método que permite el registro, compra y evaluación de boletos automáticamente
     */
    public void menu(){

        while(programa){
            System.out.println("Bienvenido a la prueba piloto para la compra de entras de Eras Tour \n Seleccione alguna opción para continuar");
            System.out.println("1. Nuevo comprador \n 2. Nueva solicitud de boletos \n 3. Consultar disponibilidad total \n 4. Consultar disponibilidad individual \n 5. Reporte de caja \n 6. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    nuevoComprador();
                    System.out.println("---------------------------------------------------------------------------");
                    break;

                case 2:
                    solicitudBoletos();
                    System.out.println("---------------------------------------------------------------------------");
                    break;

                case 3:
                    consultarDisponibilidadTotal();
                    System.out.println("---------------------------------------------------------------------------");
                    break;

                case 4:
                    consultarDisponibilidadIndividual();
                    System.out.println("---------------------------------------------------------------------------");
                    break;

                case 5:
                    reporteCaja();
                    System.out.println("---------------------------------------------------------------------------");
                    break;

                case 6:
                    programa = false;
                    System.out.println("---------------------------------------------------------------------------");
                    break;
            }
        }

    }
}

