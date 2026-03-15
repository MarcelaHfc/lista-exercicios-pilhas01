public class PalindromoTeste {

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

    public static void main(String[] args) {

        String[] palavrasTeste = {"arara", "casa", "radar", "banana"};

        for (String p : palavrasTeste) {
            if (verificarPalindromo(p)) {
                System.out.println(p + " → É palíndromo");
            } else {
                System.out.println(p + " → Não é palíndromo");
            }
        }
    }
}