package Modulos.POO.Composicao.Desafio;

import java.util.ArrayList;

public class Cliente {

    String nome;
    ArrayList<Compra> listaDeCompras = new ArrayList<Compra>();

    Cliente(String nome) {
        this.nome = nome;
    }

    double obterValorTotal(ArrayList<Compra> listaDeCompras){
        double valorTotal = 0;
        if(!listaDeCompras.isEmpty()){
            for(Compra unidadeCompra: listaDeCompras){
                for(Item itemCompra: unidadeCompra.items){
                    valorTotal += itemCompra.quantidade * itemCompra.produto.preco;
                }
            }
        }
        return valorTotal;
    }
}
