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
public class Masajista extends Persona {
    
    private String experciencia;

    

  
   
    
    
   
    
     public void darMasaje(){
         System.out.println("Masajista dando masajes");
     
     }
       public void masajista(){
          
          System.out.print(" Masajista ");
          super.viajar();
          System.out.println(" a dar masaje");
        String nombre = getNombre();
     }

    public String getExperciencia() {
        return experciencia;
    }

    public void setExperciencia(String experciencia) {
        this.experciencia = experciencia;
    }
    
}
