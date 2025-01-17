package Modulos.Lambdas;

public interface TesteFuncoes {

    // Assinatura => nada -> T | Nome => Supplier:
    // Não recebe nenhum parametro, mas retorna algo.
    default public Double teste() {
        return 0.0;
    }

    // Assinatura => T -> nada | Nome => Consumer
    // Recebe um parametro, mas não retorna nada.
    default public void teste(double x) {
        System.out.println("Valor ao quadrado " + Math.pow(x, 2));
    }

    // Assinatura => T -> T | Nome => UnaryOperator
    // Recebe um parametro, retorna algo do mesmo tipo do parametro recebido.
    default public Integer teste(int x) {
        return (x*2)*2;
    }

    // Assinatura => T, T -> T | Nome => BinaryOperator
    // Recebe dois parametros do mesmo tipo, e retorna um valor.
    default public Double teste(double x, double y){
        return x+y;
    }

    // Assinatura => S -> T | Nome => Function
    // Recebe um parametro de um tipo, retorna algo de tipo diferente do parametro recebido.
    default public String teste1(double x){
        return "Valor dele " + Math.pow(x, 2);
    }

    // Assinatura => T -> Boolean | Nome => Predicate
    // Recebe um parametros, e retorna um valor boolean.
    default public Boolean teste2(double x){
        return x>=0 ? true : false;
    }
}
