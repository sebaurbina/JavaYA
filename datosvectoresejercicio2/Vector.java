/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosvectoresejercicio2;

import java.util.Scanner;

/**
 * Realizar un programa que pida la carga de dos vectores numéricos enteros de
 * 4 elementos. Obtener la suma de los dos vectores, dicho resultado guardarlo 
 * en un tercer vector del mismo tamaño. Sumar componente a componente.
 * 
 * 
 * @author sebastianurbina
 */
public class Vector {
    
    int vector1[];
    int vector2[];
    
    public void cargar()
    {
        Scanner miSc = new Scanner(System.in);
        
        vector1 = new int[4];
        vector2 = new int[4];
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese el vector");
            vector1[i] = miSc.nextInt();
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese el vector");
            vector2[i] = miSc.nextInt();
        }   
    }
    
    public void suma()
    {
        int suma[];
        suma = new int[4];
        
        for (int i = 0; i < 4; i++) {
            suma[i] = vector1[i] + vector2[i];
        }
        System.out.println("Vector Resultante");
        for (int i = 0; i < 4; i++) {
            System.out.println(suma[i]);
        }
        
    }
    
}
