public class No {
    String valor;    // Guarda a informação (por exemplo, "Ana")
    No proximo;      // “Aponta” para o próximo nó

    public No(String valor) {
        this.valor = valor;
        this.proximo = null;
    }
}