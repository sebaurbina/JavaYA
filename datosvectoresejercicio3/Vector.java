/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosvectoresejercicio3;

import java.util.Scanner;

/**
 *
 * Se tienen las notas del primer parcial de los alumnos de dos cursos, el curso
 * A y el curso B, cada curso cuenta con 5 alumnos.
 * Realizar un programa que muestre el curso que obtuvo el mayor promedio general.
 * 
 * @author sebastianurbina
 */
public class Vector {
    
    int notasA[];
    int notasB[];
    
    public void cargar()
    {
        Scanner miSc = new Scanner(System.in);
        
        notasA = new int[5];
        notasB = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nota del curso A");
            notasA[i] = miSc.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nota del curso B");
            notasB[i] = miSc.nextInt();
        }   
    }
    
    public void calcularPromedio()
    {
        int sumaA=0;
        int sumaB=0;
        int promedioA;
        int promedioB;
        
        
        for (int i = 0; i < 5; i++) {
            sumaA = sumaA + notasA[i];
        }
        
        for (int i = 0; i < 5; i++) {
            sumaB = sumaB + notasB[i];
        }
        
        promedioA = sumaA/notasA.length;
        promedioB = sumaB/notasB.length;
        
        if (promedioA>promedioB) {
            System.out.println("El curso que obtuvo mejor promedio fue el A");
        }else
        {
            System.out.println("El curso que obtuvo mejor promedio fue el B");
        }
       
    }
    
}
