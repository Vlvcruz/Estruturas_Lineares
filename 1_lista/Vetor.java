public class Vetor {
    private String[] nomes;
    private int tamanho;

    public Vetor(int capacidade) {
        nomes = new String[capacidade];
        tamanho = 0;
    }

    public boolean adicionar(String nome) {
        if (tamanho < nomes.length) {
            nomes[tamanho] = nome;
            tamanho++;
            return true;
        }
        return false;
    }

    public boolean excluir(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (nomes[i].equals(nome)) {
                for (int j = i; j < tamanho - 1; j++) {
                    nomes[j] = nomes[j + 1];
                }
                nomes[tamanho - 1] = null;
                tamanho--;
                return true;
            }
        }
        return false;
    }

    public void exibir() {
        System.out.println("Lista:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(nomes[i]);
        }
    }

    public int getQuantidade() {
        return tamanho;
    }
}
