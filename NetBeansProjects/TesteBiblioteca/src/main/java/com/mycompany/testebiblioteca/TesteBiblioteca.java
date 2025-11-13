/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testebiblioteca;

/**
 *
 * @author alons
 */
public class TesteBiblioteca {

    public static void main(String[] args) {
 Biblioteca bib = new Biblioteca();

 // Adicionando livros
 bib.adicionarLivro(new Livro("1984", "George Orwell"));
 bib.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis"));
 bib.adicionarLivro(new Livro("O Cortiço", "Aluísio Azevedo"));

 // Listando todos os livros
 bib.listarLivros();

 // Buscando um livro específico
 Livro encontrado = bib.buscarLivroPorTitulo("1984");
 if (encontrado != null) {
 System.out.println("Livro encontrado: " + encontrado);
 }
 
}
}