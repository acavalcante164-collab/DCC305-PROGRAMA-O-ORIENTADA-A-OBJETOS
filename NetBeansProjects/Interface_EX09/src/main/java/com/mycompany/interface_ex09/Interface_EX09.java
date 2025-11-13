/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interface_ex09;

/**
 *
 * @author alons
 */
public class Interface_EX09 {
    
    
    public static void main(String[] args) {
        // Criando a instância
        ICalculadora calc = new MinhaCalculadora();
        
        int x = 100;
        int y = 25;

        // --- Testando 'somar' ---
        int resultadoSoma = calc.somar(x, y);
        System.out.println("Resultado da Soma: " + resultadoSoma);
        
        System.out.println("---------------------------------");
        
        // --- Testando 'subtrair' ---
        // Esta chamada executa o método 'default' da INTERFACE,
        // pois MinhaCalculadora não o sobrescreveu.
        System.out.println("[Metodo 'subtrair' (default) da Interface sera chamado]");
        int resultadoSub = calc.subtrair(x, y);
        System.out.println("Resultado da Subtracao: " + resultadoSub);
        
    }
}
