package ExerciciosFixacao;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1º valor: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o 2º valor: ");
        int num2 = sc.nextInt();

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));
        System.out.println("Resto: " + (num1 % num2));
    }
}
