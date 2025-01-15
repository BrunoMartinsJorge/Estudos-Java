package Modulos.POO.Composicao.Compra;

import java.util.ArrayList;

public class Compra {

    String nomeCliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void adicionarItem(Item item) {
        itens.add(item);
        item.compra = this;
    }

    double valorTotal(){
        double total = 0;
        for(Item item: itens){
            total += (item.quantidade* item.preco);
        }
        return total;
    }
}
