package Modulos.Controle.ExerciciosPropostos;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if ((num % 1 == 0 && num % num == 0) && num % (num - 1) != 0) {
            System.out.println("O número é primo");
        } else {
            System.out.println("O número não é primo");
        }

        sc.close();
    }
}
