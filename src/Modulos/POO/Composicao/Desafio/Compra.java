package Modulos.POO.Composicao.Desafio;

import java.util.ArrayList;

public class Compra {

    ArrayList<Item> items = new ArrayList<Item>();

    double calcularValorTotalDaCompra(Compra listaDeCompras) {
        double valorTotal = 0;
        for (Item itemCompra : listaDeCompras.items) {
            valorTotal += itemCompra.quantidade * itemCompra.produto.preco;
        }
        return valorTotal;
    }
}
