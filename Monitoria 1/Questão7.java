public class Questão7 {
    public static String decToBin(String data) {
        int n = Integer.parseInt(data);

        if (n == 0) return "0";

        Pilha p = new PilhaEstatica(32);

        while (n > 0) {
            p.empilhar(n % 2);
            n /= 2;
        }

        String bin = "";
        while (!p.estaVazia()) {
            bin = bin + p.desempilhar();;
        }
        return bin;
    }
}