/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testebiblioteca;

/**
 *
 * @author alons
 */
public class Livro {
 private String titulo;
 private String autor;
 public Livro(String titulo, String autor) {
 this.titulo = titulo;
 this.autor = autor;
 }
 // Métodos getter essenciais
 public String getTitulo() {
 return titulo;
 }
 public String getAutor() {
 return autor;
 }
 // Método para exibir informações do livro
 public String toString() {
 return "\"" + titulo + "\" por " + autor;
 }
}
