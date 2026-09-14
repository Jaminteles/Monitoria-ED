Operação    /    Pilha    / Fila
empilha(10)      [10]          [0]
empilha(20)    [10, 20]        [0]
insere(desempilha())  [10]     [20]
empilha(30)           [10, 30]        [20]
insere(40)            [10, 30]        [20, 40]
v = remove() -> v=20  [10, 30]        [40]
empilha(v)            [10, 30, 20]    [40]
desempilha(20)        [10, 30]        [40]