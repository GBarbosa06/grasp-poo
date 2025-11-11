package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(Produto produto, int quantidade) {
        ItemPedido item = new ItemPedido(produto, quantidade);
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void exibirResumo() {
        System.out.println("\nResumo do Pedido:");
        for (ItemPedido item : itens) {
            System.out.println(item);
        }
        System.out.println("Total: R$" + calcularTotal());
    }
}