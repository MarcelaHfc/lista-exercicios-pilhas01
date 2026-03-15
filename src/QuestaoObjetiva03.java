public class QuestaoObjetiva03 {

    public static void main(String[] args) {

        Pilha pilha = new Pilha(10);

        pilha.empilha("A");
        pilha.empilha("B");
        pilha.empilha("C");
        pilha.empilha("D");

        pilha.desempilha(); // remove D
        pilha.desempilha(); // remove C
        pilha.empilha("E");

        System.out.println("Topo da pilha: " + pilha.topo());
        System.out.println("Resposta correta: d) E");
    }
}