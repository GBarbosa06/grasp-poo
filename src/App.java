import controller.PedidoController;
import model.Produto;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PedidoController controller = new PedidoController();

        System.out.println("=== SISTEMA DE PEDIDOS ===");
        System.out.println("1 - Criar pedido manualmente");
        System.out.println("2 - Executar teste automático");
        System.out.print("Escolha uma opção: ");

        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                controller.criarPedido();

                while (true) {
                    System.out.print("\nDigite o nome do produto (ou 'sair' para finalizar): ");
                    String nome = sc.nextLine();
                    if (nome.equalsIgnoreCase("sair")) break;

                    System.out.print("Preço do produto: ");
                    double preco = sc.nextDouble();

                    System.out.print("Quantidade: ");
                    int qtd = sc.nextInt();
                    sc.nextLine(); // limpar buffer

                    Produto produto = new Produto(nome, preco);
                    controller.adicionarItem(produto, qtd);
                }

                controller.finalizarPedido();
                break;

            case 2:
                Produto p1 = new Produto("Mouse", 80.0);
                Produto p2 = new Produto("Teclado", 120.0);

                controller.criarPedido();
                controller.adicionarItem(p1, 2);
                controller.adicionarItem(p2, 1);
                controller.finalizarPedido();
                break;

            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}