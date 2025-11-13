/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_03_polimorfismo;

/**
 *
 * @author alons
 */
public class Moto implements VeiculoMotorizado {
    
    @Override
    public void ligarMotor(){
        System.out.println("Motor ligado ...");
    }
    
    @Override
    public void desligarMotor(){
        System.out.println("Motor desligado ...");
    }
    
}
