/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema;

/**
 *
 * @author alons
 */
public class SistemaDeLog {

 // Este método aceita QUALQUER
 // objeto que assine o contrato!
 public void salvarLog(ILogavel item) {
 String info = item.getInfoParaLog();

 // Salva no banco de dados
 // Envia para servidor
 // Grava em arquivo
 System.out.println("[LOG] " + info);
 }
}
