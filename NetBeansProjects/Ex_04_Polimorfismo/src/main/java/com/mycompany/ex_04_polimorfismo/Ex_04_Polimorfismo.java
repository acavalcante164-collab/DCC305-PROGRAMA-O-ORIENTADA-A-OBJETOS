package com.mycompany.ex_04_polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Ex_04_Polimorfismo {

    public static void main(String[] args) {
        
        // LISTA DE PERSONAGENS
        List<Personagem> personagens = new ArrayList<>();

        //ADICIONANDO GUERREIRO E MAGO QUE SÃO "FILHOS" DE UM PERSONAGEM 
        personagens.add(new Guerreiro("Grog", 150, 20, "g_01"));
        personagens.add(new Mago("Potter", 80, 100, "m_01"));

        // CHAMDANDO O ATAQUE
        System.out.println("--- RODADA DE ATAQUES ---");
        for (Personagem p : personagens) {
            
            System.out.print(p.getNome() + ": ");
            p.atacar();
        }

        // VERIFICANDO O ATAQUE ESPECIAL
        System.out.println("\n--- VERIFICANDO ESPECIAIS ---");
        for (Personagem p : personagens) {
            
                if (p instanceof HabilidadeEspecial) {
                System.out.println(p.getNome() + " pode usar uma habilidade especial!");
                
                HabilidadeEspecial especial = (HabilidadeEspecial) p;
                especial.usarEspecial();
                
            } else {
                System.out.println(p.getNome() + " nao possui habilidade especial.");
            }
        }
    }
}