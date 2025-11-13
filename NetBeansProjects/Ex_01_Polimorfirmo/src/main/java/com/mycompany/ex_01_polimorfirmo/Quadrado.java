/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_01_polimorfirmo;

/**
 *
 * @author alons
 */
/**
 *Crie a classe concreta Quadrado que herda de FiguraGeometrica.
 */
public class Quadrado  extends FiguraGeometrica {
    private double lado;
    
    public Quadrado(double lado){
        this.lado = lado;
    }
    @Override
    public double calcularArea(){
        //AREA DO QUADRADO  = lado * lado
        return this.lado * this.lado;
    }
    @Override
    public String toString(){
        return "Quadrado  (Lado:  "  + this.lado  +  ") ";
    }    
}
