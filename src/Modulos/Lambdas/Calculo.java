package Modulos.Lambdas;

// Essa anotation colocado abaixo, "@FunctionalInterface" é ultilizado para declarar que uma interface pode apenas ter uma unica função abstrata, além de que as funções da interface devem ser anonimas, isso significa que elas não podem possuir um corpo, esse corpo ter que ser criado na classe que o implementar.
@FunctionalInterface
public interface Calculo {

    //Abstrata
    double executar(double a, double b);

    // Default
    default String legal(){
        return "LEGAL";
    }

    // Static
    static String ola(){
        return "Ola!";
    }
}
