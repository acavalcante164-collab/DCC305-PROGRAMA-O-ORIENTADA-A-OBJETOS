
package com.mycompany.main;


public class Personagem {
    //Atributos
    private String nome;
    private int vida;
    private int mana;
    private String id_personagem;
    
    //Construtor com validacao inicial
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
    
    //SETTERS COM VALIDACAO
    public void setVida(int vida){
    if(vida > 0 && vida <= 200){
        this.vida = vida;
    }else if (vida < 0){
        this.vida = 0; //EVITA VALORES NEGATIVOS
    }
    }
    
    public void setMana(int mana){
        if (mana >=0 && mana <= 100) {
            this.mana =mana;
        } else if (mana < 0){
            this.mana = 0;
        }
    }
    //METODOS PARA ACAO
    public void levarDano(int dano){
        if (dano > 0){
        setVida(this.vida - dano);
        System.out.println(nome + " levou " + dano + " de dano!");
        }
    }
    
    public void curar(int cura){
        if(cura > 0){
            setVida(this.vida + cura);
            System.out.println(nome + " recuperou" + cura + " de vida!");
        }
    }
    
    public void usarMana(int custo){
        if (custo > 0 && this.mana >= custo){
            setMana(this.mana - custo);
            System.out.println(nome + " usou " + custo + " de mana!");
        } else {
            System.out.println(nome + " nao tem mana suficiente!");
        }
    }
    
    public void meditar(int ganhoMana){
        if(ganhoMana > 0){
            setMana(this.mana + ganhoMana);
            System.out.println(nome + " meditou e recuperou " + ganhoMana + " de mana");
        }
    }
    
    public void status(){
        System.out.println("=== Status do Personagem ===");
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Mana: " + mana);
        System.out.println("ID: " + id_personagem);
    }
}
