public class MainFila {
    public static void main(String[] args) {
        // Teste da Fila
        Fila fila = new Fila(5);
        fila.adicionar("A");
        fila.adicionar("B");
        fila.adicionar("C");
        fila.exibir();
        fila.remover(); 
    }
 }