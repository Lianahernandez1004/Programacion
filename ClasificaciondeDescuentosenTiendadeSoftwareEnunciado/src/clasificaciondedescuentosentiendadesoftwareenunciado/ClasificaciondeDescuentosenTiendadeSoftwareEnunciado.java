/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasificaciondedescuentosentiendadesoftwareenunciado;

import java.util.Scanner;

/**
 *
 * @author liana
 */
public class ClasificaciondeDescuentosenTiendadeSoftwareEnunciado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);    
    
   //Declaracion de Variables 
   String Nombre = "L";
   int Edad= 0;
   char Membresia = 'a';
   double Precio=0;
   double Descuento=0;
   double Total=0;
           
        System.out.println("Bienvenido a Nuestra Tienda"); 
        System.out.println("\nSe le solicitaran \nLos siguientes datos para corroborar \nque tipo de descuento se le aplicara!");
        System.out.println("");
        
        System.out.print("Ingrese Su Nombre:");
        Nombre=entrada.nextLine();
        
        System.out.print("Ingrese Su Edad:");
        Edad=entrada.nextInt();
        
        System.out.print("Usted Cuenta Con Memebresia Premiun?");
        System.out.println("S: Si / N: NO");
        System.out.print("Respuesta:");
        Membresia=entrada.next().toUpperCase().charAt(0);
        
        System.out.println("Cual es el Precio Original del Juego:");
        Precio=entrada.nextDouble();
        
        Descuento=0.0;
        
      if(Edad >=18){ // Inicio If
          
      } // Fin IF         
       if(Edad >65 || Membresia== 's'){  //Inicio IF (validando si es mayor de 65años
           Descuento=20.0;
       }  // Fin IF   
       else { //  Inicio Else
           Descuento=10.0;
       }// Fin Else
       
       if ((Membresia== 's')&& Edad >12){ // Inicio If
           Descuento=15.0;
       } // Fin IF
       else { // Inicio Else
           Descuento=0.0;
       }// Fin Else
     
     Total=Precio-(Precio*Descuento/100.0);
     
        System.out.printf("Precio original: L.%.2f%n",Precio);
        System.out.println("");
        System.out.printf("Descuento Aplicado: %.0f%%%n",Descuento);
        System.out.println("");
        System.out.printf("Usted Pagara: L.%.2f%n", Total);
        
        
    }// Fin de Main
    
}// Fin de ClassClasificacionenTiendadeSoftwareEnunciado
