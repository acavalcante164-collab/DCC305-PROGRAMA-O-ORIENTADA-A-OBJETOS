
package com.mycompany.testeacai;

public class Acai {
    //ATRIBUTOS
    private String produto;
    private int tamanho;
    private double valor;
    boolean viagem;
    
    public Acai(String produto, int tamanho, double valor){
        this.produto = produto;
        setTamanho(tamanho);
        setValidarValor(valor);
    }
     
    
    public String getProduto(){return produto;}
    public int getTamanho(){return tamanho;}
    public double getValor(){return valor;}
   
    public void setTamanho(int tamanho){
        if (tamanho < 300) {
            throw new IllegalArgumentException("Tamanho tem que ser maior que 300 Ml");
        } else {
            this.tamanho = tamanho;
        }
    }    
    private void setValidarValor(double valor){
        if (valor < 0){
            throw new IllegalArgumentException("Valor tem que ser positivo");
        } else {
            this.valor = valor;
        }
    }
    void status(){
        System.out.println("Produto: " + this.getProduto());
        System.out.println("Tamanho: " + this.getTamanho());
        System.out.println("Valor = " + this.getValor());
    }
    
}
