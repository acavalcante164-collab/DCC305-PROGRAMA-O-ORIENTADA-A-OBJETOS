/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.amatur;

/**
 *
 * @author alons
 */

public class Onibus {
        private int assentosDisponiveis = 2;
        // Definimos um limite para não criar vagas que não existem fisicamente
        private final int CAPACIDADE_MAXIMA = 5;

                // --- METODO DE VENDA ---
              public void reservarAssento(String agente) {
                System.out.println(agente + " tentando comprar...");
     
                //BLOCO SYNCHRONIZED
                //TRANCAMOS ANTES DE VERIFICAR
                 synchronized (this){
                     
                if (assentosDisponiveis > 0) {
                    System.out.println(agente + " verificou disponibilidade (Tem vaga).");

                     try {
                    //MESMO DORMINDO NINGUEM VAI ENTRA NO BLOCO
                    //PORQUE ESTA THREAD TA SEGURANDO A CHAVE DO BANHEIRO THIS
                    Thread.sleep(100);
                    } catch (Exception e) { }        
        
                    assentosDisponiveis--;
                    System.out.println(agente + " vendeu! Restam: " + assentosDisponiveis);
        
                 } else {
                         System.out.println(agente + ": Onibus lotado!");
                  }
                 }   //FIM DO BLOCO
                     //A CHAVE LIBERA     
 }
// --- PRODUTOR (Devolve uma vaga) ---
    public synchronized void cancelarPassagem(String responsavel) {
        // Simula tempo de processamento
        try { Thread.sleep(2000); } catch (Exception e) {}

        if (assentosDisponiveis < CAPACIDADE_MAXIMA) {
            assentosDisponiveis++;
            System.out.println( responsavel + " cancelou uma compra. Vaga liberada! Total: " + assentosDisponiveis);
            
            // 3. AVISO: Acorda quem estava dormindo no wait()
            notifyAll(); 
        } else {
            System.out.println(responsavel + ": Nao ha passagens para cancelar.");
        }
    }
}
