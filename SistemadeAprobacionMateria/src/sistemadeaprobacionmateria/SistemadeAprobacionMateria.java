/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadeaprobacionmateria;

import java.util.Scanner;

/**
 *
 * @author liana
 */
public class SistemadeAprobacionMateria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada=new Scanner(System.in);
   
    //Declaracion de Variables
    String Nombre="L";
    double ExamenIParcial=0;
    double ExamenIIParcial=0;
    double Promedio=0;
            
        System.out.println("Bienvenido Estimado Estudiante!!");
        System.out.println("Para Calcular Su Promedio Le Solicitaremos Los Siguientes Datos:");
        System.out.println(""); 
        System.out.printf("Ingrese Nombre de Alumno:");
        Nombre=entrada.nextLine();
        
       System.out.print("Ingrese Nota del Primer Parcial:");
       ExamenIParcial=entrada.nextDouble();
       
       System.out.print("Ingrese Nota del Segundo Parcial:");
       ExamenIIParcial=entrada.nextDouble();
       
       Promedio=(ExamenIParcial + ExamenIIParcial);
       
        System.out.println("Alumno:" + Nombre);
        System.out.println("Su Promedio es:"+ Promedio);
        
        if (Promedio>=65.0){
            System.out.printf("%s Usted APROBO SU CLASE %s","\u001B[32m","\u001B[0m");
        }// Fin If
        else {
            System.out.printf("%s Usted REPROBO %s","\u001B[31m","\u001B[0m");
            System.out.println("Favor Abocarse con su Catedratico");
        }// Fin Else
        
       
    
        
    
    }// Fin Main
    
    
}// Fin de ClassSistemadeAprobacionMateria
