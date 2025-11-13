/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author alons
 */
public class Moto extends Veiculo {
    private int cilindradas;
    //CONSTRUTOR
public Moto(String placa, String marca, String modelo, int ano, String renavam){
    super(placa, marca, modelo, ano, renavam);
    this.cilindradas = cilindradas;
}
    public int getCilindradas(){return this.cilindradas = 150;}
}

