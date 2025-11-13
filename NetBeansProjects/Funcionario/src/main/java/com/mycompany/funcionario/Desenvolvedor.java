/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author alons
 */
public class Desenvolvedor extends Funcionario{
    private String linguagem;
    
public Desenvolvedor(String nome, String cpf, double salario, String linguagem){
    super(nome, cpf, salario);
    this.linguagem = linguagem;
}


public String getLinguagem(){
    return this.linguagem;
}
public void setLinguagem(String linguagem){    
    this.linguagem = linguagem;
}


 @Override
 public double getBonificacao() {
    return this.salario * 0.12; // 12% para o Programador
 }






}