/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_03_polimorfismo;

/**
 *
 * @author alons
 */
public class Ex_03_Polimorfismo {
    
    public static void estacionarVeiculo (VeiculoMotorizado veiculo) {
        
        System.out.println("\nIniciando estacionamento ...");
        
        //CHAMANDO O METODO 
        veiculo.desligarMotor();
        System.out.println("Veiculo estacionado!");        
    }

    public static void main(String[] args) {

            VeiculoMotorizado meuCarro = new Carro();
            VeiculoMotorizado minhaMoto = new Moto();
            
            //TESTE LIGANDO O VEICULO
            System.out.println("--- STATUS CARRO ---");
            meuCarro.ligarMotor( );
            
            System.out.println("--- STATUS MOTO ---");
            minhaMoto.ligarMotor();
            
            //OBJETO -> METODOS
            System.out.println("\n--- ESTACIONANDO CARRO ---");
            estacionarVeiculo(meuCarro);
            
            System.out.println("--- ESTACIONANDO MOTO ---");
            estacionarVeiculo(minhaMoto);           
    }
    
}
