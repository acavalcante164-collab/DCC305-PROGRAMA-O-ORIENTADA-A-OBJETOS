
package com.mycompany.ex_04_polimorfismo;

public class Guerreiro extends Personagem  {
    int dano = 15;
    
    public Guerreiro(String nome, int vida, int mana, String id_personagem){
    super(nome, vida, mana,  id_personagem);
    }
    @Override
    public void atacar(){
        //IMPRESSAO
        System.out.println("Ataque com espada ... (Dano:  " + this.dano + ")");
        
    }
    
}
