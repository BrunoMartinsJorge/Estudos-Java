package Modulos.Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        Consumer<Produto> imprimir = valor -> System.out.println(valor.nome);
        Produto produto1 = new Produto("Mouse", 100.00, 0.25);
        Produto produto2 = new Produto("Fone", 50.00, 0.15);
        Produto produto3 = new Produto("Bateria", 120.00, 0.30);
        Produto produto4 = new Produto("Caixo", 10.00, 0.10);
        imprimir.accept(produto1);

        List<Produto> produtos = Arrays.asList(produto1,produto2,produto3,produto4);

        produtos.forEach(imprimir);
        produtos.forEach(valor -> System.out.println(valor.nome));
        produtos.forEach(System.out::println);
    }
}
