/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.concorrenciaamatur;

/**
 *
 * @author alons
 */
public class ConcorrenciaAmatur {

    public static void main(String[] args) {
        Onibus onibusBV = new Onibus();
        
        //CRIANDO 7 AGENTES PARA APENAS 5 VAGAS
        new AgenteVenda(onibusBV, "Agente 1").start();
        new AgenteVenda(onibusBV, "Agente 2").start();
        new AgenteVenda(onibusBV, "Agente 3").start();
        new AgenteVenda(onibusBV, "Agente 4").start();
        new AgenteVenda(onibusBV, "Agente 5").start();
        new AgenteVenda(onibusBV, "Agente 6").start();
        new AgenteVenda(onibusBV, "Agente 7").start();
    }
}
