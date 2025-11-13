/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_02_polimorfismo;

/**
 *
 * @author alons
 */
public class CalculadoraSimples {
    //METODO1: SOMA DOIS INTEIROS
    public int somar(int a, int b){
        System.out.println("->(Somando 2 inteiros)");
        return a + b;
    }
    
    //METODO2: SOMA DOIS DOUBLES(SOBRECARGA)
    public double somar(double a, double b){
        System.out.println("->(Somando 2 doubles)");
        return a + b;
    }
    
    //METODO3: SOMA ARRAYS DE INTEIROS
    public int somar(int [ ] numeros ){
        System.out.println("->(Somando 1 array de inteiros)");
        
        //  Cria uma variavel para guardar
        int somaTotal = 0;
        
        // Percorre o array
        for (int numero : numeros){
            somaTotal = somaTotal + numero;
        }
        return somaTotal;    
    }
}
