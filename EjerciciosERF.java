/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioserf;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjerciciosERF {

    /**
     * @param args the command line arguments
     * 
     * 
     * 1) Confeccionar un programa que lea n pares de datos, cada par de datos 
     * corresponde a la medida de la base y la altura de un triángulo. 
     * El programa deberá informar:
    *a) De cada triángulo la medida de su base, su altura y su superficie. 
    *b) La cantidad de triángulos cuya superficie es mayor a 12.
    * 
    * 2) Desarrollar un programa que solicite la carga de 10 números e imprima
    * la suma de los últimos 5 valores ingresados.
    * 
    *3) Desarrollar un programa que muestre la tabla de multiplicar
    * del 5 (del 5 al 50).
    * 
    *4) Confeccionar un programa que permita ingresar un valor del 1 al 10
    * y nos muestre la tabla de multiplicar del mismo (los primeros 12 términos)
    *Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9,
    * hasta el 36.
    * 
    *5) Realizar un programa que lea los lados de n triángulos, e informar:
    *a) De cada uno de ellos, qué tipo de triángulo es: equilátero
    * (tres lados iguales), isósceles (dos lados iguales),
    * o escaleno (ningún lado igual)
    *b) Cantidad de triángulos de cada tipo.
    *c) Tipo de triángulo que posee menor cantidad.
    * 
    *6) Escribir un programa que pida ingresar coordenadas (x,y) que representan
    * puntos en el plano.
    * Informar cuántos puntos se han ingresado en el primer, segundo, tercer y
    * cuarto cuadrante. Al comenzar el programa se pide que se ingrese la
    * cantidad de puntos a procesar.
    * 
    *7) Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
    *a) La cantidad de valores ingresados negativos.
    *b) La cantidad de valores ingresados positivos.
    *c) La cantidad de múltiplos de 15.
    *d) El valor acumulado de los números ingresados que son pares.
    * 
    *8) Se cuenta con la siguiente información:
    *Las edades de 50 estudiantes del turno mañana.
    *Las edades de 60 estudiantes del turno tarde.
    *Las edades de 110 estudiantes del turno noche.
    *Las edades de cada estudiante deben ingresarse por teclado.
    *a) Obtener el promedio de las edades de cada turno (tres promedios)
    *b) Imprimir dichos promedios (promedio de cada turno)
    *c) Mostrar por pantalla un mensaje que indique cual de los tres turnos
    * tiene un promedio de edades mayor.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //EjerciciosERF.EjercicioUno();
        //EjerciciosERF.EjercicioDos();
        //EjerciciosERF.EjercicioTres();
        //EjerciciosERF.EjercicioCuatro();
        EjerciciosERF.EjercicioCinco();
    }
    
    public static void EjercicioUno()
    {
        Scanner miSc = new Scanner(System.in);
        
        int cantidadTriangulos;
        int base;
        int altura;
        int superficie;
        int cantidad=0;
        
        System.out.println("¿Cuántos triángulos ingresará?");
        cantidadTriangulos = miSc.nextInt();
        
        for (int contador = 1; contador <= cantidadTriangulos; contador++) {
            
            System.out.println("Ingrese la base del triángulo");
            base = miSc.nextInt();
            
            System.out.println("Ingrese la altura del triángulo");
            altura = miSc.nextInt();
            
            superficie = base * altura / 2;
            
            System.out.println("La superficie es " + superficie);
            
            if (superficie > 12) {
                cantidad = cantidad + 1;
            }
            
        }
        
        System.out.println("La cantidad de triángulos cuya superficie es mayor a 12 es " + cantidad);
        
    }
    
    public static void EjercicioDos()
    {
        Scanner miSc = new Scanner(System.in);
        
        int numero;
        int suma=0;
        
        for (int contador = 0; contador <= 10; contador++) {
            System.out.println("Ingrese un número");
            numero = miSc.nextInt();
            
            if (contador>5) {
                suma = suma + numero;
            }
        }
        System.out.println("La suma de los últimos 5 números es " + suma);
    }
    
    public static void EjercicioTres()
    {   
        for (int contador = 5; contador <= 50; contador=contador+5) {
            System.out.println("La tabla del 5 es: " + contador);
        }
    }
    
    public static void EjercicioCuatro()
    {
        Scanner miSc = new Scanner(System.in);
        
        int numero;
        int resultado;
      
        System.out.println("Ingrese un número del 1 al 10");
        numero = miSc.nextInt();
        
        for (int contador = 1; contador < 13; contador++) {
            resultado = numero * contador;
            System.out.println(resultado);
        }
        
    }
    
    public static void EjercicioCinco()
    {
        Scanner miSc = new Scanner(System.in);
        
        int cantidadTriangulos;
        int lado1;
        int lado2;
        int lado3;
        int cantidad1=0;
        int cantidad2=0;
        int cantidad3=0;
        
        System.out.println("¿Cuántos triángulos ingresará?");
        cantidadTriangulos = miSc.nextInt();
        
        for (int contador = 1; contador <= cantidadTriangulos; contador++) {
            
            System.out.println("Ingrese el lado 1 del triángulo");
            lado1 = miSc.nextInt();
            
            System.out.println("Ingrese el lado 2 del triángulo");
            lado2 = miSc.nextInt();
            
            System.out.println("Ingrese el lado 3 del triángulo");
            lado3 = miSc.nextInt();
            
            if (lado1==lado2 && lado1==lado3) 
            {
                System.out.println("Triángulo equilatero");
                cantidad1++;
            }
            else
            {
                if (lado1==lado2 || lado2==lado3 || lado1==lado3) {
                    System.out.println("Triángulo isósceles");
                    cantidad2++;
                }
                else
                {
                    System.out.println("Triángulo escaleno");
                    cantidad3++;
                }
 
            }
        }
            System.out.println("La cantidad de triángulos equilateros es " + cantidad1);
            System.out.println("La cantidad de triángulos isósceles es " + cantidad2);
            System.out.println("La cantidad de triángulos escalenos es " + cantidad3);
            
            if (cantidad1<cantidad2 && cantidad1<cantidad3) {
                System.out.println("Hay menor cantidad de triángulos equilateros");
            }
            else
            {
                if (cantidad2<cantidad3) {
                    System.out.println("Hay menor cantidad de triángulos isósceles");
                }
                else
                {
                    System.out.println("Hay menor cantidad de triángulos escalenos");
                }
            }
    }
    
    public static void EjercicioSeis()
    {
        
    }
    
}//nada debajo de esto.
