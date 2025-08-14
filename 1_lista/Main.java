public class Main {
    public static void main(String[] args) {
        
        Vetor lista = new Vetor(5);

        lista.adicionar("João");
        lista.adicionar("Maria");
        lista.adicionar("Ana");

        lista.exibir();

        lista.excluir("Maria");

        System.out.println();

        lista.exibir();

        System.out.println();

        System.out.println("Quantidade: " + lista.getQuantidade());
    }
}
