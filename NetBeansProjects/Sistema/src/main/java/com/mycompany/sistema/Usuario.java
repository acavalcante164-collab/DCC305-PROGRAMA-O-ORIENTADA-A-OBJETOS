/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema;

/**
 *
 * @author alons
 */
public class Usuario implements ILogavel {
 private String email;
 private String nome;

 Usuario(String nome, String email){
     this.nome = nome;
     this.email = email;
 }
 // Construtor, getters, setters...

 @Override
 public String getInfoParaLog() {
 return "Usuario criado: " + email + " (" + nome + ")";
 }
}

