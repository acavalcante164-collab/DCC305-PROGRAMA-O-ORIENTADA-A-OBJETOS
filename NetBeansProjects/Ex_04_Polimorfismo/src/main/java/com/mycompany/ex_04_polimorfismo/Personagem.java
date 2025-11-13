
package com.mycompany.ex_04_polimorfismo;

public abstract class Personagem {

    //Atributos
    protected String nome;
    protected int vida;
    protected int mana;
    protected String id_personagem;
    
     //Construtor 
    public Personagem(String nome, int vida, int mana, String id_personagem){
    this.nome = nome;
    this.vida = (vida > 0) ? vida : 10; //valor padrao minimo
    this.mana = (mana > 0) ? mana : 15;
    this.id_personagem = id_personagem;
    }
    
    //getter
    public String getNome(){return nome;}
    public String getId_personagem(){return id_personagem;}
    public int getVida(){return vida;}
    public int getMana(){return mana;}
    
//METODO
//VOID PARA IMPRIMIR O ATAQUE
public abstract void atacar();
}
