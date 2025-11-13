/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula13;

/**
 *
 * @author alons
 */
import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String nome;
 // Composição: A Universidade TEM-UMA lista de Departamentos
    private List<Departamento> departamentos;
    public Universidade(String nome) {
    this.nome = nome;
 // A Universidade CRIA e gerencia sua própria lista
    this.departamentos = new ArrayList<>();
    System.out.println("Universidade " + nome + " fundada.");
    }
    
 public void adicionarDepartamento(String nomeDepto, String sigla) {
 // A Universidade controla a CRIAÇÃO de seus departamentos
    Departamento novoDepto = new Departamento(nomeDepto, sigla);
    this.departamentos.add(novoDepto);
 }
 
 public void listarDepartamentos() {
    System.out.println("Departamentos da " + this.nome + ":");
    for (Departamento d : departamentos) {
    System.out.println("- " + d.getNome());
    }
 }
}