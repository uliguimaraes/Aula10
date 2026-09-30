public class Main {
    public static void main(String[] args) {

        ListaDupla<String> frutas = new ListaDupla<>();

        // 1. ADICIONAR NO FIM
        System.out.println("1 - Adicionando no fim:");
        frutas.adicionarNoFim("Banana");
        frutas.adicionarNoFim("Maçã");
        frutas.adicionarNoFim("Laranja");
        frutas.imprimirLista();

        // 2. ADICIONAR NO INÍCIO
        System.out.println("\n2 - Adicionando no início:");
        frutas.adicionarNoInicio("Uva");
        frutas.adicionarNoInicio("Abacaxi");
        frutas.imprimirLista();

        // 3. REMOVER POR VALOR
        System.out.println("\n3 - Removendo Maçã:");
        frutas.removerPorValor("Maçã");
        frutas.imprimirLista();

        // 4. ADICIONAR NA POSIÇÃO
        System.out.println("\n4 - Adicionando Manga na posição 2:");
        frutas.adicionarNaPosicao(2, "Manga");
        frutas.imprimirLista();

        // 5. REMOVER DA POSIÇÃO
        System.out.println("\n5 - Removendo posição 2:");
        frutas.removerDaPosicao(2);
        frutas.imprimirLista();

        // 6. BUSCAR VALOR
        System.out.println("\n6 - Buscando Laranja:");
        frutas.buscarValor("Laranja");

        // 7. BUSCAR POSIÇÃO
        System.out.println("\n7 - Buscando posição 1:");
        frutas.buscarPosicao(1);

        // 8. ATUALIZAR
        System.out.println("\n8 - Atualizando posição 1 para Pera:");
        frutas.atualizar(1, "Pera");
        frutas.imprimirLista();

        // 9. TAMANHO
        System.out.println("\n9 - Tamanho da lista:");
        System.out.println("Tamanho: " + frutas.tamanho());

        // 10. ESTÁ VAZIA
        System.out.println("\n10 - Verificando se está vazia:");
        System.out.println("Está vazia? " + frutas.estaVazia());

        // 11. REMOVER DO INÍCIO
        System.out.println("\n11 - Removendo do início:");
        frutas.removerDoFim();
        frutas.imprimirLista();

        // 12. REMOVER DO FIM
        System.out.println("\n12 - Removendo do fim:");
        frutas.removerDoFim();
        frutas.imprimirLista();

        // 13. LIMPAR
        System.out.println("\n13 - Limpando a lista:");
        frutas.limpar();

        System.out.println("Tamanho: " + frutas.tamanho());
        System.out.println("Está vazia? " + frutas.estaVazia());
        frutas.imprimirLista();
    }
}