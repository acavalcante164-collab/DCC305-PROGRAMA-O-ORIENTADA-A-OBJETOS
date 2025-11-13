/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05;

/**
 *
 * @author alons
 */
public class Pessoa {
 private String nome;
 private String email;
 
 private int idade;
 
 private double altura;
 private double peso;
 private double imc;
 

 public Pessoa(String nome, int idade, String email) {
 setNome(nome);
 setIdade(idade);
 setEmail(email);
 
 }
 // Construtor adicional
 public Pessoa(String nome, int idade, String email,
 double altura, double peso) {
 this(nome, idade, email); // Chama o construtor principal
 setAltura(altura);
 setPeso(peso);
 
 }
 public void setNome(String nome){
     if (nome == null || nome.contains("1234567890")){
         throw new IllegalArgumentException("Nome invalido" + nome);
         
    }
    this.nome = nome;
  }
    public void setIdade(int idade){
        if (idade <0 || idade > 150){
            throw new IllegalArgumentException("idade invalida" + idade);
        }
        this.idade = idade;
    }
    public void setEmail(String email){
        if (email == null || !email.contains("@")){
            throw new IllegalArgumentException("Email inválido");
        }
        this.email = email;
    }
    public void setAltura(double altura){
        if(altura <  0.6 || altura > 3){
            throw new IllegalArgumentException(" 60cm <altura < 3m");
        }
        this.altura = altura;
    }
    public void setPeso(double peso){
        if(peso < 3.0 || peso > 250){
            throw new IllegalArgumentException("Peso deve ser 3 < Peso < 250");
        }
        this.peso = peso;
    }
    
    public String getNome(){ return nome;};
    public String setEmail(){return email;};
    public int getIdade(){return idade;};
    public double peso(){return peso;};
    public double altura(){return altura;};
    public double getImc(){return imc;};
    
    public void calculoImc(double peso, double altura){
        imc = peso / (altura * altura);
        System.out.println("Seu IMC eh: " + String.format("%.2f",imc));
    }
    
}
