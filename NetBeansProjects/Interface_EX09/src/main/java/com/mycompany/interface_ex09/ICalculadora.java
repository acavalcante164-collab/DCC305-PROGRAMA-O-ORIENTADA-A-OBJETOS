/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interface_ex09;

/**
 *
 * @author alons
 */
public interface ICalculadora {
    int somar (int a, int b);
    
    default int subtrair (int a , int b){
        return a -b;
    }
}
