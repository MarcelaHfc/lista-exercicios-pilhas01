public class QuestaoObjetiva06 {

    public static void main(String[] args) {

        Pilha pilha = new Pilha(2);

        pilha.empilha("A");
        pilha.empilha("B");

        System.out.println("Pilha inicial: " + pilha);

        System.out.println("Pop 1: " + pilha.desempilha());
        System.out.println("Pop 2: " + pilha.desempilha());
        System.out.println("Pop 3: " + pilha.desempilha());

        System.out.println("Resposta correta: c) underflow");
    }
}