import controller.PedidoController;
import model.Produto;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PedidoController controller = new PedidoController();
        // Menu inicial
        System.out.println("=== SISTEMA DE PEDIDOS ===");
        System.out.println("1 - Criar pedido manualmente");
        System.out.println("2 - Executar teste automático");
        System.out.print("Escolha uma opção: ");

        int opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                 // Opção de criar um pedido manualmente
                controller.criarPedido();

                while (true) {
                    // Pede o nome do produto
                    System.out.print("\nDigite o nome do produto (ou 'sair' para finalizar): ");
                    String nome = sc.nextLine();
                     // Se o usuário digitar "sair", o loop é encerrado
                    if (nome.equalsIgnoreCase("sair")) break;
                     // Pede o preço e a quantidade do produto
                    System.out.print("Preço do produto: ");
                    double preco = sc.nextDouble();

                    System.out.print("Quantidade: ");
                    int qtd = sc.nextInt();
                    sc.nextLine();
                    // Cria um novo produto com as informações digitadas
                    Produto produto = new Produto(nome, preco);
                    controller.adicionarItem(produto, qtd);
                }
                // Mostra o resumo final do pedido
                controller.finalizarPedido();
                break;
            // Opção de teste automático
            case 2:
                Produto p1 = new Produto("Mouse", 80.0);
                Produto p2 = new Produto("Teclado", 120.0);

                controller.criarPedido();
                controller.adicionarItem(p1, 2);
                controller.adicionarItem(p2, 1);
                controller.finalizarPedido();
                break;

            default:
                // Caso o usuário digite uma opção inválida
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
