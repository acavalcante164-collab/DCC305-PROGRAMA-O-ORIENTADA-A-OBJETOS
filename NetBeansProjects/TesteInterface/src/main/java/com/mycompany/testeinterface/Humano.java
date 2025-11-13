/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeinterface;

/**
 *
 * @author alons
 */
// "Humano" promete cumprir o contrato "IAndador"
public class Humano implements IAndador {

 // Atributos próprios da classe
 private String nome;
 private int idade;
 
 //CONSTRUTOR
public Humano(String nome, int idade) {
        // 'this.nome' (atributo da classe) recebe o 'nome' (parâmetro)
        this.nome = nome; 
        // 'this.idade' (atributo da classe) recebe a 'idade' (parâmetro)
        this.idade = idade;
    }

 // OBRIGADOS A IMPLEMENTAR OS MÉTODOS!
 @Override
 public void andar() {
 System.out.println("Humano " + nome +
 " andando com 2 pernas");
 }

 @Override
 public void correr() {
 System.out.println("Humano " + nome +
 " correndo rapidamente");
 }
}
