package Modulos.MetodosClasses;

public class ProdutoTeste {

    public static void main(String[] args) {
        // NomeClasse nomeVariavel = new NomeClasse()
        // Desse jeito se cria uma instancia de um novo objeto que possiu os elementos de uma classe!

        Produto produto1 = new Produto("Arroz", 38.99);
        //produto1.nomeProdulo = "Arroz";
        //produto1.precoProduto = 38.99;
        //produto1.descontoProduto = 0.10;

        Produto produto2 = new Produto();
        produto2.nomeProdulo = "XBox One";
        produto2.precoProduto = 2398.99;

        System.out.println(produto1.nomeProdulo + " " + produto1.precoComDesconto());
        System.out.println(produto2.nomeProdulo + " " + produto2.precoComDesconto());

        Produto.descontoProduto = 0.50;

        double precoFinal1 = produto1.precoComDesconto();
        double precoFinal2 = produto2.precoComDesconto();
        double mediaDoCarrinho = (precoFinal1 + precoFinal2) / 2;
        System.out.printf("Média do carrinho = R$%.2f\n", mediaDoCarrinho);
    }
}
