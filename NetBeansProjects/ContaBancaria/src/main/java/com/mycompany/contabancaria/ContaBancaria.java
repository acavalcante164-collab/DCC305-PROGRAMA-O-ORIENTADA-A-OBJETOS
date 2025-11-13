/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabancaria;

/**
 *A ContaBancaria "tem uma" Pessoa como titular. Isso demonstra como classes podem se relacionar para formar sistemas
mais complexos.
 * @author alons
 */
public class ContaBancaria {
   
        private int numeroDaConta;
        private double saldo;
        private Pessoa titular; //RELACAO COM A CLASSE PESSOA
        
        
        public ContaBancaria(int numeroDaConta, Pessoa titular){
            this.numeroDaConta = numeroDaConta;
            this.titular = titular;
            this.saldo = 0.0; //CONTA INICIA ZERADA
        } 
        
        //METODOS
        public void depositar(double valor){
        if(valor > 0){
        saldo += valor;
        System.out.println("Deposito realizado! Saldo atual: R$ "+saldo);
        }else{
        System.out.println("Valor de deposito deve ser positivo");
        }
        }
        
        public void sacar(double valor){
        if(valor >0 && valor <= saldo){
        saldo -=valor;
        System.out.println("Saque realizado! Saldo atual: R$ "+saldo);
        }else{
        System.out.println("Saldo insuficiente ou valor invalido!");
        }
        }
        public void exibirTitular(){
        System.out.println("Titular: "+titular.getNome()+" (CPF: "+titular.getCpf()+")");
        }
        
        
        public static void main(String[]args){
        //Criando uma pessoa
        Pessoa joao = new Pessoa("Joao Silva", "123.456.789-00");
        Pessoa alonso = new Pessoa("Alonso", "123.456.789-01");
    
        ContaBancaria conta = new ContaBancaria(12345, joao);
        ContaBancaria conta1 = new ContaBancaria(54321, alonso);
        
        conta.exibirTitular();
        conta.depositar(1000.0);
        conta.sacar(300.0);
        conta.sacar(800.0);
        
        conta1.exibirTitular();
        conta1.depositar(500.0);
        conta1.sacar(150.0);
        conta1.sacar(400.0);
        }
}
