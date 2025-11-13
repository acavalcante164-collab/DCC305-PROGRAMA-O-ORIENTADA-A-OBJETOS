/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interface_ex09;

/**
 *
 * @author alons
 */
public class MinhaCalculadora implements ICalculadora {

    /**
     * 4. Implementando APENAS o método abstrato obrigatório.
     */
    @Override
    public int somar(int a, int b) {
        System.out.println("[Metodo 'somar' da MinhaCalculadora foi chamado]");
        return a + b;
    }
}
