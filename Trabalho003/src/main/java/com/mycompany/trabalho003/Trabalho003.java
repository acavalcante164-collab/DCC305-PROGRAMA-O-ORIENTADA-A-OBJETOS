/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalho003;

/**
 *
 * @author alons
 */
public class Trabalho003 {

    public static void main(String[]args) {
        //Criando uma pessoa
        Pessoa joao = new Pessoa("Joao Silva", "123.456.789-00");
        ContaBancaria conta = new ContaBancaria(12345, joao);
        
        conta.exibirTitular();
        
        //TRANSACAO DO JOAO
        //TRY-CATCH PARA QUE SE DER ERRO O PROGRAMA NAO FECHE
        try {
            conta.depositar(1000.0);
            conta.sacar(300.0);
            conta.sacar(800.0);
        } catch (SaldoInsuficienteException e) {
            //CAPTURA O ERRO PREVISTO E FORMATA A MENSAGEM
            System.out.println("[AVISO] Operacao cancelada: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            //CAPTURA O ERRO DO VALOR NEGATIVO
            System.out.println("[ERRO] Input invalido: " + e.getMessage());
        }
        
        System.out.println("------------------------------------------------");
       
        // --- CENÁRIO 2: Transações do Alonso ---
        
        Pessoa alonso = new Pessoa("Alonso", "987.654.321-01");        
        ContaBancaria conta1 = new ContaBancaria(54321, alonso);
        
        conta1.exibirTitular();
        
        try {
            conta1.depositar(500.0);
            conta1.sacar(150.0);
            conta1.sacar(400.0);            
        } catch (SaldoInsuficienteException e){
            System.out.println("[AVISO] Operacao cancelada: " + e.getMessage());
           }
      }
}
