/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testecarro2;

/**
 *
 * @author alons
 */
public class TesteCarro2 {
 public static void main(String[] args) {
 Carro carro = new Carro("Civic", "Azul");

 // Acesso seguro através de getters
 System.out.println("Modelo: " + carro.getModelo());
 System.out.println("Velocidade: " + carro.getVelocidade());

 // Modificação controlada através de setters
 carro.acelerar();
 carro.setVelocidade(50);

 // Tentativa inválida é rejeitada
 carro.setVelocidade(-10); // Será ignorado

 System.out.println("Velocidade final: " +
 carro.getVelocidade());

 
 
 }
 
}
