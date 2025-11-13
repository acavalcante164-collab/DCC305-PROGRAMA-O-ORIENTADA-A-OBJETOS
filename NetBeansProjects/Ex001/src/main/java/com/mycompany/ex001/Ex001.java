/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex001;

/**
 *
 * @author alons
 */
public class Ex001 {

    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        
        caneta1.status();
        
        caneta1.cor  = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.modelo = "BIC";
        
        caneta1.destampar();
        caneta1.carga = 100;        
        caneta1.rabiscar();
    }
}
