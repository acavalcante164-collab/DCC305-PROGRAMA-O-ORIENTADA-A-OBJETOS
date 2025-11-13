/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interface_ex10;

/**
 *
 * @author alons
 */
//CLASSE QUE IMPLEMENTA O CONTRATO VALIDADOR
public class ValidadorDeNome implements IValidador {
    
    @Override
    public boolean validar(String texto){
        System.out.println("Validando o nome: \"" + texto + "\"");    
        if (IValidador.isNullOrEmpty(texto)){
            System.out.println("VALIDACAO FALHOU: o nome nao pode ser nulo ou vazio");
            return false;
        }
        if (texto.length()<= 2){
            System.out.println("VALIDACAO FALHOU: o nome deve ter mais de 2 caractere");
            return false;
        }
        System.out.println("VALIDACAO OK: Nome valido.");
        return true;
    }
}
