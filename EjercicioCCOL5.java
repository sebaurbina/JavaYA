/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioccol5;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioCCOL5 {

    /**
     * @param args the command line arguments
     * Escribir un programa que pida ingresar la coordenada de un punto en el
     * plano, es decir dos valores enteros x e y (distintos a cero).
     * Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto. 
     * (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        int x;
        int y;
        
        System.out.println("Ingrese el primer valor");
        x = miSc.nextInt();
        
        System.out.println("Ingrese el segundo valor");
        y = miSc.nextInt();
        
        if (x>0 && y>0) {
            System.out.println("1º cuadrante");
        }
        else
        {
            if (x<0 && y>0) {
                System.out.println("2º cuadrante");
            }
            else
            {
                if (x<0 && y<0) 
                {
                    System.out.println("3º cuadrante");
                }
                else
                {
                    System.out.println("4 cuadrante");
                }
            }
            
        }
        
        
    }
    
}
