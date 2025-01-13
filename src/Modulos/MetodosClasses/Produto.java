package Modulos.MetodosClasses;

public class Produto {

    String nomeProdulo;
    double precoProduto;
    static double descontoProduto = 0.25;

    Produto(String nomeInicial) {
        nomeProdulo = nomeInicial;
    }

    Produto(String nomeInicial, double precoInicial) {
        nomeProdulo = nomeInicial;
        precoProduto = precoInicial;
    }

    Produto() {

    }

    double precoComDesconto() {
        return precoProduto * (1 - descontoProduto);
    }
}
