public class Pilha {

    private String[] elementos;
    private int tamanho;

    public Pilha(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public void empilha(String elemento) {
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    public String topo() {
        if (estaVazia()) {
            return null;
        }
        return this.elementos[this.tamanho - 1];
    }

    public String desempilha() {
        if (estaVazia()) {
            return null;
        }

        String elemento = this.elementos[this.tamanho - 1];
        this.tamanho--;
        return elemento;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i = 0; i < this.tamanho; i++) {

            s.append(this.elementos[i]);

            if (i < this.tamanho - 1) {
                s.append(", ");
            }
        }

        s.append("]");

        return s.toString();
    }
    public static String inverterPalavra(String palavra) {

        Pilha pilha = new Pilha(palavra.length());

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(String.valueOf(palavra.charAt(i)));
        }

        String palavraInvertida = "";

        while (!pilha.estaVazia()) {
            palavraInvertida += pilha.desempilha();
        }

        return palavraInvertida;
    }
    public static boolean verificarPalindromo(String palavra) {

        Pilha pilha = new Pilha(palavra.length());

        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(String.valueOf(palavra.charAt(i)));
        }

        String palavraInvertida = "";
        while (!pilha.estaVazia()) {
            palavraInvertida += pilha.desempilha();
        }

        return palavra.equals(palavraInvertida);
    }
    public static String inverterOrdemPalavras(String frase) {

        String[] palavras = frase.split(" ");

        Pilha pilha = new Pilha(palavras.length);

        for (String palavra : palavras) {
            pilha.empilha(palavra);
        }

        String fraseInvertida = "";
        while (!pilha.estaVazia()) {
            fraseInvertida += pilha.desempilha();

            if (!pilha.estaVazia()) {
                fraseInvertida += " ";
            }
        }
        return fraseInvertida;
    }

}
