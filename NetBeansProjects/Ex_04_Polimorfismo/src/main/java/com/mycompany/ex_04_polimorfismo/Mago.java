/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_04_polimorfismo;

/**
 *
 * @author alons
 */
public class Mago  extends Personagem implements HabilidadeEspecial {
    int dano = 10;
    
    public Mago(String nome, int vida, int mana, String id_personagem){
             super(nome, vida, mana,  id_personagem);
    }
    @Override
    public void atacar(){
        System.out.println("Lancando bola de fogo! ... (Dano:  " + this.dano + ")");
    }
    
    //IMPLEMENTACAO DA INTERFACE HABILIDADEESPECIAL
    @Override
    public void usarEspecial(){
        //MENSAGEM ESPECIAL
        System.out.println("Usando Teleporte!");
    }
}
