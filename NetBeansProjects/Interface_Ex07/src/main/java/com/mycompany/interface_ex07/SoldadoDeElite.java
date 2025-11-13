/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interface_ex07;

/**
 *
 * @author alons
 */
public class SoldadoDeElite implements ISoldado {
    
    @Override
    public void patrulhar(){
        System.out.println("Soldado em estado de patrulha");
    }
    @Override
     public void mirar(){
         System.out.println("Soldado estah mirando...");
     
     } 
     @Override
     public void atirar(){
         System.out.println("Alvo encontrado.. atirando");
     }
}
