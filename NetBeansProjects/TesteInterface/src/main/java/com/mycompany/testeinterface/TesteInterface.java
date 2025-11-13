/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testeinterface;

/**
 *
 * @author alons
 */
public class TesteInterface {

    public static void main(String[] args) {
        
        // Variável declarada como "pessoa1"
        Humano pessoa1 = new Humano("Fer", 12);
        
        // Deve ser chamada como "pessoa1"
        pessoa1.andar(); 
        pessoa1.correr(); // Você também pode testar este método
    }
}
