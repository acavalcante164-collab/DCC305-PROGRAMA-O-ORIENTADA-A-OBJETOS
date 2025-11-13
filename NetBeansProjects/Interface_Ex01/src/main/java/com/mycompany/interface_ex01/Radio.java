/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interface_ex01;

/**
 *
 * @author alons
 */
public class Radio implements IAparelho{
    
    String marca;
    String modelo;
    
    public Radio (String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;    
    }
    
    @Override
    public void ligar(){
        System.out.println("--- STATUS DO RADIO ---");
        System.out.println("Radio " + this.marca + " " + this.modelo + " Ligado.");
    }
    @Override
    public void desligar(){
        System.out.println("--- STATUS DO RADIO ---");
        System.out.println("Radio " + this.marca + " " + this.modelo + " Desligado.");
    }
    
}
