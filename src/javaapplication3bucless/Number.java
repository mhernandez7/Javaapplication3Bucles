/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3bucless;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Number {
       
     private float cantidadNumeros;
     private float pares;
     private float impares;
     
     public Number()
     {
        this.cantidadNumeros = 0;
        this.impares = 0;
        this.pares = 0;
      
     }
   
    public float getPares() {
        return pares;
    }

    public float getImpares() {
        return impares;
    }
    
    public void solicitudCantNumeros(){
        
        Scanner read = new Scanner(System.in);
        
        System.out.println ("ingrese la cantidad de numeros que va a digitar: ");
         this.cantidadNumeros = read.nextFloat();
     
    }
    
     public void resultParImpar()
     {
     float number1 =0;
     Scanner pala = new Scanner(System.in); 
     for (int i = 1; i<= this.cantidadNumeros;i++)
     {    
         System.out.println("ingrese el numero: "+i);
         number1 = pala.nextFloat();
         
         if (number1 %2 == 0)
         {
         this.pares ++;
         }
         else  
         {
         this.impares ++;
         }
        
     }
     }
    
}
