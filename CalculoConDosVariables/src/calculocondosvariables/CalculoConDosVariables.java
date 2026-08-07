/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculocondosvariables;

import java.util.Scanner;

/**
 *
 * @author liana
 */
public class CalculoConDosVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        double Base = 0;
        double Altura = 0;
        double Perimetro = 0;
        double Area = 0;
        
        System.out.println("Bienvenido..");
        System.out.println("A Continuacion se le solicitaran los siguientes datos");
        System.out.println("Para poder calcular las medidas del Rectangulo");
        System.out.println("");
        System.out.print("Podria Ingresar La Base del Rectangulo:"); 
        System.out.println("");
        Base = entrada.nextDouble();
        
        System.out.print("Ingrese Altura del Rectangulo");
        System.out.println("");
        Altura = entrada.nextDouble();
        
        Area= Base*Altura;
        Perimetro= 2*Area;
        
        System.out.println("Area:" + Area);
        System.out.println("Perimetro:" + Perimetro);
        System.out.println("");
        
    }// Fin de Main
    
}// Fin de ClassCalculoConDosVariables
