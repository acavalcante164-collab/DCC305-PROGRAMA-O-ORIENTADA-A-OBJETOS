/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interface_ex03;

/**
 *
 * @author alons
 */
public class Interface_Ex03 {

    public static void main(String[] args) {
        //CRIANDO INSTACIA COMPUTADOS
        Computador meuComputador = new Computador();
        
        //CRIANDO INSTACIA DOS DISPOSITIVOS
        Mouse mouseGamer = new Mouse();
        Teclado tecladoMecanico = new Teclado();
        PenDrive sandisk = new PenDrive();
        
        /*
        CONECTANDO CADA DISPOSITIVO
        O METODO ACEITA TODOS OS DISPOSITIVOS QUE SEJA COMPATIVEL AO CONTRATO
        */
        meuComputador.conectarDispositivo(mouseGamer);
        meuComputador.conectarDispositivo(tecladoMecanico);
        meuComputador.conectarDispositivo(sandisk);
    }
}
