/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioeca4;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioECA4 {

    /**
     * @param args the command line arguments
     * Un postulante a un empleo, realiza un test de capacitación, se obtuvo la
     * siguiente información: cantidad total de preguntas que se le realizaron
     * y la cantidad de preguntas que contestó correctamente. 
     * Se pide confeccionar un programa que ingrese los dos datos por teclado e
     * informe el nivel del mismo según el porcentaje de respuestas correctas
     * que ha obtenido, y sabiendo que:
     *	Nivel máximo:	Porcentaje>=90%.
     *	Nivel medio:	Porcentaje>=75% y <90%.
     *	Nivel regular:	Porcentaje>=50% y <75%.
     *	Fuera de nivel:	Porcentaje<50%.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner miSc = new Scanner(System.in);
        
        int preguntas;
        int correctas;
        int resultado;
        
        System.out.println("Cantidad de preguntas que le realizaron");
        preguntas = miSc.nextInt();
        
        System.out.println("Cantidad de preguntas que contesto correctamente");
        correctas = miSc.nextInt();
        
        resultado = correctas * 100 / preguntas;
        
        if (resultado >= 90) {
            System.out.println("Nivel máximo");
        }else{
            if (resultado >=75) {
                System.out.println("Nivel medio");
            }
            else {
                if (resultado >=50) {
                    System.out.println("Nivel regular");
                }
                else{System.out.println("Fuera de nivel");}
            }
        }
        
        
    }
    
}
