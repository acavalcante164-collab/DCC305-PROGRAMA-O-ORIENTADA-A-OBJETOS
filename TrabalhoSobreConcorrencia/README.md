# DCC305 - PROGRAMAÇÃO ORIENTADA A OBJETOS
## Trabalho Prático: O Desafio da Concorrência na AMATUR

- **Parte I: O Caos (Race Condition)**

**Captura de Tela da saída do console no NetBeans:**

![Imagem](CenarioCaotico-RaceCondition/RaceCondition.png)

**Legenda:**  
  _O resultado acima foi montado no NetBeans e utiliza a lógica errada das Threads onde ocorre uma Condição de Corrida (Race Condition) quando a saída de um programa depende da ordem ou do timing não controlados em que múltiplas threads acessam e modificam dados compartilhados._

- **Parte II: A Solução com Blocos Sincronizados (Mutex)**

No Slide 36 (Aula 21)  explica como proteger somente a seção critic, onde podemos sincronizar apenas a porção específica de código que realmente precisa de exclusão mútua, usando um objeto explícito como lock ( synchronized (this)) ...

**Captura de Tela do Algoritmo SEM as Implementações proposta:**

![Imagem](Imagens/SemSynchronized.png)

**Legenda:** 
_O perigo está entre o if e o assentosDisponiveis-- - a seção crítica desprotegida!_



