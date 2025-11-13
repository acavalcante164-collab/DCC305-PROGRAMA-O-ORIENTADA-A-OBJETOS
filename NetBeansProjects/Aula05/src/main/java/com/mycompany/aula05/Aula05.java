/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula05;

/**
 *
 * @author alons
 */
public class Aula05 {

    public static void main(String[] args) {
        Pessoa alonso = new Pessoa("Alonso", 24, "alonso@.com");
        
        System.out.println(alonso.getNome() + " Cadastrado com sucesso!");
        alonso.calculoImc(80, 1.73);           
        }
}
