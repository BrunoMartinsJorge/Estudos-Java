package Modulos.Lambdas.Desafio;

import Modulos.Lambdas.Produto;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioDeLambdas {
/*
Especificações:
1# A partir do produto calcular o preco real(com o desconto).
2# Imposto municipal: preco real >= 2500 tera 8,5%. Se for < 2500 isento.
3# Frete: preco real >= 3000 tem 100 de frete. Menor que 3000 tem 50 de frete.
4# Arredondar para duas casas decimais.
5# Formatar: R$VALOR,VALOR
*/


    public static void main(String[] args) {

        Produto p = new Produto("Celular", 10000, 0.10);

        Function<Produto, Double> valorComDesconto = objeto -> (objeto.preco * (1 - objeto.desconto));
        UnaryOperator<Double> valorComImposto = valor -> valor >= 2500 ? (valor * (1 + 0.085)) : valor;
        UnaryOperator<Double> valorComFrete = valor -> valor >= 3000 ? (valor + 100) : (valor + 50);
        // Como eu fiz:
        Function<Double, String> valorArredondado = valor -> String.format("%.2f", valor);
        // Outra forma de fazer: UnaryOperator<Double> valorArredondado = valor -> Math.round(valor * 100.0) / 100.0;
        // Como eu fiz:
        UnaryOperator<String> formatarReal = valor -> "R$" + valor;
        // Outra forma de fazer: Function<Double, String> formatarReal = valor -> ("R$" + valor).replace(".", ",");

        System.out.println(valorComDesconto.andThen(valorComImposto).andThen(valorComFrete).andThen(valorArredondado).andThen(formatarReal).apply(p));
    }
}
