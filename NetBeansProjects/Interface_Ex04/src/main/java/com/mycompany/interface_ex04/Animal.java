/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interface_ex04;

/**
 *
 * @author alons
 */
public abstract class Animal {    
    
    //METODOS CONCRETO (HERDADO POR TODOS)
    public void respirar(){
        System.out.println("O ANimal Estah respirando ....");
    }
    //ABSTRACT QUE SERA IMPOSTO EM TODAS AS CLASSES QUE CHAMAREM 
    public abstract void fazerSom();
    
   
    
}
