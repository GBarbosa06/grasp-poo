package model;
// Essa classe representa um produto, ou seja algo que pode ser vendido ou adicionado à um pedido.
public class Produto {
    private String nome;
    private double preco;
    // Quando criamos um novo produto, já informamos o nome e o preço
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    // Retorna o nome do produto
    public String getNome() {
        return nome;
    }
    // Retorna o preço do produto
    public double getPreco() {
        return preco;
    }
}
