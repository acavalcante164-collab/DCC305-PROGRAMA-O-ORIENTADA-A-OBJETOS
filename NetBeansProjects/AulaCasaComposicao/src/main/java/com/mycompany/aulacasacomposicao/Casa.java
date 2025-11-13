/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulacasacomposicao;

/**
 *
 * @author alons
 */
public class Casa {
    // A Casa "tem-um" SistemaDeAquecimento. Esta é a COMPOSIÇÃO.
    private SistemaDeAquecimento aquecedor;

    // CORREÇÃO: Usamos Injeção de Dependência via construtor.
    // A Casa agora RECEBE um sistema de aquecimento em vez de criar um.
    public Casa(SistemaDeAquecimento aquecedorInstalado) {
        System.out.println("Construindo uma casa...");
        this.aquecedor = aquecedorInstalado; // O aquecedor é "injetado" aqui.
        System.out.println("Sistema de aquecimento instalado com sucesso!");
    }

    public void ajustarClima(int tempDesejada) {
        System.out.println("\nSolicitando ajuste de clima na casa...");

        // DELEGAÇÃO: A Casa pede ao seu sistema para aquecer.
        // Não importa se é a gás ou solar, ela apenas chama o método.
        this.aquecedor.aquecer(tempDesejada);

        System.out.println("Clima ajustado. Temperatura atual: " + this.aquecedor.getTemperatura() + "°C.");
    }
}