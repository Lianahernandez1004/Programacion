/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usodelalibreriamath;

import java.util.Scanner;

/**
 *
 * @author liana
 */
public class UsodelaLibreriaMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);    
      
        double Radio= 0;
        double Area= 0;
        double Circunferencia= 0;   

        System.out.println("Bienvenido.."); 
        System.out.println("Para Calcular el Radio del Circulo, Le Solicitaremos Lo Siguiente:");  
        System.out.print("Ingrese El Radio:");
        System.out.println("");
        Radio= entrada.nextDouble();
        
        Area = Math.PI*Math.pow(Radio,2);
        Circunferencia= 2*Math.PI*Radio;
        
        System.out.print("El Area=" + Area);
        System.out.println(""); 
        System.out.println("");
        System.out.print("La Circunferencia=" + Circunferencia);
        
        
       
        
    }// Fin de Main
    
}//Fin de Class UsodelaLibreriaMath
