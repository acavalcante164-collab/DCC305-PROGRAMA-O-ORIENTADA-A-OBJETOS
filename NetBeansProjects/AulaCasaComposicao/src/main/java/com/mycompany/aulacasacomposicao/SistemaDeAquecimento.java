/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulacasacomposicao;

/**
 *
 * @author alons
 */
// CLASSE BASE ABSTRATA
// Define o "contrato" que todo sistema de aquecimento deve seguir.
public abstract class SistemaDeAquecimento {
    protected String nome;
    protected double temperatura;

    public SistemaDeAquecimento(String nome, double temperaturaInicial) {
        this.nome = nome;
        this.temperatura = temperaturaInicial;
    }

    // Método abstrato força as classes filhas a implementarem sua própria lógica de aquecimento.
    public abstract void aquecer(double temperatura);

    public double getTemperatura() {
        return temperatura;
    }
}




