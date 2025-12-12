/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.amatur;

/**
 *
 * @author alons
 */
public class Cancelamento extends Thread {
    private Onibus onibus;
    private String nome;

    public Cancelamento(Onibus onibus, String nome) {
        this.onibus = onibus;
        this.nome = nome;
    }

    @Override
    public void run() {
        System.out.println("--- " + this.nome + " aguardando para realizar cancelamento... ---");
        // Chama o método que tem o notifyAll()
        onibus.cancelarPassagem(this.nome);
    }
}
