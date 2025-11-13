/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testebiblioteca;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author alons
 */
public class Biblioteca {
    private List<Livro> livros; // Coleção de livros

public Biblioteca() {
    livros = new ArrayList<Livro>(); // Inicializa a lista vazia
 }

 public void adicionarLivro(Livro livro) {
    livros.add(livro);
    System.out.println("Livro adicionado: " + livro.toString());
 }
 
 public Livro buscarLivroPorTitulo(String titulo) {
    for (Livro livro : livros) { // Enhanced for loop
        if (livro.getTitulo().equalsIgnoreCase(titulo)) {
        return livro; // Retorna o primeiro livro encontrado
        }
    }
    return null; // Retorna null se não encontrar
}
public void listarLivros() {
    if (livros.isEmpty()) {
        System.out.println("Biblioteca vazia!");
    } else {
        System.out.println("Acervo da biblioteca:");
        for (Livro livro : livros) {
            System.out.println("- " + livro.toString());
         }
     }
}
}
