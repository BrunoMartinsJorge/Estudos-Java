package Fundamentos.TipoVariaveis;

public class Wrapper {

    public static void main(String[] args) {

        // Wrappers: São as formas de Objetos dos tipos primitivos, como: byte, short, int e long
        Byte b = 100;
        Short s = 10000;

        // Abaixo um exemplo de como transformar um valor string em numero(Cas dentro da String existe um caractere de número!):
        // Integer i = Integer.parseInt(entrada.next());

        Integer i = 1000000000;
        Long l = 1000000000000000000L;
        // Os valores acima são exemplos desses wrappers, além de que para transformalos em primitivos novamente, você só precisa deixar
        // suas primeiras letras em minusculas

        // Agora essas variaveis "wrappers" tem acesso á notação ponto, no caso as funções ao serem adicionado um . no final da variavel.
        // Assim abrindo um leque de possibilidades e de funções que esta variavel tem, como no exemplo abaixo:
        System.out.println("Byte: " + b.byteValue());
        System.out.println("Short: " + s);
        System.out.println("Integer: " + i);
        System.out.println("Long: " + l);

        // Neste caso abaixo deve ser adicionado o F ao final da variavel:
        Float f = 15.65F;
        System.out.println("Float: " + f);

        Boolean bol = Boolean.parseBoolean("true");
        System.out.println("Boolean: " + bol);

        Character c = 'a';
        System.out.println("Character: " + c  + "...");
    }
}
