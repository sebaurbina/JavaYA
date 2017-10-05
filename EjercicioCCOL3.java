/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioccol3;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioCCOL3 {

    /**
     * @param args the command line arguments
     * Se ingresan por teclado tres números, si todos los valores ingresados son
     * menores a 10, imprimir en pantalla la leyenda "Todos los números son
     * menores a diez".
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
        
        if (valor1<10 && valor2<10 && valor3<10) {
            System.out.println("Todos los números son menores a diez");
        }
        
    }
    
}
