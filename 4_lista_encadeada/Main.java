public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.adicionar("A");            // [A]
        lista.adicionar("B");            // [A, B]
        lista.adicionar("C");            // [A, B, C]
        lista.exibir();

        lista.adicionarEmPosicao(1, "X"); // fica == [A, X, B, C]
        lista.exibir();

        System.out.println("Posição de B: " + lista.buscar("B")); // deve ser 2

        lista.removerPrimeiro();          // Remove A
        lista.exibir();

        lista.removerUltimo();            // Remove C
        lista.exibir();

        lista.removerEmPosicao(1);        // Remove B (só X sobra)
        lista.exibir();
    }
}
 