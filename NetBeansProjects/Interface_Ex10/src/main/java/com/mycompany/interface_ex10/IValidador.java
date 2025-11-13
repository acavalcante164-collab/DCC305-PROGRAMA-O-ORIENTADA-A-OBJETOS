/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interface_ex10;

/**
 *
 * @author alons
 */
public interface IValidador {
    //ABSTRATO -  CONTRATO PRINCIPAL
    boolean validar(String texto);
    
    static boolean isNullOrEmpty(String texto){
        //RETORNA 'TRUE' SE O TEXTO FOR NULO OU SE ESTIVER VAZIO
        return texto == null || texto.isEmpty();
    }
    
}
