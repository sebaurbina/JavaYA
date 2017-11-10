/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseyobjetos;

import java.util.Scanner;

/**
 * Confeccionar una clase que permita carga el nombre y la edad de una persona.
 * Mostrar los datos cargados. Imprimir un mensaje si es mayor de edad (edad>=18)
 * 
 *
 * @author sebastianurbina
 */
public class Persona {
    
    private String nombre;
    private int edad;
    
    public void cargar()
    {
        Scanner miSc = new Scanner (System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = miSc.next();
        System.out.println("Ingrese su edad: ");
        edad = miSc.nextInt();
    }
    
    public void imprimir()
    {
        System.out.println("El nombre es " + nombre);
        System.out.println("La edad es " + edad);
    }
    
    public void esMayorEdad()
    {
        if (edad>17) {
            System.out.println(nombre + " es mayor de edad");
        }
        else
        {
            System.out.println(nombre + " es menor de edad");
        }
    }
    
}
