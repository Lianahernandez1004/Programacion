/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generaciontoken1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author liana
 */
public class GeneracionToken1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     Scanner sc=new Scanner(System.in);
     
    Random RD=new Random(); // libreria que utilizaremos por que nos sirve para general numeros aleatorios
     
     boolean LongitudCorrecta= true;
     boolean PrefijoCorrecto= true;
     boolean ValidacionCorrecta=true;
     
     String NombreEquipo= "a";
     int TipoCaracter=0;
     int NumeroToken=0;
     char LetraToken= 'a';
     String Token= "a";
        
       
       do{ // SE UTILIZA PARA VALIDAR CUALQUIER CONDICION
        System.out.println("Ingrese el Nombre de su Equipo");
        NombreEquipo=sc.nextLine().toUpperCase();
        
        System.out.printf("\nNombre del Equipo: %s\n",NombreEquipo);
        //
        //
        LongitudCorrecta=NombreEquipo.length()==8;
        PrefijoCorrecto=NombreEquipo.startsWith("RT")|| NombreEquipo.startsWith("SW");
        
        //System.out.println(LongitudCorrecta);
        //System.out.println(PrefijoCorrecto);
        
       ValidacionCorrecta=LongitudCorrecta && PrefijoCorrecto;   
     
      } while (!ValidacionCorrecta); // se va a ejecuatar al menos una vez , no importa sea true o false (EL SIGNO ! ES NEGACION)
       
        System.out.println("Registro Correcto");
        
   while(Token.length()<12){
   TipoCaracter=RD.nextInt(2);
   
   if (TipoCaracter==0){
       NumeroToken=RD.nextInt(10);
       Token=Token + NumeroToken; // cuando tengo una cadena y pongo un simbolo mas lo que pasa es que los enlasa, osea el contenido de token se enlasara con el numerotoken
   }// Fin IF
       
   else {
     LetraToken= (char)(RD.nextInt(26)+65);  
       Token=Token + LetraToken;     
           }// Fin Else
   
       System.out.printf("Token es: %s",Token);
       
   }     
   
       
        
    }// Fin de Main
    
}// Fin de ClassGeneracionToken1
