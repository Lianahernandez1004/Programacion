/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interes_simple;

import java.util.Scanner;

/**
 *
 * @author liana
 */
public class Interes_Simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        
        int CapitalInicial = 0;
        int TasaAnual = 0;
        int Tiempo = 0;
        int Intereses=0;
        
        System.out.println("Bienvenido!!");
        System.out.println("");
        System.out.println("Para Calcular Los Intereses de Su Prestamo, Necesitamos Nos Ayude Con La Siguinete Informacion:");
        System.out.println("Cual es su Capital Inicial?");
        CapitalInicial=sc.nextInt();
        
        System.out.println("Cual es el % de la Tasa de Interes Anual?");
        TasaAnual=sc.nextInt();
        
        System.out.println("Por Cuantos Años Pagara su Prestamo?");
        Tiempo=sc.nextInt();
        sc.nextLine();
    
         Intereses= (CapitalInicial*TasaAnual*Tiempo)/100;
        
        System.out.println("Los Intereses Gereados Son:" +Intereses);
                
    }// Fin de Main
    
}// Fin de Class Interes_Simple
