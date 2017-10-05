/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioccol2;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioCCOL2 {

    /**
     * @param args the command line arguments
     * 2) Se ingresan tres valores por teclado, si todos son iguales se imprime 
     * la suma del primero con el segundo y a este resultado se lo multiplica 
     * por el tercero.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        int valor1;
        int valor2;
        int valor3;
        int suma;
        int multiplicacion;
        
        System.out.println("Ingrese el primer valor");
        valor1 = miSc.nextInt();
        
        System.out.println("Ingrese el segundo valor");
        valor2 = miSc.nextInt();
        
        System.out.println("Ingrese el tercer valor");
        valor3 = miSc.nextInt();
        
        if (valor1==valor2 && valor2==valor3) {
            suma = valor1 + valor2;
            multiplicacion = suma * valor3;
            
            System.out.println("El resultado final es " + multiplicacion);
        }
               
        
    }
    
}
