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
public class Persona {
    private int cedula;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(int cedula, String nombre, String apellido, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
     public Persona() {
      
    }
     //metodos
     public void viajar(){
         System.out.print("viajando al juego ");
     
     }
      public void concentrar(){
          System.out.print("Entrenando...");
     
     }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    
    
}
