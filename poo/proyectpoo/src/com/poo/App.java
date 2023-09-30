package com.poo;

import com.poo.model.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona(
            1, 
            "Pedro",
            "M", 
            "2003-01-28",
            true
             );
        System.out.println(persona);
    }   
    
}
