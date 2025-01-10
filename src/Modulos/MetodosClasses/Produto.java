package Modulos.MetodosClasses;

public class Produto {

    String nomeProdulo;
    double precoProduto;
    double descontoProduto;

    Produto(String nomeInicial) {
        nomeProdulo = nomeInicial;
    }

    Produto(String nomeInicial, double precoInicial, double descontoInicial) {
        nomeProdulo = nomeInicial;
        precoProduto = precoInicial;
        descontoProduto = descontoInicial;
    }

    Produto() {

    }

    double precoComDesconto() {
        return precoProduto * (1 - descontoProduto);
    }
}
