public class ListaDupla<T> {

    private No<T> inicio;
    private No<T> fim;
    private int tamanho = 0;

    public ListaDupla() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    // =========================
    // ADICIONAR NO FIM
    // =========================

    public void adicionarNoFim(T dado) {

        No<T> novoNo = new No<>(dado);

        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }

        tamanho++;
    }

    // =========================
    // ADICIONAR NO INÍCIO
    // =========================

    public void adicionarNoInicio(T dado) {

        No<T> novoNo = new No<>(dado);

        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }

        tamanho++;
    }

    // =========================
    // ADICIONAR NA POSIÇÃO
    // =========================

    public void adicionarNaPosicao(int posicao, T dado) {

        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException(
                    "Posição inválida: " + posicao
            );
        }

        if (posicao == 0) {
            adicionarNoInicio(dado);
            return;
        }

        if (posicao == tamanho) {
            adicionarNoFim(dado);
            return;
        }

        No<T> atual = inicio;

        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }

        No<T> novoNo = new No<>(dado);

        novoNo.anterior = atual.anterior;
        novoNo.proximo = atual;

        atual.anterior.proximo = novoNo;
        atual.anterior = novoNo;

        tamanho++;
    }

    // =========================
    // REMOVER DO INÍCIO
    // =========================

    public void removerDoInicio() {

        if (inicio == null) {
            return;
        }

        inicio = inicio.proximo;

        if (inicio != null) {
            inicio.anterior = null;
        } else {
            fim = null;
        }

        tamanho--;
    }

    // =========================
    // REMOVER DO FIM
    // =========================

    public void removerDoFim() {

        if (fim == null) {
            return;
        }

        fim = fim.anterior;

        if (fim != null) {
            fim.proximo = null;
        } else {
            inicio = null;
        }

        tamanho--;
    }

    // =========================
    // REMOVER DA POSIÇÃO
    // =========================

    public void removerDaPosicao(int posicao) {

        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException(
                    "Posição inválida: " + posicao
            );
        }

        if (posicao == 0) {
            removerDoInicio();
            return;
        }

        if (posicao == tamanho - 1) {
            removerDoFim();
            return;
        }

        No<T> atual = inicio;

        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }

        atual.anterior.proximo = atual.proximo;
        atual.proximo.anterior = atual.anterior;

        tamanho--;
    }

    // =========================
    // REMOVER POR VALOR
    // =========================

    public void removerPorValor(T dado) {

        No<T> atual = inicio;

        while (atual != null) {

            if (atual.dado.equals(dado)) {

                if (atual == inicio) {
                    removerDoInicio();

                } else if (atual == fim) {
                    removerDoFim();

                } else {
                    atual.anterior.proximo = atual.proximo;
                    atual.proximo.anterior = atual.anterior;

                    tamanho--;
                }

                return;
            }

            atual = atual.proximo;
        }
    }

    // =========================
    // BUSCAR VALOR
    // =========================

    public void buscarValor(T dado) {

        No<T> atual = inicio;

        while (atual != null) {

            if (atual.dado.equals(dado)) {
                System.out.println(
                        "Valor encontrado: " + atual.dado
                );
                return;
            }

            atual = atual.proximo;
        }

        System.out.println(
                "Valor não encontrado: " + dado
        );
    }

    // =========================
    // BUSCAR POSIÇÃO
    // =========================

    public void buscarPosicao(int posicao) {

        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException(
                    "Posição inválida: " + posicao
            );
        }

        No<T> atual = inicio;

        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }

        System.out.println(
                "Valor na posição " + posicao +
                        ": " + atual.dado
        );
    }

    // =========================
    // ATUALIZAR
    // =========================

    public void atualizar(int posicao, T novoDado) {

        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException(
                    "Posição inválida: " + posicao
            );
        }

        No<T> atual = inicio;

        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }

        atual.dado = novoDado;
    }

    // =========================
    // TAMANHO
    // =========================

    public int tamanho() {
        return tamanho;
    }

    // =========================
    // ESTÁ VAZIA
    // =========================

    public boolean estaVazia() {
        return tamanho == 0;
    }

    // =========================
    // LIMPAR
    // =========================

    public void limpar() {

        inicio = null;
        fim = null;
        tamanho = 0;
    }

    // =========================
    // IMPRIMIR LISTA
    // =========================

    public void imprimirLista() {

        No<T> atual = inicio;

        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }

        System.out.println();
    }
}