public class QuestaoObjetiva05 {

    public static void main(String[] args) {

        Pilha pilha = new Pilha(2);

        pilha.empilha("X");
        pilha.empilha("Y");

        System.out.println("Pilha cheia: " + pilha);

        try {
            pilha.empilha("Z");
            System.out.println("Elemento inserido");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Overflow: pilha cheia, não é possível empilhar");
        }

        System.out.println("Resposta correta: b) overflow");
    }
}