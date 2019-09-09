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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();
        
      
        Futbolista futbolista = new Futbolista();
        futbolista.jugar();
        Entrenador entrenador = new Entrenador();
        entrenador.entrenador();
        Masajista masajista = new Masajista();
        masajista.masajista();
       
     
        
    }
    
}
