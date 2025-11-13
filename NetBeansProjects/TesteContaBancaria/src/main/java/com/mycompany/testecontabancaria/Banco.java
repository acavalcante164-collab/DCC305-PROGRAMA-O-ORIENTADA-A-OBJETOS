/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testecontabancaria;

/**
 *
 * @author alons
 */
public class Banco {
        private String numeroDaConta;
        private String agencia;
        public double saldo;
        public double valor;
         
 // Construtor
 public Banco(String numeroDaConta, String agencia, double saldo, float valor) {
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.valor = valor;        
 }
 
 public void exibirDados() { 
        System.out.println("NumeroDaConta: " + this.numeroDaConta);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Saldo: " + this.saldo);
        
 }
public double sacar(double valor){
        if(valor >0 && valor <= saldo){
            saldo -=valor;
            System.out.println("Saque realizado! Saldo atual: R$ "+saldo);
        }else{
            System.out.println("Saldo insuficiente ou valor invalido!");
        }
        return this.saldo = saldo;
        }
 public void depositar(double valor){
        if(valor > 0){
        saldo += valor;
        System.out.println("Deposito realizado! Saldo atual: R$ "+saldo);
        }else{
        System.out.println("Valor de deposito deve ser positivo");
        }
        }
}
