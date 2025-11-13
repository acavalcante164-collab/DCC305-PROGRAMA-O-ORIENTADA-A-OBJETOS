/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interface_ex08;

/**
 *
 * @author alons
 */
public class Interface_Ex08 {

    public static void main(String[] args) {
        System.out.println("--- Testando Acesso as Constantes ---");

        // 1. Acessando o IP de Desenvolvimento
        System.out.println("Conectando em DEV: " + IBancoDeDados.IP_DEV);

        // 2. Acessando o IP de Produção
        System.out.println("IP de Producao: " + IBancoDeDados.IP_PRODUCAO);
        
        // 3. Acessando a Porta Padrão
        System.out.println("Usando a porta: " + IBancoDeDados.PORTA_PADRAO);

        // Exemplo de uso em uma frase
        System.out.println("\nSimulacao de conexao de desenvolvimento:");
        System.out.println("Iniciando conexao com " + IBancoDeDados.IP_DEV + ":" + IBancoDeDados.PORTA_PADRAO);
    }
}
