/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interface_ex01;

/**
 *
 * @author alons
 */
public class Televisao implements IAparelho {
    String marca;
    String modelo;
    
    public Televisao (String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;    
    }
    
    @Override
    public void ligar(){
        System.out.println("--- STATUS DA TV ---");
        System.out.println("Televisao " + this.marca + " " + this.modelo + " Ligada.");
    
    }
    @Override
    public void desligar(){
        System.out.println("--- STATUS DA TV ---");
        System.out.println("Televisao " + this.marca + " " + this.modelo + " Desligada.");
    }
    
}
