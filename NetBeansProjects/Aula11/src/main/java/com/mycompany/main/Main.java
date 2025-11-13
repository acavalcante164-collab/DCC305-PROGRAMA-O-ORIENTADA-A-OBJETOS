/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author alons
 */
public class Main {

 public static void main(String[] args) { // Criando um objeto Carro
 Carro meuCarro = new Carro("NAB-1234", "Fiat", "Uno", 2010, "00000");
 Moto MinhaMoto = new Moto("NAB-1234", "Honda", "Fan", 2014, "00001");

 // Exibindo os dados
 System.out.println("--- Dados do Carro ---");
 meuCarro.exibirDados(); // ESTE MÉTODO FOI HERDADO!
 System.out.println("Portas: " + meuCarro.getNumeroDePortas());
 
 System.out.println("\n--- Dados da Moto ---");
 MinhaMoto.exibirDados(); // ESTE MÉTODO FOI HERDADO!
 System.out.println("Cilindradas: " + MinhaMoto.getCilindradas());
 }
}
