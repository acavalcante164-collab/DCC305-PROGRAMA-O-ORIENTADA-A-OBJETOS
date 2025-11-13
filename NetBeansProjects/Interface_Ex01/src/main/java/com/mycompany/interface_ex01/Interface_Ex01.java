/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interface_ex01;

/**
 *
 * @author alons
 */
public class Interface_Ex01 {

    public static void main(String[] args) {
        
        Televisao Tv1 = new Televisao ("Samsung", "001mc");
        Radio Rad1 = new Radio ("RD", "002jv");
        
        
        Tv1.ligar();
        Tv1.desligar();
        
        System.out.println("\n");
        
        Rad1.ligar();
        Rad1.desligar();
    }
}
