/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioeca1;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioECA1 {

    /**
     * @param args the command line arguments
     * Se cargan por teclado tres números distintos. Mostrar por pantalla el 
     * mayor de ellos.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;
        
        System.out.println("Ingrese el primer número ");
        num1 = miSc.nextInt();
        
        System.out.println("Ingrese el segundo número ");
        num2 = miSc.nextInt();
        
        System.out.println("Ingrese el tercer número ");
        num3 = miSc.nextInt();
        
        if (num1>num2 && num1>num3) {
            System.out.println("El primer número es el mayor");
        }
        else{
            if (num2>num3) {
                System.out.println("El segundo número es el mayor");
            }else{
                System.out.println("El tercer número es el mayor");
            }
        }
        
        
    }
    
}
