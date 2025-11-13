/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeinterface;

/**
 *
 * @author alons
 */
// Não é "class", é "interface"
public interface IAndador {

 // Não precisamos escrever "public abstract"
 // TODO MÉTODO AQUI É PUBLIC ABSTRACT POR PADRÃO!
 void andar();
 void correr();

 // Não podemos ter atributos de instância!
 // private int velocidade; // ERRO DE COMPILAÇÃO!

 // Atributos são "public static final" (Constantes)
 int NUMERO_DE_PERNAS_PADRAO = 2;
}

