import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        double somaGeral = 0;

        System.out.println("==================");
        System.out.println("SISTEMA DE ESTOQUE");
        System.out.println("==================");

       
        System.out.print("Quantos produtos deseja cadastrar?");
        int qtdProdutos = entrada.nextInt();
        entrada.nextLine();

        for (int i = 1; i < qtdProdutos + 1; i++) {
            System.out.print("Nome do " + i + "º produto:");
            String nomeProduto = entrada.nextLine();
            System.out.print("Preço do produto: R$");
            double precoProduto = entrada.nextDouble();
            System.out.print("Quantidade em estoque:");
            int qtdEstoque = entrada.nextInt();
            entrada.nextLine();
            
            Produto p = new Produto(nomeProduto, precoProduto, qtdEstoque);
            produtos.add(p); 


            somaGeral += p.getPreco() * p.getQuantidade();

        }

        System.out.println(" ");
        System.out.println("----- PRODUTOS CADASTRADOS-----");
        for (Produto p : produtos){
            System.out.println(p);
        }

        System.out.printf("O valor total do estoque é: R$ %.2f%n", somaGeral);
        

        entrada.close();
        
    }
}
