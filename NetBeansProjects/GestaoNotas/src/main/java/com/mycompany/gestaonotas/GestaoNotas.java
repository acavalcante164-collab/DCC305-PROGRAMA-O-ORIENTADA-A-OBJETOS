/*

DCC305 - PROGRAMACAO ORIENTADA A OBJETOS I - T01 (2025.2)
NOME: ALONSO FERNANDES CAVALANTE
MATRICULA: 2024005534

TRABALHO 02 - EXERCICIO DA AULA 08  02/10/2025 A 09/10/2025
*/

/*

DESCRIÇÃO:

SLIDE 05 - Opcao 2: Sistema de Gestao de Notas e Alunos

Este projeto exige a prática de cálculos e a aplicação de lógica condicional dentro dos métodos do objeto.

Classe: Aluno, GestaoNotas;

Atributos Principais (Encapsulados): matricula, nome, nota1, nota2,
notaTrabalho

*/

package com.mycompany.gestaonotas;

/**
 *
 * @author alons
 */
public class GestaoNotas {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maria", "1111001100", 7.0f, 8.0f, 6.0f);
        Aluno aluno2 = new Aluno ("Joao", "0001001011", 3.0f, 5.0f, 0.0f);
        Aluno aluno10 = new Aluno ("Alonso", "0000110011", 10.0f, 10.0f, 10.0f);
        
    aluno1.status();
    aluno1.getStatus();
    
    System.out.println("\n\n");
    
    aluno2.status();
    aluno2.getStatus();
    
    System.out.println("\n\n");
    
    aluno10.status();
    aluno10.getStatus();  
    
    }
}
