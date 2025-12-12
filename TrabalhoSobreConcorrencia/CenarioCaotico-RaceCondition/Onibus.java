/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concorrenciaamatur;

/**
 *
 * @author alons
 */
public class Onibus {
    private int assentosDisponiveis = 5;
    
    public void reservarAssento(String agente){
        if (assentosDisponiveis > 0) {
            System.out.println(agente + " verificou disponibilidade.");
            
            try{
                Thread.sleep(100);
            } catch (Exception e) {}
            
                assentosDisponiveis--;
                System.out.println(agente + " vendeu! Restam: " + assentosDisponiveis);
        } else {
                System.out.println(agente + ": onibus lotado!");
           }
    }
    
}
