
package com.mycompany.ex_03_polimorfismo;

public class Carro implements VeiculoMotorizado {
    
    @Override
    public void ligarMotor(){
        System.out.println("Motor ligado ...");
    }
    
    @Override
    public void desligarMotor(){
        System.out.println("Motor desligado ...");
    }    
    
}
