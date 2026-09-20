import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double somaGeral = 0;

        System.out.println("==================");
        System.out.println("SISTEMA DE ESTOQUE");
        System.out.println("==================");

       
        System.out.print("Quantos produtos deseja cadastrar?");
        int qtdProdutos = entrada.nextInt();

        for (int i = 1; i < qtdProdutos + 1; i++) {
            System.out.print("Nome do " + i + "º produto:");
            String nomeProduto = entrada.next();
            System.out.print("Preço do produto: R$");
            double precoProduto = entrada.nextDouble();
            System.out.print("Quantidade em estoque:");
            int qtdEstoque = entrada.nextInt();

            double somaProduto = precoProduto * qtdEstoque;

            somaGeral += somaProduto;

        }

        System.out.println("O valor total do estoque é: " + somaGeral);
        

        entrada.close();
        
    }
}
