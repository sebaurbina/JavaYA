/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosvectorproblema1;

import java.util.Scanner;

/**
 * Se desea guardar los sueldos de 5 operarios.
* Según lo conocido deberíamos definir 5 variables si queremos tener en un cierto
* momento los 5 sueldos almacenados en memoria.
* Empleando un vector solo se requiere definir un único nombre y accedemos a cada
* elemento por medio del subíndice.
 * 
 * @author sebastianurbina
 */
public class Prueba1 {
    
    private int[] sueldos;
    
    public void cargar()
    {
        Scanner miSc = new Scanner(System.in);
        
        sueldos = new int[5];
        
        for (int contador = 0; contador < 5; contador++) {
            System.out.println("Ingrese el sueldo: ");
            sueldos[contador] = miSc.nextInt();
        }
    }
    
    public void mostrar()
    {
        for (int contador = 0; contador < 5; contador++) {
            System.out.println(sueldos[contador]);
        }
    }
    
}
