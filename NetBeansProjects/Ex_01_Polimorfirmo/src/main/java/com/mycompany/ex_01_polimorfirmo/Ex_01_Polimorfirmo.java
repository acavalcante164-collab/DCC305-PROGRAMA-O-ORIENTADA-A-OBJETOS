/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex_01_polimorfirmo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alons
 */
public class Ex_01_Polimorfirmo {

    public static void main(String[] args) {
        /*
         * Cria uma lista (ArrayList) de FiguraGeometrica.
         */
        // A lista é do tipo genérico (abstrato)
        List <FiguraGeometrica> minhasFiguras = new ArrayList <> ();
        /*
         * Adicione nela um objeto Quadrado e um objeto Circulo.
         */
        // Adicionamos objetos específicos (concretos)
        minhasFiguras.add(new Quadrado(10.0));
        minhasFiguras.add(new Circulo(5.0));
        minhasFiguras.add(new Quadrado(2.5));
        
        System.out.println("Calculando areas das figura:");
        System.out.println("-------------------------");
        
        /*
         *  um loop  para percorrer a lista e imprimir a área
         */
        for (FiguraGeometrica fig : minhasFiguras) {
        
            double area = fig.calcularArea();
            
            System.out.println("Figura: " + fig.toString());
            
            System.out.printf("Area Calculada: %.2f \n\n", area);
        }
    }
}
