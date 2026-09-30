# Lista Duplamente Encadeada Genérica

Projeto desenvolvido em **Java** para implementação e estudo de uma **Lista Duplamente Encadeada Genérica**, utilizando conceitos da disciplina de **Algoritmos e Estruturas de Dados**.

## 📚 Sobre o projeto

O projeto implementa uma lista duplamente encadeada capaz de armazenar diferentes tipos de dados utilizando **Generics (`<T>`)**.

Cada elemento da lista é representado por um nó (`No<T>`), que possui referências para:

* o dado armazenado;
* o nó anterior;
* o próximo nó.

A estrutura permite percorrer a lista nos dois sentidos, além de realizar operações de inserção, remoção, busca e atualização.

## 🛠️ Tecnologias utilizadas

* Java
* IntelliJ IDEA
* Git e GitHub

## 📂 Estrutura do projeto

```text
src/
├── Main.java
├── No.java
└── ListaDupla.java
```

### `No.java`

Representa cada elemento da lista.

```java
public class No<T> {
    T dado;
    No<T> anterior;
    No<T> proximo;
}
```

### `ListaDupla.java`

Contém a implementação da lista e suas principais operações.

### `Main.java`

Utilizado para realizar os testes das funcionalidades da lista.

## ⚙️ Funcionalidades

### Inserção

* `adicionarNoInicio()` — adiciona um elemento no início da lista.
* `adicionarNoFim()` — adiciona um elemento no final da lista.
* `adicionarNaPosicao()` — adiciona um elemento em uma posição específica.

### Remoção

* `removerNoInicio()` — remove o primeiro elemento.
* `removerNoFim()` — remove o último elemento.
* `removerDaPosicao()` — remove um elemento de uma posição específica.
* `removerPorValor()` — remove um elemento procurando pelo seu valor.

### Busca

* `buscarValor()` — procura um valor dentro da lista.
* `buscarPosicao()` — busca o valor armazenado em uma determinada posição.

### Atualização

* `atualizar()` — altera o valor armazenado em uma posição.

### Controle da lista

* `tamanho()` — retorna a quantidade de elementos.
* `estaVazia()`
