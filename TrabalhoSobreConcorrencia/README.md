# DCC305 - PROGRAMAÇÃO ORIENTADA A OBJETOS
## Trabalho Prático: O Desafio da Concorrência na AMATUR

- **Parte I: O Caos (Race Condition)**

**Captura de Tela da saída do console no NetBeans:**

![Imagem](CenarioCaotico-RaceCondition/RaceCondition.png)

**Legenda:**  
  _O resultado acima foi montado no NetBeans e utiliza a lógica errada das Threads onde ocorre uma Condição de Corrida (Race Condition) quando a saída de um programa depende da ordem ou do timing não controlados em que múltiplas threads acessam e modificam dados compartilhados._

- **Parte II: A Solução com Blocos Sincronizados (Mutex)**

No Slide 36 (Aula 21)  explica como proteger somente a seção critica, onde podemos sincronizar apenas a porção específica de código que realmente precisa de exclusão mútua, usando um objeto explícito como lock ( synchronized (this)) ...

**Captura de Tela do Algoritmo SEM as Implementações proposta:**

![Imagem](Imagens/SemSynchronized.png)

**Legenda:** 
_O perigo está entre o if e o assentosDisponiveis-- - a seção crítica desprotegida!_

**A solução: Synchronized**

Para usar um bloco sincronizado explícito protegendo apenas o necessário, deve envolver a verificação e a ação. O objeto de lock mais comum é o próprio this (a instância do ônibus) ou um objeto criado apenas para ser cadeado.

**Captura de Tela do Algoritmo COM as Implementações corretas no Bloco:**

![Imagem](Imagens/SynchronizedSomenteNoBlocoCritico.png)

**Legenda:** 
_Isso melhora a performance pois não prende as outras threads. O synchronized resolve a inconsistência garantindo duas coisas:

Exclusão Mútua: Apenas uma thread escreve na variável por vez.

Visibilidade de Memória: Quando o Agente A solta a chave, o Java garante que a alteração que ele fez na memória RAM (de 1 para 0) seja imediatamente visível para o Agente B. Sem isso, o Agente B poderia ler um valor "velho" do cache da CPU._



