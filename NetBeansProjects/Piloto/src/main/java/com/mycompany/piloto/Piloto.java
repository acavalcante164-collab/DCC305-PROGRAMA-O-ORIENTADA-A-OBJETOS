/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.piloto;

/**
 *
 * @author alons
 */
public class Piloto {
 private String nome;
 private Aviao aviao;

 public Piloto(String nome) {
 this.nome = nome;
 }

 public void setAviao(Aviao a) {
 this.aviao = a;
 }

 // método pilotar() vem a seguir
 public void pilotar() {
 if (this.aviao != null) {
 System.out.println(
 nome + " esta pilotando..."
 );
 this.aviao.voar();
 } else {
 System.out.println(
 "Sem aviao para pilotar!"
 );
 }
}
 
public static void main(String[] args) {
 // Objetos criados separadamente
 Piloto maria = new Piloto("Maria");
 Aviao boeing = new Aviao("Boeing 747");

 // Conectando depois
 maria.setAviao(boeing);

 // Usando a associação
 maria.pilotar();

 // Output:
 // Maria está pilotando...
 // Boeing 747 está voando!
} 
}

