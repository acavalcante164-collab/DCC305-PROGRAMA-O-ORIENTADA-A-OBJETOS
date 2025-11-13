/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interface_ex10;

/**
 *
 * @author alons
 */
public class Interface_Ex10 {

    public static void main(String[] args) {
        //CRIANDO UMA INSTANCIA DA IMPLEMENTACAO
        IValidador meuValidador = new ValidadorDeNome();
        
        System.out.println("=== TESTE 1: VALIDO ===");
        meuValidador.validar("Ana");
        
        System.out.println("=== TESTE 2: NOME CURTO ===");
        meuValidador.validar("Lu");
        
        System.out.println("=== TESTE 3: VAzio ===");
        meuValidador.validar("");
        
        System.out.println("=== TESTE 4: NULO ===");
        meuValidador.validar(null);
    }
}
