/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author alons
 */
// Arquivo: Veiculo.java
public class Veiculo {
    
 private String placa;
 private String marca;
 private String modelo;
 private int ano;
 private String renavam;
 
 // Construtor
 public Veiculo(String placa, String marca, String modelo, int ano, String renavam) {
 this.placa = placa;
 this.marca = marca;
 this.modelo = modelo;
 this.ano = ano;
 this.renavam = renavam;
 }
 
 public void exibirDados() { System.out.println("Placa: " + this.placa);
 System.out.println("Marca: " + this.marca);
 System.out.println("Modelo: " + this.modelo);
 System.out.println("Ano: " + this.ano);
 System.out.println("Renavam: " + this.renavam);
 }
}
