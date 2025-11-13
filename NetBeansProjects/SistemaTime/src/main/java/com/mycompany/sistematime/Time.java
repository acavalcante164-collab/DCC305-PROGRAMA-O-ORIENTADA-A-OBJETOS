/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistematime;
import java.util.ArrayList;
/**
 *
 * @author alons
 */

public class Time {
 private String nome;
 private String tecnico;
 private ArrayList<Jogador> jogadores;

 public Time(String nome, String tecnico,
 int anoFundacao) {
 this.nome = nome;
 this.tecnico = tecnico;
 this.jogadores = new ArrayList<Jogador>();
 }

 public void adicionarJogador(Jogador j) {
 jogadores.add(j);
 }

 public void listarJogadores() {
    for (Jogador j : jogadores) {
        System.out.println(j.getNome());
    }
 }
}
