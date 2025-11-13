/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testecontabancaria;

/**
 *
 * @author alons
 */
public class ContaCorrente extends Banco {
    private double limiteChequeEspecial;
    
    //CONSTRUTOR
    public ContaCorrente(String numeroDaConta, String agencia, double saldo, float valor){
        super(numeroDaConta, agencia, saldo, valor);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    //GETTER
    public double getLimiteChequeEspecial(){return this.limiteChequeEspecial = 1500;}
}
