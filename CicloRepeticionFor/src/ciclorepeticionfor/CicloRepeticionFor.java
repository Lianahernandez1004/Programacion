/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclorepeticionfor;

import java.util.Scanner;

/**
 *
 * Objetivos
 * 1. Imp
 * @author liana
 */
public class CicloRepeticionFor {

    /**
     * Se quiere contabilizar la cantidad de minutas que se entregan a los ninos y ninias en una fiesta. Con ellos sacar el porcentaje de cuantos fueron ninios y ninias
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* 
         1. Variable Contro -> Valor Inicial
         2. Condicion -> Limite
         3. Modificador -> Incremento / Decremento
        en el ciclo for se unen estas lineas
        */
        
        for (int i = 0; i<10;i++){ // hace referencia de la i por iteracion, puede ser cualquier letra o palabra es indistinto 
          //  System.out.printf("Valor:%d\n",i);
        }// Fin De Ciclo FOR
        
        //System.out.println("");
        //System.out.println("2do Ciclo FOR");
        
        for (int i = 2; i<10;i+=2){
            // System.out.printf("Valor:%d\n",i);
         }// Fin Ciclo FOR
         
         // Declaracion de Variables
         Scanner sc=new Scanner(System.in);
         final int TOTAL=10; // EL VALOR DE LA VARIBLE "FINAL INT" SE MANTIENE IGUAL NO CAMBIA
         int NumVarones=0;
         int NumMujeres=0;
         char Seleccion= 'a';
         double Porcentaje=0.0;
         
          for (int i=0; i < TOTAL;i++){
              System.out.printf("%d)Quien Viene x Minuta?\n",i+1);
              System.out.println("V: Varon / M: Mujer");
              System.out.print("REspuesta:");
              Seleccion=sc.next().toUpperCase().charAt(0);
              
         switch (Seleccion){
             case 'V':
                 System.out.println("Varon Comiendo Minuta");
                 NumVarones++;
                 break;
            case 'M':
                 System.out.println("Mujer Comiendo Minuta");
                 NumMujeres++;
                 break;     
          
            default:
                System.out.println("Seleccion no Valida");
              break;
         }// Fin Switch      
          }// Fin de Ciclo FOR
       
         System.out.println("Porcentaje de Varones");
         Porcentaje=(double)NumVarones/TOTAL;
         System.out.printf("Porcentaje: %.2f\n",Porcentaje);
        
         System.out.println("Porcentaje de Mujeres");
         Porcentaje=(double)NumMujeres/TOTAL;
         System.out.printf("Porcentaje: %.2f\n",Porcentaje);
    }// Fin de Main
    
}// Fin de ClassCicloRepeticionFor
