/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testecontabancaria;

/**
 *
 * @author alons
 */
public class TesteContaBancaria {

    public static void main(String[] args) {
        ContaCorrente corrente1 = new ContaCorrente("650000", "0000", 25, 4f);
        ContaPoupanca poupanca1 = new ContaPoupanca("650001", "0001", 50, 8f);
 // Exibindo os dados
 System.out.println("--- CONTA CORRENTE ---");
 corrente1.exibirDados(); // ESTE MÉTODO FOI HERDADO!
 System.out.println("Limite de Cheque: R$ " + corrente1.getLimiteChequeEspecial());
 
 System.out.println("\n--- CONTA POUPANCA ---");
 poupanca1.exibirDados(); // ESTE MÉTODO FOI HERDADO!
 System.out.println("Rendimento Poupanca: " + poupanca1.getTaxaDeRendimento ());


System.out.println("\n--- SAQUE ---"); 
        corrente1.depositar(1000.0);
        corrente1.sacar(300.0);
        corrente1.sacar(800.0);
 }
        
 }

