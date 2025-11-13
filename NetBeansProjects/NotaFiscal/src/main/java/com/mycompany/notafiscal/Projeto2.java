/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto2;

/**
 *
 * @author alons
 */
public class Projeto2 {
    public static void main(String[] args){
    NotaFiscal nota = new NotaFiscal(12345);
// Não criamos itens fora!
// A nota os cria internamente
        nota.adicionarItem("Notebook", 1, 3500.00);
        nota.adicionarItem( "Mouse", 2, 50.00);
        System.out.println( "Total: R$ " + nota.calcularTotal());
    
}
}