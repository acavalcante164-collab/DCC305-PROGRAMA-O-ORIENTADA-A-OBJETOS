/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.amatur;

/**
 *
 * @author alons
 */
import java.util.concurrent.Semaphore;
public class AgenteVenda extends Thread {
    
     private Onibus onibus; //OBJETO ONIBUS
     private Semaphore semaforoServidor;      
     private String nome;
     
     public AgenteVenda(Onibus onibus, String nome, Semaphore semaforo) {
         this.onibus = onibus;
         this.nome = nome;
         this.semaforoServidor = semaforo;
     }
    @Override
    public void run() {
        try {
            System.out.println("... " + nome + " chegou na fila do servidor.");
            
            //CONTROLE DE FLUXO
            //TENTANDO PEGAR UMA DAS 3 PERMISSOES. Se nao tiver bloqueio
            semaforoServidor.acquire();
            System.out.println(nome + " Entrou no servidor. (Conexao estabelecida)");
            
            //REALIZA A OPERACAO
            onibus.reservarAssento(this.nome);
            
            //simula um tempo extra de conexao aberta
            Thread.sleep(500);
            
        } catch(InterruptedException e) { 
            e.printStackTrace();
        } finally {
            
            //FIM DO CONTROLE DE FLUXO
            //LIBERANDO A PERMISSAO
            System.out.println(nome + " desconectou. Liberando vaga no servidor.");
            semaforoServidor.release();
        }
    }
}
    