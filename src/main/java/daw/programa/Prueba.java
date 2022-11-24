/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.programa;

import daw.fernando.Animal;
import daw.fernando.Persona;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author fer
 */
public class Prueba {
    
    public static void main(String[] args) {

        //Creacion animal 1
        Animal a1 = new Animal(LocalDate.of(2007, 
                Month.DECEMBER, 25), "Garfield", 
                "Gato", 3000.0, "Durmiendo");
        
        //Creacion animal 2
        Animal a2 = new Animal(LocalDate.of(2000, 
                Month.MARCH, 17), "Tobi", 
                "Perro", 6000.0, "Despierto");
        
        //Creacion persona 1 y 2
        Persona p1 = new Persona("Pepe", 38);
        Persona p2 = new Persona("Juan", 29);
        
        
        System.out.println(p1);
        System.out.println(p2);
        
        //Crea una copia del animal a2 en un nuevo animal a1.
        Animal a3 = Animal.clonar(a1);
        
        //p1 despierta todos los animales en este caso a1, a2 y a3
        p1.llamar(a1);
        p1.llamar(a2);
        p1.llamar(a3);
        
        //p2 juega con a2 durante 120 minutos 
        p2.jugar(a2, 120);
        
        
        //p1 alimenta a a1 1000 gramos. Imprime el nuevo peso de a1
        p1.alimentar(a1, 1000);
        
        System.out.println("Peso del animal a1 despues de alimentarse: " 
                + a1.getPeso());
        
        //p1 debe jugar con a1 200 minutos. Imprime el nuevo peso de a1.
        p1.jugar(a1, 200);
        
        System.out.println("Peso del animal a1 despues de jugar : " 
                + a1.getPeso());
    }
    
}
