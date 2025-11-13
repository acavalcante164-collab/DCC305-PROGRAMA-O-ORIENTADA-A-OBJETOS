/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistematime;

/**
 *
 * @author alons
 */
public class Jogador {
 private String nome;
 private String posicao;
 private int idade;
 private int numeroCamisa;

 public Jogador(String nome, String posicao,
 int idade, int numero) {
 this.nome = nome;
 this.posicao = posicao;
 this.idade = idade;
 this.numeroCamisa = numero;
 }

 // Getters
 public String getNome() {
 return nome;
 }

 public String getPosicao() {
 return posicao;
 }
}
