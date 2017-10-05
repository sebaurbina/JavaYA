/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioccol6;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioCCOL6 {

    /**
     * @param args the command line arguments
     * De un operario se conoce su sueldo y los años de antigüedad. Se pide
     * confeccionar un programa que lea los datos de entrada e informe:
     *  a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior
     *  a 10 años, otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
     *  b)Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, 
     *  otorgarle un aumento de 5 %.
     *  c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla
     *  sin cambios.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner miSc=new Scanner(System.in);
        float sueldo;
        int antiguedad;
        float sueldoTotal;
        
        System.out.print("Ingrese sueldo del empleado:");
        sueldo=miSc.nextFloat();
        
        System.out.print("Ingrese su antiguedad en años:");
        antiguedad=miSc.nextInt();
        
        if (sueldo<500 && antiguedad>10) {
            float aumento;
            aumento = sueldo * 0.20f;
            sueldoTotal=sueldo+aumento;
            
            System.out.print("Sueldo a pagar: " + sueldoTotal);
           
        } 
        else 
        {
            if (sueldo<500) {
                float aumento=sueldo * 0.05f;
                sueldoTotal=sueldo+aumento;
                
                System.out.print("Sueldo a pagar: " + sueldoTotal);
                          
            } 
            else 
            {
            	System.out.print("Sueldo a pagar: " + sueldo);
                
            }
        }
        
    }
    
}
