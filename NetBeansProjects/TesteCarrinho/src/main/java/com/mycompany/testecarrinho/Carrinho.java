/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testecarrinho;

/**
 *
 * @author alons
 */
public class Carrinho {
    private String modelo;
    private String cor;
    private int velocidade;
    
    //construtor
    public Carrinho(String modelo, String cor){
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = 0;
    }
    //getter
    public String getModelo(){return modelo;}
    public String getCor(){return cor;}
    public int getVelocidade(){return velocidade;}
    
    //Setter com validacao
    public void setVelocidade(int velocidade){
        if (velocidade >= 0 && velocidade <= 200){
            this.velocidade = velocidade;
        }
    }
    //metodos de comportamento
    public void acelerar(){
    setVelocidade(this.velocidade + 10);
    }
}
