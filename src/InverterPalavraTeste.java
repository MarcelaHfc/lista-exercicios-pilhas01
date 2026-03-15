public class InverterPalavraTeste {

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

    public static void main(String[] args) {

        String palavra = "hello";

        String resultado = inverterPalavra(palavra);

        System.out.println(resultado);
    }
}