/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.novacorp.sergiopolinomio.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class OperacionesTest {
    
    public OperacionesTest() {
    }

    /**
     * Test of Derivar method, of class Operaciones.
     */
    @Test
    public void testDerivar() {
        System.out.println("Derivar");
        String polinomio = "sin(x)";
        Operaciones instance = new Operaciones();
        String expResult = "cos(x)";
        String result = instance.Derivar(polinomio);
        assertEquals(expResult, result);
        if (!result.equals(expResult)){
            fail("Falló la prueba unitaria para el método derivar");            
        }
        
    }
    
}
