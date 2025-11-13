/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_01_polimorfirmo;

/**
 *
 * @author alons
 */
public class Circulo extends FiguraGeometrica {
    private double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    /**
     * Implementação (Sobrescrita) do método abstrato.
     * A fórmula aqui é diferente da do Quadrado.
     */
    @Override
    public double calcularArea(){
        //AREA DO CIRCULO
        return Math.PI * (this.raio * this.raio);
    }
    @Override
    public String toString( ){
        return "Circulo (Raio:  " + this.raio + ")";
    }
}
