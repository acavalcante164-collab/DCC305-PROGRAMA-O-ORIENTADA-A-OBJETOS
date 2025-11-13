/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interface_ex02;

/**
 *
 * @author alons
 */
public class Gerente implements IAutenticavel {
    String nome;
    String cargo;
    
    public Gerente(String nome, String cargo){
        this.nome = nome;
        this.cargo = cargo;
    }
    
    @Override
    public void login(){
        System.out.println(this.cargo  + "   " +  this.nome + " Login efetuado com sucesso."  );
    }
    //// O compilador detecta e impede a compilação sem o metodo que falta da interface
    @Override
    public void logout(){
        System.out.println(this.cargo  + "   " + this.nome  +  " Logout efetuado com sucesso." );
    }
}
