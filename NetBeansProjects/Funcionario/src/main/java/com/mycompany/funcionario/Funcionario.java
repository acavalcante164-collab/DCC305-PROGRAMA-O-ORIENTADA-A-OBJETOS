/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author alons
 */
public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

 //CONSTRUTOR
 public Funcionario(String nome, String cpf, double salario) {
    this.nome = nome;
    this.cpf = cpf;
    this.salario = salario;
 }

 public String getNome() {
    return this.nome;
 }

 public String getCpf() {
    return this.cpf;
 }

 public double getSalario() {
    return this.salario;
 }

 public double getBonificacao() {
    return this.salario * 0.10; // Bônus padrão de 10%
 }

}
