package Fundamentos.TipoVariaveis;

public class Inferencia {

    public static void main(String[] args) {
        double a = 4.5;
        System.out.println(a);

        // No caso se colocarmos o 'var' e o nome da variavel e logo após colocarmos o valor da variavel o Java coloca-ra de forma automatica o tipo da variavel de acordo com o seu valor
        var b = 5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);
    }
}
