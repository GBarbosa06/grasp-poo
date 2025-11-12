package model;
//Essa classe representa um item dentro de um pedido
public class ItemPedido {
    private Produto produto;
    private int quantidade;
    // Quando criamos um ItemPedido, informamos o produto e a quantidade
    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    // Calcula o valor total desse item
    public double getSubtotal() {
        return produto.getPreco() * quantidade;
    }
    // Retorna uma string com as informações do item, usada pra mostrar no resumo do pedido
    public String toString() {
        return produto.getNome() + " x" + quantidade + " = R$" + getSubtotal();
    }
}
