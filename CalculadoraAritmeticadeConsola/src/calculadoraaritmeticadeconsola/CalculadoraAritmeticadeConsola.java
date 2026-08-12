/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraaritmeticadeconsola;

import java.util.Scanner;

/**
 *
 * @author liana
 */
public class CalculadoraAritmeticadeConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada=new Scanner(System.in);
    
    // Declaracion de Variables
    
    int Numero1=0;
    int Numero2=0;
    char Operador= 'a';
    double Resultado=0; 
            
        System.out.println("Bienvenido!! \nPara Calcular Su Operacion Favor Llenar Lo Solicitado:");   
        System.out.println("");
        System.out.print("Ingrese Primer Numero:");
        Numero1=entrada.nextInt();
        
        System.out.print("Ingrese Segundo Numero:");
        Numero2=entrada.nextInt();
        
        System.out.print("Ingrese Operador");
        System.out.println("");
        System.out.print("+,-,*,/,%");
        System.out.println("");
        System.out.print("Respuesta");
        
        Operador=entrada.next().charAt(0);
        
        switch (Operador){ // Inico Switch
            case '+':
                Resultado=Numero1+Numero2;
                System.out.printf("Resultado: %.2f%n",Resultado);
                break;
                
            case '-':
                Resultado=Numero1-Numero2;
                System.out.printf("Resultado: %.2f%n",Resultado);
                break;
            
             case '*':
                Resultado=Numero1*Numero2;
                System.out.printf("Resultado: %.2f%n",Resultado);
                break;
                
            case '/':
               if(Numero2 !=0){ // Inicio If
                Resultado=Numero1/Numero2;
                System.out.printf("Resultado: %.2f%n",Resultado);
             
             }// Fin IF        
               else{ // Inicio Else
                   System.out.print("Error no se puede dividir entre 0");
               } // Fin Else   
                 break;           
               
            case '%':
               if(Numero2 !=0){ // Inicio If
                Resultado=Numero1%Numero2;
                System.out.printf("Resultado: %.2f%n",Resultado);
                break;    
             }// Fin IF        
               else{ // Inicio Else
                   System.out.print("Error no se puede calcular entre 0");
               } // Fin Else 
               break;
               
            default:
                System.out.print("Operador No Reconocido");
               
               
     }// Fin Switch
    }// Fin de Main
    
    
}// Fin de Class
