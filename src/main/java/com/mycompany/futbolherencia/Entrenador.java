/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.futbolherencia;

/**
 *
 * @author victor
 */
public class Entrenador extends Persona{
    private String federacion;
     public void dirigir(){
         System.out.println("Entrenador dirigiendo");
     
     }
       public void concentrar(){
           super.viajar();
          
     
     }
   public void entrenador(){
       System.out.print("Entrenador ");
       super.concentrar();
       System.out.println(" al equipo");
   }
    public String getFederacion() {
        return federacion;
    }

    public void setFederacion(String federacion) {
        this.federacion = federacion;
    }
    
    
}
