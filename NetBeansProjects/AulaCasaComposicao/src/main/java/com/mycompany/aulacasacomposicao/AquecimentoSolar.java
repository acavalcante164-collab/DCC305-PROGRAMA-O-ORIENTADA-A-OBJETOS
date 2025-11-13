/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulacasacomposicao;

/**
 *
 * @author alons
 */
// CLASSE ESPECÍFICA 2
public class AquecimentoSolar extends SistemaDeAquecimento {

    public AquecimentoSolar(String nome, double temperaturaInicial) {
        super(nome, temperaturaInicial);
    }

    @Override
    public void aquecer(double temperatura) {
        System.out.println(">> Aquecendo com ENERGIA SOLAR usando o sistema '" + this.nome + "' para " + temperatura + "°C.");
        this.temperatura = temperatura;
    }
}