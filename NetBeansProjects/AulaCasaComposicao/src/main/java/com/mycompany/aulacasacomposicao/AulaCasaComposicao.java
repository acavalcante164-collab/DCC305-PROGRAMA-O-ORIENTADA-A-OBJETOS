/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulacasacomposicao;

/**
 *
 * @author alons
 */
public class AulaCasaComposicao {

    public static void main(String[] args) {
        // 1. Criamos um sistema de aquecimento a gás.
        SistemaDeAquecimento aGas = new AquecimentoAGas("CentralGás 2000", 18);

        // 2. Criamos uma casa e INJETAMOS o sistema a gás nela.
        Casa minhaCasa = new Casa(aGas);

        // 3. Usamos a casa, que por sua vez usará o sistema a gás.
        minhaCasa.ajustarClima(24);

        System.out.println("\n-----------------------------------\n");

        // 1. Criamos um sistema de aquecimento solar.
        SistemaDeAquecimento solar = new AquecimentoSolar("EcoHeat SunPower", 19);

        // 2. Criamos outra casa e INJETAMOS o sistema solar nela.
        Casa casaEcologica = new Casa(solar);

        // 3. Usamos a casa ecológica, que usará seu sistema solar.
        casaEcologica.ajustarClima(22);
    }
}
