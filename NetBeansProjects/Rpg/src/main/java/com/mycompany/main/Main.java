/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

public class Main{
    public static void main(String[] args){
        Personagem player1 = new Personagem("Malenia", 150, 80, "P001");
    
        player1.status();
        player1.levarDano(30);
        player1.curar(20);
        player1.usarMana(15);
        player1.meditar(10);
        
        player1.status();
    }    
}
