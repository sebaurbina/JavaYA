/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseyobjetosproblema2;

import java.util.Scanner;

/**
 * Desarrollar un programa que cargue los lados de un triángulo e implemente los
 * siguientes métodos: inicializar los atributos, imprimir el valor del lado
 * mayor y otro método que muestre si es equilátero o no
 * 
 * 
 * @author sebastianurbina
 */
public class Triangulo {
    
    private int lado1;
    private int lado2;
    private int lado3;
    
    public void cargar()
    {
        Scanner miSc = new Scanner(System.in);
        System.out.println("Ingrese el primer lado: ");
        lado1 = miSc.nextInt();
        System.out.println("Ingrese el segundo lado: ");
        lado2 = miSc.nextInt();
        System.out.println("Ingrese el tercer lado: ");
        lado3 = miSc.nextInt();
    }
    
    public void mayor()
    {
        if (lado1>lado2 && lado1>lado3) {
            System.out.println("El lado 1 es el mayor");
        }else
        {
            if (lado2>lado3) {
                System.out.println("El lado 2 es el mayor");
            }
            else
            {
                System.out.println("El lado 3 es el mayor");
            }
        }
        
        
    }
    
    public void equilatero()
    {
        if (lado1==lado2 && lado2==lado3 && lado1==lado3) {
            System.out.println("Es equilátero");
        }
        else
        {
            System.out.println("No es equilátero");
        }
    }
    
}
