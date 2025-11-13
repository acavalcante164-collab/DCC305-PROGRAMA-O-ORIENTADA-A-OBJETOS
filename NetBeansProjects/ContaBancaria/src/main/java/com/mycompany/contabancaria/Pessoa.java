/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabancaria;

public class Pessoa {
    //ATRIBUTOS
    private String nome;
    private String cpf;
    
    //CONSTRUTOR
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    //METODOS GETTER PARA ACESSAR OS ATRIBUTOS PRIVADO
    public String getNome(){
    return nome;
    }
    //METODOS GETTER PARA ACESSAR OS ATRIBUTOS PRIVADO
    public String getCpf(){
        return cpf;
    }
    
}