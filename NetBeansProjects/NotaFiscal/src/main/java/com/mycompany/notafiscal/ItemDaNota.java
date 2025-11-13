/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto2;

/**
 *
 * @author alons
 */

public class ItemDaNota {
 private String produto;
 private int quantidade;
 private double preco;

 public ItemDaNota(String prod, int qtd, double preco){
 this.produto = prod;
 this.quantidade = qtd;
 this.preco = preco;
 }

 public double calcularSubtotal() {
 return quantidade * preco;
 }
}