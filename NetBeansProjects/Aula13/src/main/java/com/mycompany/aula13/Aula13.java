/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula13;

/**
 *
 * @author alons
 */
public class Aula13 {

    public static void main(String[] args) {
        Departamento DLET = new Departamento("Letras", "DLET"); //criando um novo departamento
        Universidade ufrr = new Universidade("UFRR");
        ufrr.adicionarDepartamento("Ciência da Computação", "DCOMP");
        ufrr.adicionarDepartamento("Engenharia Elétrica", "DEE");
        ufrr.adicionarDepartamento("Medicina", "DMED");

    }
}
