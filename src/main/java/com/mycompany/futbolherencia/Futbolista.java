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
public class Futbolista extends Persona {
    private String posicion;
   
    public void jugar(){
        System.out.print("Futbolista  ");
        super.concentrar();
          
        System.out.println("  Porque va a Jugar");
     
    }
      public void futbolista(){
          super.viajar();
          System.out.println("Futbolista");
     
     }
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    
}
