/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema;

/**
 *
 * @author alons
 */
public class Sistema {

    public static void main(String[] args) {
        SistemaDeLog log = new SistemaDeLog();

 Usuario u = new Usuario( "ana@ufrr.br", "Ana Silva" );

 Produto p = new Produto( 123, "Notebook", 2500.00);

 // Polimorfismo em ação!
 log.salvarLog(u); // OK!
 log.salvarLog(p); // OK!

 // Ambos são ILogavel!
 }
}
