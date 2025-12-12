/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concorrenciaamatur;

/**
 *
 * @author alons
 */
public class AgenteVenda extends Thread{
    private Onibus onibus;
    private String nome;
    
    public AgenteVenda(Onibus onibus, String nome){
        this.onibus = onibus;
        this.nome = nome;
    }
    
    @Override
    public void run(){
        onibus.reservarAssento(this.nome);
    }
}
