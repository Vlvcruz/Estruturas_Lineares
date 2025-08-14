public class Pilha {
    private String[] dados;
    private int topo;
    public Pilha(int capacidade) {
        dados = new String[capacidade];
        topo = 0;
    }
    // entra no topo da pilha !
    public boolean adicionar(String item) {
        if (topo == dados.length) {
            return false; // veridico, fila completa
        }
        dados[topo] = item;
        topo++;
        return true;
    }
    
    public void remover() {
        System.out.println("Removendo todos da pilha (LIFO):");
        while (topo > 0) {
            topo--;
            String item = dados[topo];
            System.out.println("Removido: " + item);
            exibir();
            try {
                Thread.sleep(1000); // comando de pausa para melhor visualização
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Pilha está vazia!\n");
    }
    // exibe a pilha
    public void exibir() {
        System.out.println("Pilha:");
        for (int i = topo - 1; i >= 0; i--) {
            System.out.println(dados[i]);
        }
        System.out.println();
    }
 }