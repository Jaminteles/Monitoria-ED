;;Questão 1 — Pilha e fila combinadas (UNICENTRO 2026, adaptada)
Traçar o resultado de empilha(10); empilha(20); insere(desempilha()); empilha(30); insere(40); v = remove(); empilha(v); e dizer o conteúdo final da pilha e da fila. → D: Pilhda [10, 30, 20]; Fila [40]

;;Questão 2 — Fila estática circular (Consulplan 2025, adaptada)
Qual a finalidade da expressão fim = (fim + 1) % elementos.length;. → D: faz o índice dar a volta e reaproveitar as posições liberadas

;;Questão 3 — Deque circular (autoral)
Deque de capacidade 5, executar insereFim('A'); insereFim('B'); insereInicio('C'); insereFim('D'); removeFim(); insereInicio('E'); e informar o conteúdo lógico e o valor de inicio. → A: [E, C, A, B] e inicio = 3

;;Questão 4 — Complexidade (CIAAR 2026, adaptada)
Assinalar a afirmativa correta sobre custos em pilha, fila circular, deque e lista circular. → C: acesso por índice na lista circular é O(1)

Codificação (15 min cada)

;;Questão 5 — Lista Estática Circular
void apagaAlunosPorCurso(String curso) — remove todos os alunos do curso informado. Foco: o bug do laço crescente que pula elementos após a remoção.

Questão 6 — Deque Estático Circular
void apagaProdutosPorCategoria(String categoria) — remove todos os produtos da categoria preservando a ordem. Foco: o padrão de rotação (sem obter(i)) e capturar o número de voltas antes do laço.

Questão 7 - Implemente em Java um método “String decToBin(String data)” que retorne a 
representação Binária de números Decimais, utilizando a estrutura de dados do tipo Pilha 
Estática. Considere que todos os métodos da pilha estática estejam disponíveis para uso.

    10 / 2 = 5 resto 0 --- primeiro
    5  / 2 = 2 resto 1 --- segundo 
    2  / 2 = 1 resto 0 --- terceiro
    1  / 2 = 0 resto 1 --- ultimo bit gerado 
    1010

Questão 8 - (2023 FADE-UFPE) Considere a implementação de uma fila (FIFO) de forma estática 
(array) com indexação circular, iniciando em 0 e finalizando no índice N-1, onde N é o 
tamanho do array. Seja Ins o índice da posição livre na qual a próxima inserção na fila deve 
ocorrer; seja Prim o índice do elemento mais antigo a permanecer na fila; e seja (A MOD B) 
o resto da divisão inteira de A por B. Com base nesses dados, analise as afirmações a 
seguir. 
a) Para inserção, caso a fila não esteja cheia, atribuímos o elemento ao array na posição 
Ins e, em seguida, atribuímos a Ins o valor de (Ins MOD N)+1. 
b) Para deleção, caso a fila não esteja vazia, atribuímos a Prim o valor de ((Prim+1) MOD 
N). 
c) Se Prim=Ins, podemos concluir que a fila está vazia. 
d) Se Prim=((Ins+1) MOD N), podemos concluir que a fila está cheia. 
Quais as afirmativas estão corretas? Justifique sua resposta. 