package Modulos.Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class OperadorBinario {

    public static void main(String[] args) {

        BinaryOperator<Double> media = (a, b) -> (a + b) / 2;

        // Eu que fiz:
        Function<Double, String> passou = (medias) -> medias >= 7 ? "Passou" : "Reprovou";

        System.out.println(media.andThen(passou).apply(2.0, 3.0));

        // Curso #01
        BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) / 2 >= 7 ? "Passou" : "Reprovou");
        System.out.println(resultado.apply(9.6, 6.9));
        // Curso #02
        BiFunction<Double, Double, String> resultadoFinal = (n1, n2) -> {
            double mediaFinal = (n1 + n2) / 2;
            return mediaFinal >= 7 ? "Passou" : "Reprovou";
        };
        System.out.println(resultado.apply(7.6, 9.6));

        Function<Double, String> conceito = m -> m >= 7 ? "Passou" : "Reprovou";
        System.out.println(media.andThen(conceito).apply(7.9, 8.8));
    }
}
