/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author alons
 */
// Arquivo: Carro.java
public class Carro extends Veiculo { // Usando a herança!
        private int numeroDePortas;
 // Construtor do Carro
public Carro(String placa, String marca, String modelo, int ano, String renavam){
        super(placa, marca, modelo, ano, renavam);
        this.numeroDePortas = numeroDePortas; 
 }
//GETTER
 public int getNumeroDePortas(){return this.numeroDePortas = 4;}

}