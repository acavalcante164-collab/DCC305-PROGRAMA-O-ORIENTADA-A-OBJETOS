/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.piloto;

/**
 *
 * @author alons
 */
public class Aviao {
 private String modelo;

 public Aviao(String modelo) {
 this.modelo = modelo;
 }

 public void voar() {
 System.out.println(
 modelo + " esta voando!"
 );
 }
}
