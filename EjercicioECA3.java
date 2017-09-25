/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioeca3;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioECA3 {

    /**
     * @param args the command line arguments
     * Confeccionar un programa que permita cargar un número entero positivo de
     * hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3
     * cifras. Mostrar un mensaje de error si el número de cifras es mayor.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese su número: ");
        num = miSc.nextInt();
        
        if (num<1000) {
            if (num>99) {
                System.out.println("Su número tiene 3 cifras");
            }else{
            if (num>9) {
                System.out.println("Su número tiene 2 cifras");
            }else{
                System.out.println("Su número tiene 1 cifra");
            }}
        }else{
            System.out.println("Error");
        }
        
    }
    
}
