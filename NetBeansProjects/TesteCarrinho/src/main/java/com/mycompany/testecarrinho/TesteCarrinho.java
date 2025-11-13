/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testecarrinho;

/**
 *
 * @author alons
 */
public class TesteCarrinho {

    public static void main(String[] args) {
        Carrinho carrinho1 = new Carrinho ("Palio", "Vermelho");
        
        //ACESSO SEGURO ATRAVES DE GETTERS
        System.out.println("Modelo: " + carrinho1.getModelo());
        System.out.println("Velocidade: " + carrinho1.getVelocidade());
        
        //MODIFICACAO CONTROLADA ATRAVAS DE SETTER
        carrinho1.acelerar();
        carrinho1.setVelocidade(50);
        
        //Tentativa invalida rejeitada
        carrinho1.setVelocidade(-10);
        
        System.out.println("Velocidade final: " + carrinho1.getVelocidade());
    }
}
