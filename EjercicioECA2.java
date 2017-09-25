/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioeca2;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioECA2 {

    /**
     * @param args the command line arguments
     * Se ingresa por teclado un valor entero, mostrar una leyenda que indique
     * si el número es positivo, nulo o negativo.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese un número: ");
        num = miSc.nextInt();
        
        if (num>0) {
            System.out.println("Su número es positivo");
        }else{
            if (num<0) {
                System.out.println("Su número es negativo");
            }else{
            System.out.println("Su número es neutro");}
        }
        
    }
    
}
