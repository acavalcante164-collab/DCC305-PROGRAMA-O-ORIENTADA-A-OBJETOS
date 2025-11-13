/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author alons
 */
public class Gerente extends Funcionario {
    private int senha;

 public Gerente(String nome, String cpf, double salario, int senha) {
    super(nome, cpf, salario); // Chama o construtor da superclasse
    this.senha = senha;
 }

 public boolean autentica(int senha) {
    if (this.senha == senha) {
        System.out.println("Acesso autorizado!");
        return true;
    } else {
        System.out.println("Senha incorreta!");
        return false;
    }
 }
 public void setSenha(int novaSenha) {
    this.senha = novaSenha;
 }
 @Override
 public double getBonificacao() {
    return super.getBonificacao() + 1000; // 15% para gerentes
 }
}
