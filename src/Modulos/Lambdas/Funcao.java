package Modulos.Lambdas;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        Function<Integer, String> parImpar = num -> num % 2 == 0 ? "par" : "impar";
        System.out.println(parImpar.apply(5));

        Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;

        Function<String, String> empolgado = valor -> "Empolgado: " + valor + "!!!!!";

        String resultadoFinal = parImpar.andThen(oResultadoE).andThen(empolgado).apply(32);

        System.out.println(resultadoFinal);
    }
}
