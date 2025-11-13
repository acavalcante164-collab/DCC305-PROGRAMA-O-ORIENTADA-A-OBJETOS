/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto2;

/**
 *
 * @author alons
 */
import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
    private int numero;
    private List<ItemDaNota> itens;

 public NotaFiscal(int numero) {
    this.numero = numero;
    this.itens = new ArrayList<>();
 }

 // Método crítico de composição
 // vem a seguir...
 public void adicionarItem(String produto,int quantidade,double preco) {
 // ITEM É CRIADO AQUI DENTRO!
 ItemDaNota item = new ItemDaNota(produto, quantidade,preco);
 this.itens.add(item);
}
public double calcularTotal() {
 double total = 0;
 for (ItemDaNota item : itens){
    total += item.calcularSubtotal();
 }
 return total;
}
}
