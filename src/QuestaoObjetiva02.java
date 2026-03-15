public class QuestaoObjetiva02 {

    public static void main(String[] args) {

        Pilha pilha = new Pilha(10);

        pilha.empilha("A");
        pilha.empilha("B");
        pilha.empilha("C");
        pilha.desempilha(); // remove C
        pilha.empilha("D");

        System.out.println("Conteúdo final da pilha: " + pilha);
        System.out.println("Resposta correta: c) A,B,D");
    }
}