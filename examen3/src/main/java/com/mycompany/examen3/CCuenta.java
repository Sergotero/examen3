package com.mycompany.examen3;

/**
 * 
 * @author Sergio Otero
 */

public class CCuenta {
    // Propiedades de la Clase Cuenta
    public double dSaldo;
    public String nombre;

    public static void main(String[] args) {

        CCuenta miCuenta = new CCuenta();
        //Le damos un valor para facilitar la comprensión
        miCuenta.dSaldo = 100;

        System.out.println("Saldo Incial: " + miCuenta.dSaldo + " euros");
        miCuenta.ingresar(-1);
        
        System.out.println("Saldo Incial: " + miCuenta.dSaldo + " euros");
        miCuenta.ingresar(1);
        
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        miCuenta.ingresar(3000);
        
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");

        miCuenta.ingresar(2999);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");

    }

    /**
     * Metodo para ingresar cantidades en la cuenta. Modifica el saldo.
     * @param cantidad double que se utiliza para señalar la cantidad a ingresar.
     * @return iCoderr int que señala el tipo de error que se ha producido. 0 es ninguno y 1 es que ha habido un fallo.
     */

    public int ingresar(double cantidad) {
        int iCodErr = 0;

        if (cantidad < 0) {
            System.out.println("No se puede ingresar una cantidad negativa");
            iCodErr = 1;
        } else if (cantidad >=0){
            dSaldo = dSaldo + cantidad;
            iCodErr = 0;
        }else if (cantidad >= 3000) {
            System.out.println("Le recordamos que estamos obligados a notificar a Hacienda dicho ingreso (superior o igual a 3000€)");
            dSaldo = dSaldo + cantidad;
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
        } else if (dSaldo < cantidad) {
            System.out.println("No  hay suficiente saldo");
        } else {
            dSaldo = dSaldo - cantidad;
            System.out.println("Le quedan " + dSaldo + " en cuenta");
        }
    }
}
