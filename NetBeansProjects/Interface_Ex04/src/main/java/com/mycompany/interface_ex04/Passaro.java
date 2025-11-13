/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interface_ex04;

/**
 *
 * @author alons
 */
public class Passaro extends Animal implements IVoador {
    
    //IMPLEMENTACAO OBRIGATORIA DE ANIMAL
    @Override
    public void fazerSom(){
        System.out.println("Piu piu");
    }
    @Override
    public void voar(){
                System.out.println("Batendo as asas e voando.");
    }
    
}
