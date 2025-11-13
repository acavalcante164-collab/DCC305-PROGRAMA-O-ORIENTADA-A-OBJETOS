/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interface_ex03;

/**
 *
 * @author alons
 */
public class Computador  {
    //ATRIBUTOS
    
    //CONSTRUTOR
    
    //METODOS
    public void conectarDispositivo(IConectavelUSB dispositivo){
            System.out.println("TENTANDO CONECTAR UM DISPOSITIVO...");
            dispositivo.conectarUSB();
            System.out.println("-------------");
    }
    
}
    

