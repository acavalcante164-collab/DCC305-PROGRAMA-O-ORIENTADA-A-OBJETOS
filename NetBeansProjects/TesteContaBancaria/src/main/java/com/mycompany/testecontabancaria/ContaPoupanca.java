/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testecontabancaria;

/**
 *
 * @author alons
 */
public class ContaPoupanca extends Banco {
    public double taxaDeRendimento;
    
    //CONSTRUTOR
    public ContaPoupanca(String numeroDaConta, String agencia, double saldo, float valor){
        super(numeroDaConta, agencia, saldo, valor);
        this.taxaDeRendimento = taxaDeRendimento;
    }
    //GETTER
    public double getTaxaDeRendimento(){return this.taxaDeRendimento = 5;}
}


/*

public double sacar(double valor){
        if(valor >0 && valor <= saldo){
            saldo -=valor;
            System.out.println("Saque realizado! Saldo atual: R$ "+saldo);
        }else{
            System.out.println("Saldo insuficiente ou valor invalido!");
        }
        return this.saldo = saldo;
        }

*/