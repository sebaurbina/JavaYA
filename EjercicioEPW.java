/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioepw;

import java.util.Scanner;

/**
 *
 * @author sebastianurbina
 */
public class EjercicioEPW {

    /**
     * @param args the command line arguments
     * 1) Escribir un programa que solicite ingresar 10 notas de alumnos y nos
     * informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
     * 
     * 2) Se ingresan un conjunto de n alturas de personas por teclado. 
     * Mostrar la altura promedio de las personas.
     * 
     * 3) En una empresa trabajan n empleados cuyos sueldos oscilan entre
     * $100 y $500, realizar un programa que lea los sueldos que cobra cada
     * empleado e informe cuántos empleados cobran entre $100 y $300 y cuántos
     * cobran más de $300. Además el programa deberá informar el importe que
     * gasta la empresa en sueldos al personal.
     * 
     * 4) Realizar un programa que imprima 25 términos de la serie
     * 11 - 22 - 33 - 44, etc. (No se ingresan valores por teclado).
     * 
     * 5) Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en
     * pantalla 8 - 16 - 24, etc.
     * 
     * 6) Realizar un programa que permita cargar dos listas de 15 valores
     * cada una. Informar con un mensaje cual de las dos listas tiene un
     * valor acumulado mayor
     * (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales").
     *    Tener en cuenta que puede haber dos o más estructuras repetitivas
     * en un algoritmo.
     * 
     * 7) Desarrollar un programa que permita cargar n números enteros
     * y luego nos informe cuántos valores fueron pares y cuántos impares.
     * Emplear el operador ?%? en la condición de la estructura condicional:
     *    if (valor%2==0)         //Si el if da verdadero luego es par.
     * 
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //EjercicioEPW.ejercicio1();
        //EjercicioEPW.ejercicio2();
        //EjercicioEPW.ejercicio3();
        //EjercicioEPW.ejercicio4();
        //EjercicioEPW.ejercicio5();
        //EjercicioEPW.ejercicio6();
        //EjercicioEPW.ejercicio7();
        
    }//finaliza el main
    
    public static void ejercicio1()
    {
        Scanner miSc = new Scanner(System.in);
        
        Integer notas;
        Integer contador=0;
        Integer contadorMayorASiete=0;
        Integer contadorMenorASiete=0;
        
        while(contador<10)
        {
            contador++;
            
            System.out.println("Ingrese nota: ");
            notas = miSc.nextInt();
            
            if (notas>=7) 
            {
                contadorMayorASiete++;
            }
            if(notas<7)
            {
                contadorMenorASiete++;
            }
            
        }
        System.out.println("Los alumnos que sacaron más o igual a 7 son: " + contadorMayorASiete);
        System.out.println("Los alumnos que sacaron menos que 7 son " + contadorMenorASiete);
        
    }
    
    public static void ejercicio2()
    {
        Scanner miSc = new Scanner(System.in);
        
        
        Integer contador=0;
        float altura;
        float promedio;
        Integer personasPromediar;
        float suma=0;
        
        System.out.println("¿Cuántas personas quiere promediar?");
        personasPromediar = miSc.nextInt();
        
        while(contador<personasPromediar)
        {
            contador++;
            
            System.out.println("Ingrese la altura de la personas");
            altura = miSc.nextFloat();
            
            suma = suma + altura;
            
        }
        
        promedio= suma / personasPromediar;
        System.out.println("El promedio de la altura de las personas ingresadas es " + promedio);
        
    }
    
    public static void ejercicio3()
    {
        Scanner miSc = new Scanner(System.in);
        
        float sueldo;
        float gastosEmpresa=0;
        Integer contador=0;
        float sueldosAAnalizar;
        Integer contadorEntre100y300=0;
        Integer contadorMayorA300=0;
        
        System.out.println("¿Cuántos sueldos quiere estudiar?");
        sueldosAAnalizar=miSc.nextInt();
        
        while(contador<sueldosAAnalizar)
        {
            contador++;
            System.out.println("Ingrese el sueldo: ");
            sueldo = miSc.nextFloat();
            
            if (sueldo>100 && sueldo<=300) {
                contadorEntre100y300++;
            }
            
            if (sueldo>300) {
                contadorMayorA300++;
            }
            gastosEmpresa= gastosEmpresa + sueldo;
        }
        System.out.println("Contador de sueldos entre $100 y $300: " + contadorEntre100y300);
        System.out.println("Contador de sueldos de más de $300: " + contadorMayorA300);
        System.out.println("Los gastos totales de sueldo de la empresa es: " + gastosEmpresa);
        
        
    }
    
    public static void ejercicio4()
    {
        Scanner miSc = new Scanner(System.in);
        
        Integer numero=11;
        Integer suma=0;
        Integer contador=0;
        
        while (contador<25) {            
            contador++;
            
            suma = suma + numero;
            System.out.println(suma);
        }
        
        
        
    }
    
    public static void ejercicio5()
    {
        Scanner miSc = new Scanner(System.in);
        
        Integer numero=8;
        Integer multiplicacion=1;
        Integer contador=0;
        Integer aMultiplicar=1;
        
        while (contador<62) {            
            contador++;
            
            multiplicacion =  numero * aMultiplicar;
            System.out.println(multiplicacion);
            aMultiplicar++;
        }
    }
    
    public static void ejercicio6()
    {
        Scanner miSc = new Scanner(System.in);
        
        
        Integer contador=0;
        String respuestaAListas;
        Integer listaUno=0;
        Integer listaDos=0;
        Integer sumaUno=0;
        Integer sumaDos=0;
        
        
        System.out.println("Ingrese los datos de la lista 1: ");
        
            while(contador<3)
            {
            contador++;
            
            System.out.println("Ingrese un valor");
            listaUno = miSc.nextInt();
            
            sumaUno = sumaUno + listaUno;
            }
        
        
        System.out.println("Ingrese los datos de la lista 2: ");
            while(contador<6)
            {
            contador++;
            
            System.out.println("Ingrese un valor");
            listaDos = miSc.nextInt();
            
            sumaDos = sumaDos + listaDos;
            }
        
        
        if (listaUno>listaDos) {
            System.out.println("La lista 1 es mayor");
        }
        else 
        {
            if (listaUno==listaDos) {
                System.out.println("Las listas son iguales");
            }
            else
            {
                System.out.println("La lista 2 es mayor"); 
            }
        }
          
    }
    
    public static void ejercicio7()
    {
        Scanner miSc = new Scanner(System.in);
        
        Integer numero=0;
        Integer contador=0;
        Integer sumaPar=0;
        Integer sumaImpar=0;
        Integer n=0;
        
        
        System.out.println("¿Cuántos números quiere ingresar?");
        n = miSc.nextInt();
        
        while (contador<n) { 
            System.out.println("Ingrese un número");
            numero=miSc.nextInt();
           
            if (numero%2==0) {
                sumaPar= sumaPar + 1;
            }
            else
            {
               sumaImpar = sumaImpar + 1; 
            }
 
            contador++;
        }
        System.out.println("Ingresaron " + sumaPar + " pares");
        System.out.println("Ingresaron " + sumaImpar + " impares");
    }
    
    
    
}//finaliza la clase
