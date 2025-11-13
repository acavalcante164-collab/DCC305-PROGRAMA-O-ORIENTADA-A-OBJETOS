
package com.mycompany.ex001;

public class Caneta {
    
    //atributos
    String cor;
    String modelo;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("UMA CANETA " + this.cor);
        System.out.println("TAMPADA = " + this.tampada);
        System.out.println("MODELO = " + this.modelo);
        System.out.println("PONTA = " + this.ponta);
        System.out.println("CARGA = " + this.carga);
    
    }
    //Metodos
    void rabiscar(){
        if(this.tampada){
            System.out.println("Erro! Nao posso rabiscar");
        } else {
            System.out.println("Voce rabiscou");
        }
    
    }
    void tampar(){
     this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    
    }
    
    
}
