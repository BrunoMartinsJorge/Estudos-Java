package ExerciciosFixacao;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String varaivel1 = "";
        System.out.println("Digite uma palavra: ");
        varaivel1 = sc.nextLine();
        System.out.println("Essa palavra contem " + varaivel1.length() + " caracteres!");

        String variavel2 = "";
        System.out.println("Digite uma palavra: ");
        variavel2 = sc.nextLine();
        if (Objects.equals("java", variavel2.toLowerCase())) {
            System.out.println("Possui Java na palavra!");
        } else {
            System.out.println("Não possui Java na palavra!");
        }

        String variavel3 = "";
        System.out.println("Digite seu nome: ");
        variavel3 = sc.nextLine();
        // O metodo substring(indicieInicial, indicieFinal), serve para pegar as letras/caracteres de uma string de um certo ponto
        // até um outro certo ponto!
        System.out.println("As três primeiras letras do seu nome são: " + variavel3.substring(0, 3));

        sc.close();
    }
}
