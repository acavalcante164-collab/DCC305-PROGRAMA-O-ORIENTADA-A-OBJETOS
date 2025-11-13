/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistematime;

/**
 *
 * @author alons
 */
public class SistemaTime {
 public static void main(String[] args) {
 // Criando um time
 Time time = new Time("Flamengo", "Jorge Jesus", 1895);

 // Criando jogadores
 Jogador jogador1 = new Jogador("Gabriel", "Atacante",
 25, 9);
 Jogador jogador2 = new Jogador("Éverton", "Atacante",
 24, 7);

 // Adicionando jogadores ao time
 time.adicionarJogador(jogador1);
 time.adicionarJogador(jogador2);

 // Listando jogadores
 time.listarJogadores();
 }
}

