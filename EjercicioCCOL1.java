/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioccol1;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioCCOL1 {

    /**
     * @param args the command line arguments
     * 1) Realizar un programa que pida cargar una fecha cualquiera, luego
     * verificar si dicha fecha corresponde a Navidad.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        int dia;
        int mes;
        
        System.out.println("¿Qué día es?");
        dia = miSc.nextInt();
        
        System.out.println("¿Qué mes es?");
        mes = miSc.nextInt();
        
        if (dia==24 && mes==12) {
            System.out.println("Es navidad");
        }
        
        
    }
    
}
