/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.amatur;

/**
 *
 * @author alons
 */
import java.util.concurrent.Semaphore;
public class Amatur {

    public static void main(String[] args) {
        
        Onibus onibusBV = new Onibus();
        
        // O SERVIDOR AGUENTA APENAS 3 CONEXÕES SIMULTÂNEAS
        Semaphore semaforoLimitador = new Semaphore(3);
        
         System.out.println("--- INICIANDO SISTEMA COM LIMITE DE 3 CONEXOES ---\n");

         // Criando 7 agentes para apenas 5 vagas!
        new AgenteVenda(onibusBV, "Agente 1", semaforoLimitador).start();
        new AgenteVenda(onibusBV, "Agente 2", semaforoLimitador).start();
        new AgenteVenda(onibusBV, "Agente 3", semaforoLimitador).start();
        new AgenteVenda(onibusBV, "Agente 4", semaforoLimitador).start();
        new AgenteVenda(onibusBV, "Agente 5", semaforoLimitador).start();
        new AgenteVenda(onibusBV, "Agente 6", semaforoLimitador).start();
        new AgenteVenda(onibusBV, "Agente 7", semaforoLimitador).start(); 
        
        // 3. Thread de Cancelamento entra em ação
        // Ela vai liberar a vaga e acordar o Agente 2
        new Cancelamento(onibusBV, "Sistema de Cancelamento").start();
  }   
}

