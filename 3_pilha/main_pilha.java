public class main_pilha {
   public static void main(String[] args) {
       Pilha pilha = new Pilha(5);
       pilha.adicionar("1");
       pilha.adicionar("2");
       pilha.adicionar("3");
       pilha.exibir();
       pilha.remover();
   }
}