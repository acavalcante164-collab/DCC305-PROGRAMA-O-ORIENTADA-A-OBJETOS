/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author alons
 */
public class Main {

    public static void main(String[] args) {
        // Criando um objeto Gerente
        Gerente gerente1 = new Gerente("Ana Silva", "123.456.789-00", 8000.0, 1234);
        Desenvolvedor dev1 = new Desenvolvedor("Ana Silva", "123.456.789-00", 8000.0, "Java");

        // Métodos herdados de Funcionario
        System.out.println("Nome: " + gerente1.getNome());
        System.out.println("CPF: " + gerente1.getCpf());
        System.out.println("Salario: R$ " + gerente1.getSalario());
        System.out.println("Bonificacao: R$ " + gerente1.getBonificacao());
        
        
        System.out.println("\n\n");
        // Métodos herdados de Funcionario
        System.out.println("Nome: " + dev1.getNome());
        System.out.println("CPF: " + dev1.getCpf());
        System.out.println("Salario: R$ " + dev1.getSalario());
        System.out.println("Bonificacao: R$ " + dev1.getBonificacao());

        // Método específico de Gerente
        gerente1.autentica(1234);
        gerente1.autentica(9999);
    }
 }

