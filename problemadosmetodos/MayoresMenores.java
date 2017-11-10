/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemadosmetodos;

import java.util.Scanner;

/**
 *Confeccionar una clase que permita ingresar tres valores por teclado. 
 * Luego mostrar el mayor y el menor.
 * 
 * @author sebastianurbina
 */
public class MayoresMenores {
    
    public void cargar()
    {
        int valor1;
        int valor2;
        int valor3;
        int mayor;
        int menor;
        
        Scanner miSc = new Scanner(System.in);
        
        System.out.println("Ingres el valor 1: ");
        valor1 = miSc.nextInt();
        
        System.out.println("Ingres el valor 2: ");
        valor2 = miSc.nextInt();
        
        System.out.println("Ingres el valor 3: ");
        valor3 = miSc.nextInt();
        
        mayor = calcularMayor(valor1, valor2, valor3);
        menor = calcularMenor(valor1, valor2, valor3);
        
        System.out.println("El mayor es " + mayor);
        System.out.println("El menor es " + menor);
    }
    
    public int calcularMayor(int v1, int v2, int v3)
    {
        int m;
        
        if (v1>v2 && v1>v3) {
            m=v1;
        }
        else
        {
            if (v2>v3) {
                m=v2;
            }
            else
            {
                m=v3;
            }
        }
        
        return m;
    }
    
    public int calcularMenor(int v1, int v2, int v3)
    {
        int m;
        
        if (v1<v2 && v1<v3) {
            m=v1;
        }
        else
        {
            if (v2<v3) {
                m=v2;
            }
            else
            {
                m=v3;
            }
        }
        
        return m;
    }
    
}
