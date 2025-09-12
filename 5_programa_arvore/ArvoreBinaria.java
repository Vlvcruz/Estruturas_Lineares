public class ArvoreBinaria {
    Nodo raiz;
    public ArvoreBinaria() {
        raiz = null;
    }
    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }
    private Nodo inserirRec(Nodo no, int valor) {
        if (no == null) return new Nodo(valor);
        if (valor < no.valor) no.esquerda = inserirRec(no.esquerda, valor);
        else if (valor > no.valor) no.direita = inserirRec(no.direita, valor);
        return no;
    }
    public void emOrdem(Nodo no) {
        if (no != null) {
            emOrdem(no.esquerda);
            System.out.print(no.valor + " ");
            emOrdem(no.direita);
        }
    }
    public void preOrdem(Nodo no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            preOrdem(no.esquerda);
            preOrdem(no.direita);
        }
    }
    public void posOrdem(Nodo no) {
        if (no != null) {
            posOrdem(no.esquerda);
            posOrdem(no.direita);
            System.out.print(no.valor + " ");
        }
    }
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        int[] valores = {25, 16, 17, 13, 30, 27, 36, 40, 43}; //aqui colocamos a sequencia, utilizamos da atividade anterior
        for (int v : valores) {
            arvore.inserir(v);
        }
        System.out.print("Em ordem: ");
        arvore.emOrdem(arvore.raiz);
        System.out.println();
        System.out.print("Pré ordem: ");
        arvore.preOrdem(arvore.raiz);
        System.out.println();
        System.out.print("Pós ordem: ");
        arvore.posOrdem(arvore.raiz);
        System.out.println();
    }
}