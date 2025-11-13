/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testecarro2;

/**
 *
 * @author alons
 */
public class CarroDeCorrida extends Carro {
 private int turboBoost;
 public CarroDeCorrida(String modelo, String cor) {
 super(modelo, cor); // Chama construtor da classe pai
 this.turboBoost = 0;
 }
 public void ativarTurbo() {
 // Não pode acessar 'velocidade' diretamente (é private)
 // Deve usar métodos públicos da classe pai
 int velocidadeAtual = getVelocidade();
 setVelocidade(velocidadeAtual + 30);
 turboBoost = 30;
 System.out.println("Turbo ativado!");
 }
 public int getTurboBoost() {
 return turboBoost;
 }
}