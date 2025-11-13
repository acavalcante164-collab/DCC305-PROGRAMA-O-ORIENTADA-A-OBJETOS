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
public class Aluno {
    //ATRIBUTOS
    private String nome;
    private String matricula;
    private float nota1;
    private float nota2;
    private float notaTrabalho;
    
    //CONSTRUTOR
    public Aluno(String nome, String matricula, float nota1, float nota2, float notaTrabalho){
        setNome(nome);
        setMatricula(matricula);
        setNota1(nota1);
        setNota2(nota2);
        setNotaTrabalho(notaTrabalho);        
    }
    //GETTER
    public String getNome       (){return nome;}
    public String getMatricula  (){return matricula;}
    public float getNota1       (){return nota1;}
    public float getNota2       (){return nota2;}
    public float getNotaTrabalho(){return notaTrabalho;}
    
    
    //SETTER
    public void setNome(String nome){
        if (nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("O nome do titular nao pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }
    public void setMatricula (String matricula){
        if (matricula == null || matricula.trim().isEmpty()){
            throw new IllegalArgumentException("A matricula nao pode ser nula ou vazia");
        }
        this.matricula = matricula;
    }
    
    public void setNota1(float nota1){
        if (nota1 >= 0 && nota1 <= 10 ){            
            this.nota1 = nota1;
        } else {
            throw new IllegalArgumentException("Nota tem que estar entre 0 <= nota <= 10");            
        }
    }    
    public void setNota2(float nota2){
        if (nota2 >= 0 && nota2 <= 10){
            this.nota2 = nota2;            
        } else {            
            throw new IllegalArgumentException("Nota tem que estar entre 0 <= nota <= 10");
        }
    }
    public void setNotaTrabalho(float notaTrabalho){
        if (notaTrabalho >= 0 && notaTrabalho <= 10){
           this.notaTrabalho = notaTrabalho; 
        } else {            
            throw new IllegalArgumentException("Valor tem que ser positivo");
        }
    }
    //METODOS
    public float getMedia(int peso1, int peso2, int peso3){        
        float Ponderada = (((nota1 * peso1) + (nota2 * peso2) + (notaTrabalho * peso3)) / (peso1 + peso2 + peso3));
        return Ponderada;
    }
    public void getStatus(){
        if (this.getMedia(4, 4, 2) < 6){
            System.out.println("STATUS = REPROVADO!");        
        }else{
            System.out.println("STATUS = APROVADO!");
        }        
    }
    
    void status(){        
        
        System.out.println("NOME: \t" + this.getNome());
        System.out.println("MATRICULA: \t" + this.getMatricula());
        System.out.println("NOTA1 = \t" + this.getNota1());
        System.out.println("NOTA2 = \t" + this.getNota2());
        System.out.println("NotaTrabalho = \t" + this.notaTrabalho);
        System.out.println("MEDIA POND. = \t" + this.getMedia(4, 4, 2));        
    }
    
    
    
}
