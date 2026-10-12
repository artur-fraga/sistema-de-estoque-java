import java.util.Scanner;

public class Cadastro {
    private Scanner entrada;

    public Cadastro(Scanner entrada){
        this.entrada = entrada;

    }
        public Produto cadastrarProduto(int numero){
            System.out.print("Nome do " + numero + "º produto: ");
            String nome = entrada.nextLine();
            System.out.print("Preço do Produto: R$");
            double preco = entrada.nextDouble();
            System.out.print("Quantidade em estoque: ");
            int quantidade = entrada.nextInt();
            entrada.nextLine();

            return new Produto(nome, preco, quantidade);

        }

}
