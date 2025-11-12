package controller;

import model.Pedido;
import model.Produto;
// Classe responsável por controlar as operações relacionadas à um pedido
public class PedidoController {
    private Pedido pedidoAtual;
    // Cria um novo pedido
    public void criarPedido() {
        pedidoAtual = new Pedido();
        System.out.println("Novo pedido criado!");
    }
    // Adiciona um produto ao pedido atual
    public void adicionarItem(Produto produto, int quantidade) {
        if (pedidoAtual != null) { 
            pedidoAtual.adicionarItem(produto, quantidade); 
            System.out.println("Item adicionado: " + produto.getNome()); 
        }
    }
    // Mostra um resumo final do pedido
    public void finalizarPedido() {
        if (pedidoAtual != null) {
            pedidoAtual.exibirResumo();
        }
    }
}
