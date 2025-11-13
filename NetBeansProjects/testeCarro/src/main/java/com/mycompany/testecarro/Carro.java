/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testecarro;

/**
 *
 * @author alons
 */
public class Carro {
    //ATRIBUTOS
    String modelo;
    String cor;
    int velocidade;
    
    //CONSTRUTOR
public Carro(String modelo, String cor){
    this.modelo = modelo;
    this.cor = cor;
    this.velocidade = 0;
}
public void acelerar(){
    if(velocidade <200){
    velocidade += 10;
    System.out.println("Acelerando! Velocidade atual: " + velocidade + " km/h");
    } else{
    System.out.println("Velocidade máxima atingida!");
    }
}
public void frear(){
    if (velocidade > 0){
    velocidade -= 10;
     System.out.println("Freando! Velocidade atual: " + velocidade + " km/h");
    } else {
    System.out.println("O Carro esta parado.");
    }
}
}