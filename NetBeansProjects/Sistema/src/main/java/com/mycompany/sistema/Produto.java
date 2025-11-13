/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema;

/**
 *
 * @author alons
 */
public class Produto implements ILogavel {
 private int id;
 private String descricao;
 private double preco;
 
 Produto (int id, String descricao, double preco){
     this.descricao = descricao;
     this.id = id;
     this.preco  =preco;
 }

 @Override
 public String getInfoParaLog() {
 return "Produto cadastrado: ID "
 + id + " - " + descricao
 + " (R$ " + preco + ")";
 }
}

