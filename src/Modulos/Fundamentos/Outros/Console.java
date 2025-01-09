package Modulos.Fundamentos.Outros;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        // Scanner variavelnome = new Scanner(System.in): Serve para coletar os dados que o usúario digitar no terminal do código! Como no exemplo abaixo:
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        // varaivelnome.nextLine(): Serve para coletar os dados de uma string, como no exemplo abaixo!
        String nome =  entrada.nextLine();

        System.out.print("Insira seu sobrenome: ");
        String sobrenome =  entrada.nextLine();

        System.out.print("Insira seu idade: ");
        // varaivelnome.nextInt(): Serve para coletar os dados de um numero inteiro, como no exemplo abaixo!
        int idade =  entrada.nextInt();

        System.out.printf("%s %s tem %d anos.\n", nome, sobrenome, idade);

        // Para previnir problemas, sempre é necessário ao fim da coleta de dados você deve fechar o Scanner, como no exemplo abaixo:
        entrada.close();
    }
}
