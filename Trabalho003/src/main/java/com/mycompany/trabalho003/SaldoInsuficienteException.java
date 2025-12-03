/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho003;

/**
 *
 * @author alons
 */
// 0. Dê um nome semântico
// 1. Herde de uma exceção (ex: Exception)
// 2. A Exceção Personalizada (Checked - Obriga tratamento)
public class SaldoInsuficienteException extends Exception {
        // 3. Crie um construtor que passa a mensagem
        // para a classe pai (super).
        public SaldoInsuficienteException(String mensagem) {
                super(mensagem);
        }
}
