package Modulos.Fundamentos.TipoVariaveis;

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Olá!".charAt(2));

        String s = "Bom Dia";
        // startWith: Verifica se começa com a palavra/caractere abaixo!
        System.out.println(("StartWith: " + s.startsWith("Bom")));
        // endsWith: Verifica se termina com a palavra/caractere abaixo!
        System.out.println(("EndsWith: " + s.endsWith("Dia")));
        // equals: Verifica se o conteudo da variavel é igual a palavra/caractere abaixo!
        System.out.println(("Equals: " + s.equals("Bom dia")));
        // equalsIgnoreCase: Faz a mesma coisa que o equals más não liga caso for maiusculo ou minusculo!
        System.out.println(("EqualsIgnoreCase: " + s.equalsIgnoreCase("bom dia")));

        var nome = "Bruno";
        var sobreNome = "Martins Jorge";
        var idade = 18;
        var salario = 128121.298;

        System.out.println("\n");

        System.out.println("Nome: " + nome + " \nSobrenome: " + sobreNome + " \nIdade: " + idade + " \nSalario: " + salario);

        System.out.println("\n");

        // System.out.printf("algo %s", variavel): Serve para juntar valores em um string sem ter que ser feito com o "+"
        // Basicamente os elementos(Sendo esses o "%s") são trocados pelas variaveis, como por exemplo o feito abaixo!
        System.out.printf("Nome: %s %s", nome, sobreNome);

        System.out.println("\n");

        // %s e %d ou %f: O "%s" tem como função ser substituidos por variaveis do tipo String,
        // e o "%d" sendo substituido por variaveis do tipo inteiro,
        // e o "%f" para reais
        System.out.printf("O aluno %s %s tem %d anos e ganha R$ %.2f", nome, sobreNome, idade, salario);

        // String.format: Ele salva esse resultado em uma variavel, juntando diversas frases como no exemplo abaixo
        String frase = String.format("O aluno %s %s tem %d anos e ganha R$ %.2f", nome, sobreNome, idade, salario);
        System.out.println("\n" + frase);
    }
}
