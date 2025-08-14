public class Fila {
    private String[] dados;
    private int inicio;
    private int fim;
    private int tamanho;
    public Fila(int capacidade) {
        dados = new String[capacidade];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }
    public boolean adicionar(String item) {
        if (tamanho == dados.length) {
            return false; // fila cheia conforme 'adicionar'
        }
        dados[fim] = item;
        fim = (fim + 1) % dados.length;
        tamanho++;
        return true;
    }
    // aqui vai remover todo mundo, um por 1 na sequencia da fila !!
    public void remover() {
        System.out.println("Removendo todos da fila (FIFO):");
        while (tamanho > 0) {
            String item = dados[inicio];
            inicio = (inicio + 1) % dados.length;
            tamanho--;
            System.out.println("Removido: " + item);
            exibir();
        }
        System.out.println("Fila está vazia!\n");
    }
    public void exibir() {
        System.out.println("Fila:");
        for (int i = 0, idx = inicio; i < tamanho; i++, idx = (idx + 1) % dados.length) {
            System.out.println(dados[idx]);
        }
        System.out.println();
    }
 }