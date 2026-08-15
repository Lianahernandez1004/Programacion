/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemamonitoreo;

import java.util.Random;
import java.util.Scanner;

/**
 * /**

     * Desarrolla un programa en Java que simule la lectura de sensores de 

     * temperatura en un cuarto de servidores. El programa debe solicitar 

     * el nombre del operador encargado y cuántas lecturas de sensores se 

     * van a simular. Debe validar que la cantidad de lecturas sea mayor a 0 

     * y menor o igual a 50. Por cada lectura, el sistema generará una temperatura 

     * aleatoria en grados Celsius. El programa debe convertir cada lectura a 

     * Fahrenheit, determinar si hay una alerta de sobrecalentamiento y, al final, 

     * mostrar un resumen estadístico.

     */

    /*
 * 1. Comprender El Problema que se esta abordando 
      a. Que datos de Entrada Necesito?
      b. Transformacion / Calculos Necesarios
      c. Que Resultados se Presentan
   
   2. Visualizacion/Diseño de la solucion
      a. Diagrama de Flujo (PAsos)
      b. Pseudocodigo
      
   3. Programacion Incremental
      a. Listando las Tareas a Cumplir
         i. Declaracion de Variables
         ii. Estructuras de Seleccion
         iii. Ciclos Repeticion
         iv. Validaciones de datos 

       b. Validacion
   4. Pruebas de Escritorio
      a. Casos
      b. Escenarios
      c. Resultados/ Patrones Definidos



 * @author liana
 */
public class SistemaMonitoreo {
    
    /**
     * Listado de Tareas
     *   1. Entrada: 
     *            Nombre de usuario
     *            Numero de Lecturas
     *            Ingreso de Temperatura (Ramdom)
     * 
     *   2. Calculos/ Transformaciones
     *            Formula de Celcius - Farenheit
     *            Definicion de Sobrecalentamiento
     *            Validacion de Lecturas (0> Lectura menor 50)
     *            Contabilizar el numero de calentamiento 
     *            Promediar el monitoreo
     *            - Validacion Temperatura
     * 
     *   3. Salida
     *             Resumen Estadistico
     *             Alerta de Sobrecalentamiento
     * 
     * 
     * Lista de Tareas
     * 1. Capturar el nombre del usuario
     *      a. Definicion de Libreria/ Instancia
     *      b. Declaracion de Variables para el usuario
     * 
     * 2. Captura de Numero de Lecturas
     *      a. Declaracion de Variables para numero de lectura
     * 
     * 3. Generacion de Temperatura
     *     a. Definicion de Libreria RAMDOM
     *     b. Declaracion de Varibale
     *     c. Mostrar el numero Ramdom Gerando Temporalmente 
     *     d. Rango de la temperatura 200-500
     *     e. Ciclo de Repeticion, (WHILE)
     * 
     * 4. Formula : F=(c*9/5)+32
     * 5. Limite de Sobrecalentamiento 350 C (662 F)
     *             Estructura de Seleccion (IF/ELSE)
     * 6. Validacion de Lecturas, (Ciclo de Repeticion --> DO WHILE) entre 0-50
     * 7. Sumar los numeros de sobrecalentamiento 
     * 8. Calcular el promedio
     * 9. Mostrar el Resumen
     *    Promedio
     *    # de Sobrecalentamiento
     * 10. Generar una Alerta de Sobrecalentamiento
     *
     */       

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner sc=new Scanner(System.in);
      Random rd=new Random();
        
     String nombreUsuario= "Jonh Doe";   
     int numLectura=0;
     int ciclo=0;
     double tempC=0;
     double tempF=0;
     int numSobreCalentamiento=0;
     double promedio=0;
     double acumTEMP=0;
     
        System.out.print("Nombre de Operacion:");
        nombreUsuario=sc.nextLine().toUpperCase();
        System.out.printf("Validar Captura: %s\n",nombreUsuario);
        
     do{
           System.out.print("Numero de Lectura:");
           numLectura=sc.nextInt();
        System.out.printf("Validacion Captura: %d\n",numLectura);
        if (!(numLectura>0 && numLectura<50)){
        
            System.out.println("VAlor NO VALIDO");
            System.out.println("Tiene que ser entre 0 y 50");
        }
     }while (!(numLectura>0 && numLectura<50));
        
       
       
    while (ciclo < numLectura){
        tempC=rd.nextDouble(200,500);
        tempF = (tempC*9/5)+32;
        //tempC=(Math.random()*500)-300+200;  ---> Truco matematico de ambas maneras esta bien
        //System.out.printf("Validacion Random: %.2f\n",tempC);
        System.out.printf("Num Lec: %d\tTemp C: %.2f\n", ciclo+1,tempC);
        System.out.printf("Temp en Faren: %.2f\n",tempF);
        
        if (tempF>662){ // Inicio de If 
            System.out.println("Alerta!!!!!!..... SobreCalentamiento");
            numSobreCalentamiento++;
           
        }// Fin de If
        else {
          acumTEMP +=tempF;  
        }
     
            ciclo++;
        }// Fin de while
    
        promedio=acumTEMP / numLectura;       
        System.out.println("-------------------------"); 
        System.out.println("      RESUMEN               ");
        System.out.println("-------------------------");
        System.out.println("");
        System.out.printf("Promedio de TEMP: %.2f\n", promedio);
        System.out.printf("# SobreCalentamiento: %d",numSobreCalentamiento);
        
        
    }// Fin De Main
    
}// Fin de ClassSistemaMonitoreo
