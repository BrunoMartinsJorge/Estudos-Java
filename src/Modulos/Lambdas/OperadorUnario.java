package Modulos.Lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = x -> x + 2;
        UnaryOperator<Integer> vezesDois = x -> x * 2;
        UnaryOperator<Integer> aoQuadrado = x -> x * x;

        int valor = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
        System.out.println(valor);

        int valor2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
        System.out.println(valor2);
    }
}
