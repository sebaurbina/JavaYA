/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosvectorejercicio1;

import java.util.Scanner;

/**
 *
 * Desarrollar un programa que permita ingresar un vector de 8 elementos, e informe:
 * El valor acumulado de todos los elementos del vector.
 * El valor acumulado de los elementos del vector que sean mayores a 36.
 * Cantidad de valores mayores a 50.
 * 
 * 
 * @author sebastianurbina
 */
public class Vectores {
    
    int vector[];
    
    public void cargar()
    {
        Scanner miSc = new Scanner(System.in);
        
        vector = new int[8];
        
        for (int i = 0; i < 8; i++) {
            System.out.println("Ingrese el vector");
            vector[i] = miSc.nextInt();
        }
    }
    
    public void acumulado()
    {
        int suma=0;
        
        for (int i = 0; i < 8; i++) {
            suma = suma + vector[i];
        }
        System.out.println("El valor acumulado de todos los elementos del"
                + " vector es " + suma);
    }
    
    public void mayores36()
    {
        int acumulado=0;
        
        for (int i = 0; i < 8; i++) {
            if (vector[i]>36) {
                acumulado = acumulado + vector[i];
            }
            else
            {
                
            }
        }
        System.out.println("El valor acumulados de todos los elementos del"
                + " vector que sean mayores a 36 es " + acumulado);
    }
    
    public void cantidad()
    {
        int valoresMayores=0;
        
        for (int i = 0; i < 8; i++) {
            if (vector[i]>50) {
                valoresMayores++;
            }
        }
        System.out.println("La cantidad de valores mayores a 50 es " + valoresMayores);
    }
    
}
