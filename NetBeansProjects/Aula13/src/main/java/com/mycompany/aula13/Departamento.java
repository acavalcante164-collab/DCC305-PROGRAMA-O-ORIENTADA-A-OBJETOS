/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula13;

/**
 *
 * @author alons
 */

public class Departamento {
    private String nome;
    private String sigla;
 // ... Poderia ter Lista de Professores, Cursos, etc.

 public Departamento(String nome, String sigla) {
    this.nome = nome;
    this.sigla = sigla;
    System.out.println("Departamento " + nome + " (" + sigla + ") criado.");
 }

 public String getNome() {
 return this.nome;
 }
}

