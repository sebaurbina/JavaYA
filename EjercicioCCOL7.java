/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioccol7;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioCCOL7 {

    /**
     * @param args the command line arguments
     * Escribir un programa en el cual: dada una lista de tres valores numéricos
     * distintos se calcule e informe su rango de variación (debe mostrar el
     * mayor y el menor de ellos).
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        int valor1;
        int valor2;
        int valor3;
        
        System.out.println("Ingrese el primer valor");
        valor1 = miSc.nextInt();
        
        System.out.println("Ingrese el segundo valor");
        valor2 = miSc.nextInt();
        
        System.out.println("Ingrese el tercer valor");
        valor3 = miSc.nextInt();
        
        if (valor1>valor2 && valor1>valor3) {
            System.out.println("El primer valor es el mayor");
        }
        else
        {
            if (valor2>valor3) {
                System.out.println("El segundo valor es el mayor");
            }
            else
            {
                System.out.println("El tercer valor es el mayor");
            }
        }
        
        if (valor1<valor2 && valor2<valor3) {
            System.out.println("El primer valor es el menor");
        }
        else
        {
            if (valor2<valor3) {
                System.out.println("El segundo valor es el menor");
            }
            else
            {
                System.out.println("El tercer valor es el menor");
            }
        }
        
    }
    
}
