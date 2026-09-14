Operação        /    inicio    /    tamanho    / vetor (0-4) / Lógico
inicial                0              0            -----       [x,x,x,x,x]
insereFim('A')         0              1            A----       [x,x,x,x,A]
insereFim('B')         0              2            AB---       [x,x,x, A, B]
insereInicio('C')      4              3            AB--C       [C, x,x, A, B]
insereFim('D')         4              4            ABD-C       [C, x, A, B, D]
removeFim()            4              3            AB--C       [C, x, A, B, x] 
insereInicio('E')      3              4            AB-EC       [E, C, x, A, B] 

imprimir()  = [E, C, x, A, B]








0 + x % 5 = 4

insereFim('A'); insereFim('B'); insereInicio('C'); insereFim('D'); removeFim(); insereInicio('E');