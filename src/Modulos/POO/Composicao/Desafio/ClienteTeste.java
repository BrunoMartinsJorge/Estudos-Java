package Modulos.POO.Composicao.Desafio;

import java.util.ArrayList;

public class ClienteTeste {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Bruno");

        Compra compra1 = new Compra();
        compra1.items.add(new Item(3, new Produto("Caneta", 1.20)));
        compra1.items.add(new Item(1, new Produto("Celular", 1899.90)));
        Compra compra2 = new Compra();
        compra2.items.add(new Item(2, new Produto("Arroz 1kg", 10.50)));
        compra2.items.add(new Item(1, new Produto("Diario", 31.75)));

        cliente1.listaDeCompras.add(compra1);
        cliente1.listaDeCompras.add(compra2);

        System.out.println("O valor total á pagar foi de R$" + cliente1.obterValorTotal(cliente1.listaDeCompras) + ".");
    }
}
