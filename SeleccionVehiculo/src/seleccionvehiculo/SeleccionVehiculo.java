/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleccionvehiculo;

import java.util.Scanner;

/**
 *
 * @author liana
 * Objetivo
 * Estructura de Seleccion
 *  1.Estructura o Formato
 *     a. palabras claves -- if .... else
 *     b. bloques
 *     c. Terminaciones -> NO SE TERMINAN CON ";"
 *     d. Condiciones -> VALOR A COMPARAR 
 * 2. Tipos de Seleccion
 *     a. simple
 *     b. doble
 * 3. Condiciones
 *     a. Tipos de Condiciones
 *         i.  > -> mayor
 *         ii. < -> menor 
 *         iii.> ->
 *     b. Tipos de Comparacion
 */
public class SeleccionVehiculo {

    /**
     * @param args the command line arguments
     * Desarrollar un algoritmo que me permita determinar los siguinetes elementos
     * de un vehiculo
     *   a. Si el tamanio del tanque de combustible agarra mas de 30 litros (Dato Numerico)
     *   b. El tipo de combustible si es o no Diesel                        (Dato tipo Caracter)
     *   c. Si es energerticamente eficiente y ecologico su combustible     (Dato Cadena)
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int cantidadLitros = 0;
        char respuestoTipo = 'a';
        String respuestaCadena = "John Doe";
        
        System.out.println("Me dijeron que eres duenio de un vehiculo \"verde\"");
        System.out.println("Tienes que echarle biodiesel");
        System.out.print("cuantos litros agarra?");
        cantidadLitros = entrada.nextInt();
        
        if(cantidadLitros>30){
            //Condicion VERDADERO
            System.out.println("es un vehiculo con");
            System.out.println("grandes capacidades");
            System.out.println("Seguro la factura es alta!!!");
           }
        System.out.println("");
        
        entrada.nextLine(); // ES PARA LIMPIAR EL BUFFER ( SE HACE CUANDO PASO DE UN  DATO NUMERICO A UN DATO CARACTER, LO QUE SE HACE ES UNA LIMPIEZA)
        System.out.println("Tu vehiculo es Ciesel vede? (x = si, y = no");
        respuestoTipo = entrada.nextLine().charAt(0);
       
        
        if(respuestoTipo =='x'){
            // CONDICION VERDADERA
            System.out.println("Si es diesel verde!!");
            System.out.println("Dieses combinado con ethanol");
            System.out.println("Se saca del maiz");
    }
    else
    {
        // CONDICION FALSA, EL ELSE NO LLEVA CONDICION 
           System.out.println("uyyyy ... eres anticlimatico");
           System.out.println("Calentamiento Global!!!!");
                                                               
        }
        /*
        System.out.println("");
        System.out.println("Tu carro es energeticamente eficiente?");
        respuestaCadena = entrada.nextLine();
        System.out.printf("Respuesta Ingresada: %s",respuestaCadena);
        
        System.out.println("\nSeguro que es asi?");
        respuestaCadena = entrada.nextLine().toUpperCase();
        System.out.printf("Respuesta Ingresada: %s",respuestaCadena);
        
        System.out.println("\n100% Seguro?");
        respuestaCadena = entrada.next().toLowerCase();
        System.out.printf("Respuesta Ingresada: %S",respuestaCadena);
        /*
       
        */
        
        if(respuestaCadena.equals("si")){
            System.out.println("Excelnete");
            System.out.println("Amigable con el ambiente");
            
            }
        else {
            System.out.println("Uyy.... busca que se puede hacer");
            
       }
        
    }// Fin de Main
    
} // Fin Class SeleccionVehiculo
