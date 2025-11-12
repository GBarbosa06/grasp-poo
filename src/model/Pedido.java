package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();
    // Adiciona um novo produto ao pedido
    public void adicionarItem(Produto produto, int quantidade) {
        ItemPedido item = new ItemPedido(produto, quantidade);
        itens.add(item);
    }
    // Soma todos os itens pra calcular o total do pedido
    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }
    // Mostra o resumo do pedido no console
    public void exibirResumo() {
        System.out.println("\nResumo do Pedido:");
        for (ItemPedido item : itens) {
            System.out.println(item);
        }
        System.out.println("Total: R$" + calcularTotal());
    }
}
