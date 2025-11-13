/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interface_ex06;

/**
 *
 * @author alons
 */
public class Robo implements IMovivel,  IEmissorSom{
        
    @Override
    public void mover(int x ,int y){
        System.out.println("Robo andando para ("+ x +", "+ y +")");
    }
    @Override
    public void fazerSom(){
        System.out.println("Emitindo som: Zig zag");
    }
    @Override
    public void ajustarVolume(int nivel){
        System.out.println("Volume " + nivel);
    }
}
