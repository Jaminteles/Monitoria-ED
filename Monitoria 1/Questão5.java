public class Questão5 {

    for(int i = listaAlunos.tamanho() - 1; i >= 0; i--) {
        Aluno a = (Aluno) listaAlunos.get(i);

        if (curso.equals(a.getCurso())) listaAlunos.remover(i);
        
    }

}
