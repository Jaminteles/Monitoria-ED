public class Questão6 {

    public void apagaProdutosPorCategoria(String categoria) {

        if(categoria == null) return;

        int voltas = filaProdutos.tamanho();

        for (int i = 0; i < voltas; i++) {
            
            Produto p = (Produto) filaProdutos.desenfileirar();
            
            if (!categoria.equals(p.getCategoria())) {
                filaProdutos.enfileirar(p);
            }
        }
    }
}