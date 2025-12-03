/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho003;

/**
 *
 * @author alons
 */
public class ContaBancaria  {
   
        private int numeroDaConta;
        private double saldo;
        private Pessoa titular; //RELACAO COM A CLASSE PESSOA
        
        
        public ContaBancaria(int numeroDaConta, Pessoa titular){
            
            this.numeroDaConta = numeroDaConta;
            this.titular = titular;
            this.saldo = 0.0; //CONTA INICIA ZERADA
        } 
        
        public void exibirTitular(){
            System.out.println("Titular: " + titular.getNome() +" (CPF: "+titular.getCpf()+")");
        }
        
        //METODOS
        public void depositar(double valor){
            // Tratamento de input invalido com Excecao nao checada
            if(valor <=  0){
                    throw new IllegalArgumentException("Valor do deposito deve ser positivo.");
             }
             saldo += valor;
             System.out.println("Deposito de R$ " + valor + " realizado. Saldo: R$ " + saldo);
             }
        
        // O 'throws'  avisa que quem chamar precisa lidar com a falta de saldo
        public void sacar(double valor) throws SaldoInsuficienteException {
            // 1. Validação de Input (Erro de lógica do programador/usuário)
            if(valor <= 0){
                throw new IllegalArgumentException("Valor de saque invalido: " + valor);
            } 
            // 2. Validação de Negócio (Erro de regra do banco)
            if (valor > this.saldo) {
                        // Lança nosso alarme específico!
                        throw new SaldoInsuficienteException("Saldo insuficiente! Tentou sacar: " + valor + ", Disponivel: " + this.saldo);
             }
            //3. Operacao (Exceutada quando passsar nos teste)
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Saldo: R$ " + saldo);
         }
}
            
        
        
        
        

