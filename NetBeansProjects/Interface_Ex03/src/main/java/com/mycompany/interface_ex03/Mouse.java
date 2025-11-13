/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interface_ex03;

/**
 *
 * @author alons
 */
public class Mouse implements IConectavelUSB {
    //ATRIBUTOS
    
    //CONSTRUTOR    
    
    //METODOS    
    @Override
    public void conectarUSB (){
        System.out.println("Mouse conectado com sucesso a porta USB. Ponteiro ativado!");
    }
}
