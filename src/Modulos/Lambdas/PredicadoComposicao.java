package Modulos.Lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

    public static void main(String[] args) {

        Predicate<Integer> isPar = num -> num % 2 == 0 ? true : false;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999 ? true : false;

        // E
        System.out.println(isPar.and(isTresDigitos).test(2));
        // Ou
        System.out.println(isPar.or(isTresDigitos).test(2));
        // Negado
        System.out.println(isPar.and(isTresDigitos).negate().test(2));
    }
}
