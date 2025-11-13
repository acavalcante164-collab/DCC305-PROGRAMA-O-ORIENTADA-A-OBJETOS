/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_02_polimorfismo;

/**
 *
 * @author alons
 */
public class Ex_02_Polimorfismo {

    public static void main(String[] args) {
        CalculadoraSimples calc = new CalculadoraSimples();
        
        System.out.println("--- Testes de Sobrecarga da Calculadora ---");

        // --- Teste 1: somar(int, int) ---
        // O Java vê (10, 20) e sabe que deve chamar o método com (int, int)
        int res1 = calc.somar(10, 20);
        System.out.println("Resultado (int): " + res1);
        
        System.out.println("-------------------------------------");

        // --- Teste 2: somar(double, double) ---
        // O Java vê (7.5, 2.5) e sabe que deve chamar o (double, double)
        double res2 = calc.somar(7.5, 2.5);
        System.out.println("Resultado (double): " + res2);
        
        System.out.println("-------------------------------------");

        // --- Teste 3: somar(int[]) ---
        // Primeiro, criamos o array que queremos somar
        int[] meuArray = {100, 50, 25};
        
        // O Java vê (meuArray) e sabe que deve chamar o (int[])
        int res3 = calc.somar(meuArray);
        System.out.println("Resultado (array): " + res3);
    }
}
