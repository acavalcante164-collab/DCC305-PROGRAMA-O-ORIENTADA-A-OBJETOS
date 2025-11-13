/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testecarro2;

/**
 *
 * @author alons
 */
public class Carro {
 private String modelo;
 private String cor;
 private int velocidade;
 // Construtor
 public Carro(String modelo, String cor) {
 this.modelo = modelo;
 this.cor = cor;
 this.velocidade = 0;
 }
 // Getters
 public String getModelo() { return modelo; }
 public String getCor() { return cor; }
 public int getVelocidade() { return velocidade; }
 // Setters com validação
 public void setVelocidade(int velocidade) {
 if (velocidade >= 0 && velocidade <= 200) {
 this.velocidade = velocidade;
 }
 }
 // Métodos de comportamento
 public void acelerar() {
 setVelocidade(this.velocidade + 10);
 }
}