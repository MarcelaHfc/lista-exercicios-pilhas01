public class PilhaTeste02 {

    public static void main(String[] args) {

        Pilha pilha = new Pilha(10);

        pilha.empilha("A");
        pilha.empilha("B");
        pilha.empilha("C");

        System.out.println(pilha);
    }
}
