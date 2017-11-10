/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseyobjetos;

/**
 *
 * @author sebastianurbina
 */
public class ClaseYObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona persona1 = new Persona();
        persona1.cargar();
        persona1.imprimir();
        persona1.esMayorEdad();
    }
    
}
