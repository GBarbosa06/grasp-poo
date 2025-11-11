package controller;

import model.Pedido;
import model.Produto;

public class PedidoController {
    private Pedido pedidoAtual;

    public void criarPedido() {
        pedidoAtual = new Pedido();
        System.out.println("Novo pedido criado!");
    }

    public void adicionarItem(Produto produto, int quantidade) {
        if (pedidoAtual != null) {
            pedidoAtual.adicionarItem(produto, quantidade);
            System.out.println("Item adicionado: " + produto.getNome());
        }
    }

    public void finalizarPedido() {
        if (pedidoAtual != null) {
            pedidoAtual.exibirResumo();
        }
    }
}
