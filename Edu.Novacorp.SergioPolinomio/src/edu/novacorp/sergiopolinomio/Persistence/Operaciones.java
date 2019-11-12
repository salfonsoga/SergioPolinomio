/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.novacorp.sergiopolinomio.Persistence;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

public class Operaciones {
    public String Derivar(String polinomio){
        String derivada = "";
        DJep operacion = new DJep();
        operacion.addStandardFunctions();    //Permite agregar funciones trigonometricas
        operacion.addStandardConstants();   //Permite agregar las constantes
        operacion.addComplex();             //Permite agregar numeros complejos
        operacion.setAllowUndeclared(true); //Permite agregar variables no declaradas
        operacion.setAllowAssignment(true);
        operacion.setImplicitMul(true);    //Permite adicionar la jerarquia de operaciones 
        operacion.addStandardDiffRules();    //permite adicionar reglas de diferenciacion para las derivadas
        
        try {
            Node funcion = operacion.parse(polinomio);
            Node diferencia = operacion.differentiate(funcion,"x"); //Sobre a que variable derivare la funcion
            Node simplificar = operacion.simplify(diferencia); //Simplificar
            derivada = operacion.toString(simplificar); //Convertir el resultado a string
                
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return derivada;
    }
    
}
