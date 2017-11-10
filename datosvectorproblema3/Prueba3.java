/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosvectorproblema3;

import java.util.Scanner;

/**
 * 
 * Una empresa tiene dos turnos (mañana y tarde) en los que trabajan 8 empleados
 * (4 por la mañana y 4 por la tarde).
 * Confeccionar un programa que permita almacenar los sueldos de los empleados
 * agrupados por turno.
 * Imprimir los gastos en sueldos de cada turno.
 *
 * @author sebastianurbina
 */
public class Prueba3 {
    
    float turnoMañana[];
    float turnoTarde[];
    
    public void cargar()
    {
        Scanner miSc = new Scanner(System.in); 
        turnoMañana = new float[4];
        turnoTarde = new float[4];
        
        System.out.println("Sueldos de los empleados de la mañana");
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese sueldo");
            turnoMañana[i] = miSc.nextFloat();
        }
        System.out.println("Sueldos de los empleados de la tarde");
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese sueldo");
            turnoTarde[i] = miSc.nextFloat();
        }
    }
    
    public void imprimir()
    {
        float mañana=0;
        float tarde=0;
        
        for (int i = 0; i < 4; i++) {
            mañana = mañana + turnoMañana[i];
            tarde = tarde + turnoTarde[i];
        }
        System.out.println("Los sueldos de la mañana: " + mañana);
        System.out.println("Los sueldos de la tarde: " + tarde);
    }
    
}
