/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interface_ex04;

/**
 *
 * @author alons
 */
public class Interface_Ex04 {

    public static void main(String[] args) {
        System.out.println("---  TESTANDO O CACHORRO ---");
        Cachorro rex = new Cachorro();
        rex.fazerSom(); //METODO PROPRIO (ABSTRACT)
        rex.respirar(); //HERDADO
        
        System.out.println("\n--- TESTANDO O PASSATO ---");
        Passaro piu  = new Passaro();
        piu.fazerSom();
        piu.respirar();
        piu.voar();
      
    }
}
