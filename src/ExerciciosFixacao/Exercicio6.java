package ExerciciosFixacao;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
/*
        int[] variavel1 = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            variavel1[i] = sc.nextInt();
        }
        int maior = variavel1[0];
        for (int i = 0; i < 3; i++) {
            if (maior < variavel1[i]) {
                maior = variavel1[i];
            }
        }
        System.out.println("Maior número: " + maior);
*/
        double base = 0;
        double altura = 0;
        System.out.println("Digite o valor da base: ");
        base = sc.nextDouble();
        System.out.println("Digite o valor da altura: ");
        altura = sc.nextDouble();
        System.out.printf("A área do triângulo é %.2f%n", (base * altura));

        double valor = 0;
        System.out.println("Digite o valor do produto: ");
        valor = sc.nextDouble();
        double valorDesconto = valor / 10;
        double valorComDesconto = valor - valorDesconto;
        System.out.printf("O valor com desconto é de: %.2f%n", valorComDesconto);

        sc.close();
    }
}
