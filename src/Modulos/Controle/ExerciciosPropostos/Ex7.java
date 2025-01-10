package Modulos.Controle.ExerciciosPropostos;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numeroEscolhido = 0;
        double valorSoma = 0;

        while (numeroEscolhido >= 0) {
            System.out.print("Digite um número: ");
            numeroEscolhido = sc.nextDouble();
            if (numeroEscolhido >= 0) {
                valorSoma += numeroEscolhido;
            }
            System.out.println("Soma dos números é: " + valorSoma);
        }
        System.out.println("Fim do programa...");

        sc.close();
    }
}
