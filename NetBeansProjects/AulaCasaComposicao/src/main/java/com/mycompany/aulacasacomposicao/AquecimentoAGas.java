/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulacasacomposicao;

/**
 *
 * @author alons
 */
// CLASSE ESPECÍFICA 1
public class AquecimentoAGas extends SistemaDeAquecimento {

    public AquecimentoAGas(String nome, double temperaturaInicial) {
        super(nome, temperaturaInicial);
    }

    @Override
    public void aquecer(double temperatura) {
        System.out.println(">> Aquecendo com GÁS usando o sistema '" + this.nome + "' para " + temperatura + "°C.");
        this.temperatura = temperatura;
    }
}
