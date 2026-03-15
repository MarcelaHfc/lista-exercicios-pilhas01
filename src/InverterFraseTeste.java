public class InverterFraseTeste {

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

    public static void main(String[] args) {

        String frase = "eu gosto de java";

        String resultado = inverterOrdemPalavras(frase);

        System.out.println("Frase original: " + frase);

        System.out.println("Frase invertida: " + resultado);
    }
}