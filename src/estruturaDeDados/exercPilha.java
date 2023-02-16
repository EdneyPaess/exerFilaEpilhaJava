package estruturaDeDados;
import java.util.Scanner;
import java.util.Stack;

public class exercPilha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Stack<String> pilha = new Stack<String>();
        int opcao = -1;
        String novoLivro;
        
        while (opcao != 0) {
            System.out.println("MENU:");
            System.out.println("----1: Adicionar um novo livro na pilha.----");
            System.out.println("----2: Listar todos os livros da pilha.-----");
            System.out.println("----3: Retirar um livro da pilha.-----------");
            System.out.println("----0: Finalizar o programa.----------------");
            System.out.print("Digite a opção desejada: ");
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome do livro a ser adicionado: ");
                    novoLivro = entrada.next();
                    pilha.push(novoLivro);
                    System.out.println("\nLivro adicionado com sucesso!");
                    break;
                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("\nA pilha de livros está vazia.");
                    } else {
                        System.out.println("\nLivros na pilha: " + pilha);
                    }
                    break;
                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("\nA pilha de livros está vazia.");
                    } else {
                        String livroRetirado = pilha.pop();
                        System.out.println("\nLivro retirado da pilha: " + livroRetirado);
                    }
                    break;
                case 0:
                    System.out.println("\nFinalizando o programa.");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }
        }
    }
}