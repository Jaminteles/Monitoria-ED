Questão 8 - (2023 FADE-UFPE) Considere a implementação de uma fila (FIFO) de forma estática 
(array) com indexação circular, iniciando em 0 e finalizando no índice N-1, onde N é o 
tamanho do array. Seja Ins o índice da posição livre na qual a próxima inserção na fila deve 
ocorrer; seja Prim o índice do elemento mais antigo a permanecer na fila; e seja (A MOD B) 
o resto da divisão inteira de A por B. Com base nesses dados, analise as afirmações a 
seguir. 
a) Para inserção, caso a fila não esteja cheia, atribuímos o elemento ao array na posição 
Ins e, em seguida, atribuímos a Ins o valor de (Ins MOD N)+1. *INCORRETA*
       N = 5, Ins = 4
        *(4 MOD 5) + 1 = 4 + 1 = 5
        (4 + 1) MOD 5 = 5 MOD 5 = 0 
b) Para deleção, caso a fila não esteja vazia, atribuímos a Prim o valor de ((Prim+1) MOD 
N). *CORRETA*
    ((4 + 1) MOD 5) = 5 MOD 5 = 0
c) Se Prim=Ins, podemos concluir que a fila está vazia.  *INCORRETA*
    Prim = 0
    Ins = 0
    1, 2, 3, 4, 5
    
d) Se Prim=((Ins+1) MOD N), podemos concluir que a fila está cheia. *INCORRETA*

    Prim == ((Ins+1) MOD N) significa fila cheia.

    Porque a fórmula em si é famosa e quase todo mundo marca essa. A fórmula clássica de fila cheia é (Ins + 1) MOD N == Prim.

    Mas essa fórmula só vale numa implementação que sacrifica uma posição de propósito, justamente para desfazer a ambiguidade da letra C. Nessa implementação você nunca usa o array inteiro, a capacidade real é N menos 1.

    O enunciado não diz que uma posição é sacrificada. Ele diz que o array vai de 0 a N-1 e que Ins é a próxima posição livre. Sem essa condição declarada, a condição da letra D na verdade indica que resta exatamente uma posição livre, não que está cheia."

    [Desenhar rapidamente: array de 5, quatro elementos, Prim em 0, Ins em 4]

    posição:  0    1    2    3    4
            A    B    C    D    _
            ↑                   ↑
            Prim                 Ins

    (Ins+1) MOD 5 = (4+1) MOD 5 = 0 = Prim   → a letra D diz "cheia"
    Mas a posição 4 está LIVRE. Cabe mais um.