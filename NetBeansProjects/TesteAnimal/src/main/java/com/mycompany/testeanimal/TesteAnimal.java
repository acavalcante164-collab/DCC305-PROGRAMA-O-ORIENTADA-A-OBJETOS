/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testeanimal;

/**
 *
 * @author alons
 */
public class TesteAnimal {
    public static void main(String[] args) {
        Animal[] zoologico = new Animal[3];
        zoologico[0] = new Gato(); // <-- Adicionar
        zoologico[1] = new Gato();
        zoologico[2] = new Cachorro();; // <-- Adicionar
        
        for (Animal a : zoologico) {
            a.fazerSom();
            a.dormir(); 
        }
    }
}
