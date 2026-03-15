public class QuestaoObjetiva04 {

    public static void main(String[] args) {

        Pilha pilha = new Pilha(10);

        pilha.empilha("1");
        pilha.empilha("2");
        pilha.empilha("3");
        pilha.empilha("4");

        System.out.print("Ordem removida: ");
        while (!pilha.estaVazia()) {
            System.out.print(pilha.desempilha() + " ");
        }

        System.out.println("\nResposta correta: b) 4,3,2,1");
    }
}