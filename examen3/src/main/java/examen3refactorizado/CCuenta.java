package examen3refactorizado;

/**
 * Datos sobre el autor
 * @author Sergio Otero
 * @since 2024-05-22
 */

public class CCuenta {

    /**
     * Propiedades de la Clase Cuenta
     * @param dSaldo double que contiene información sobre el saldo de la cuenta.
     * @param nombre String que contiene información sobre el nombre del titular de la cuenta.
     */ 
    private double dSaldo;
    private String nombre;
    
    /**
     * Main del programa
     * @param args aquí se ejecuta el programa
     */
    public static void main(String[] args) {

        CCuenta cuenta1 = new CCuenta();
        //Le damos un valor para facilitar la comprensión
        
        operativa_cuenta(cuenta1, 0);

    }
    /**
     * Método que agrupa todas las acciones que se realizan con cuenta1
     * @param cuenta1 instancia de la clase CCuenta
     * @param cantidad float que señala la cantidad con la que se va a interactuar en dicha cuenta.
     */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        System.out.println("Saldo Incial: " + cuenta1.getdSaldo() + " euros");
        cuenta1.ingresar(-1);
        
        System.out.println("Saldo Incial: " + cuenta1.getdSaldo() + " euros");
        cuenta1.ingresar(1);
        
        System.out.println("Saldo tras ingreso: " + cuenta1.getdSaldo() + " euros");
        cuenta1.ingresar(3000);
        
        System.out.println("Saldo tras ingreso: " + cuenta1.getdSaldo() + " euros");

        cuenta1.ingresar(2999);
        System.out.println("Saldo tras ingreso: " + cuenta1.getdSaldo() + " euros");
    }

    
    /**
     * Getter
     * @return dSaldo double que contiene el saldo de la cuenta.
     */
    public double getdSaldo() {
        return dSaldo;
    }

    /**
     * Setter
     * @param dSaldo double que contiene información sobre el saldo.
     */
    public void setdSaldo(double dSaldo) {
        this.dSaldo = dSaldo;
    }

    /**
     * Getter
     * @return nombre String que contiene el nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter
     * @param nombre String que contiene información sobre el titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Metodo para ingresar cantidades en la cuenta. Modifica el saldo.
     * @param cantidad double que se utiliza para señalar la cantidad a ingresar.
     * @return iCodErr int que señala el tipo de error que se ha producido. 0 es ninguno y 1 es que ha habido un fallo.
     */

    public int ingresar(double cantidad) {
        int iCodErr = 0;

        if (cantidad < 0) {
            System.out.println("No se puede ingresar una cantidad negativa");
            iCodErr = 1;
        } else if (cantidad >=0){
            setdSaldo(getdSaldo() + cantidad);
            iCodErr = 0;
        }else if (cantidad >= 3000) {
            System.out.println("Le recordamos que estamos obligados a notificar a Hacienda dicho ingreso (superior o igual a 3000€)");
            setdSaldo(getdSaldo() + cantidad);
            iCodErr = 0;
        }

        return iCodErr;
    }

    /**
     * Metodo para retirar cantidades en la cuenta. Modifica el saldo.
     * @param cantidad double que se utiliza para señalar la cantidad a retirar.
     */
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se puede retirar una cantidad negativa");
        } else if (getdSaldo() < cantidad) {
            System.out.println("No  hay suficiente saldo");
        } else {
            setdSaldo(getdSaldo() - cantidad);
            System.out.println("Le quedan " + getdSaldo() + " en cuenta");
        }
    }
}
