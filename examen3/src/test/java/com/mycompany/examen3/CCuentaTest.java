/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.examen3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Sergio Otero
 */
public class CCuentaTest {
    
    public CCuentaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test deshabilitado
     */
    @Disabled
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CCuenta.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * @param cantidad double que se utiliza para introducir una cantidad en el sistema
     */
    @Test
    public void testIngresar_1() {
        System.out.println("Prueba método ingresar 1");
        double cantidad = -1d;
        CCuenta instance = new CCuenta();
        //Inicializo el valor en 100 por tener algo en la cuenta y visualizar mejor los resultados
        instance.dSaldo = 100;
        int expResult = 1;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);
    }
    /**
     * @param cantidad double que se utiliza para introducir una cantidad en el sistema
     */
    @Test
    public void testIngresar_2() {
        System.out.println("Prueba método ingresar 2");
        double cantidad = 1d;
        CCuenta instance = new CCuenta();
        //Inicializo el valor en 100 por tener algo en la cuenta y visualizar mejor los resultados
        instance.dSaldo = 100;
        int expResult = 0;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);
    }
   
    /**
     * @param cantidad double que se utiliza para introducir una cantidad en el sistema
     */
    @Test
    public void testIngresar_3() {
        System.out.println("Prueba método ingresar 3");
        double cantidad = 2999d;
        CCuenta instance = new CCuenta();
        //Inicializo el valor en 100 por tener algo en la cuenta y visualizar mejor los resultados
        instance.dSaldo = 100;
        int expResult = 0;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);
    }
    
    
    /**
     * @param cantidad double que se utiliza para introducir una cantidad en el sistema
     */
    @Test
    public void testIngresar_4() {
        System.out.println("Prueba método ingresar 4");
        double cantidad = 3000d;
        CCuenta instance = new CCuenta();
        //Inicializo el valor en 100 por tener algo en la cuenta y visualizar mejor los resultados
        instance.dSaldo = 100;
        int expResult = 0;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);
    }

    /**
     * Este test se ha deshabilitado
     */
    @Disabled
    public void testRetirar() {
        System.out.println("retirar");
        double cantidad = 0.0;
        CCuenta instance = new CCuenta();
        instance.retirar(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
