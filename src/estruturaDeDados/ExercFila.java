package estruturaDeDados;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercFila {

	
	//Atividade ainda incompleta, fzd a primeira entrega dessa forma por conta do prazo, irei rever e arrumar o codigo
	public static void main(String[] args) {
		Queue<String> filaClientes = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int opcoes = 0;
		String nomeCliente, clienteRemovido;

		while (opcoes != 0) {
			System.out.println("Escolha as opçôes: ");
			System.out.println("\nDigite 1 para Adicionar um novo Cliente na fila");
			System.out.println("\nDigite 2 para Listar todos os Clientes na fila");
			System.out.println("\nDigite 3 para Chamar (retirar) uma pessoa da fila ");
			System.out.println("\nDigite 0 para Sair ");
			System.out.println("\nDigite sua opção");
			opcoes = leia.nextInt();

			switch (opcoes) {
			
			case 1:
				System.out.println("Digite o nome do cliente para ser adicionado a lista: ");
				nomeCliente = leia.nextLine();
				filaClientes.add(nomeCliente);
				System.out.println("Cliente adicionado!");
				break;
			
			case 2:
				if(filaClientes.isEmpty()) {
					System.out.println("A fila está vazia!");
				}else {
					System.out.println("Clientes na fila: "+filaClientes.size());
				}
				break;
			case 3:
				clienteRemovido = filaClientes.remove();
				System.out.println("Cliente "+clienteRemovido+"foi removido");
				break;
				
			case 0:
				System.out.println("Programa encerrado");
				break;
				
			default:
				System.out.println("Opção inválida!");
			
			}

		}

	}

}
