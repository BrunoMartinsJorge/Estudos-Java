package Modulos.Controle.ExerciciosPropostos;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double valor = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº numero: ", i+1);
            if (i == 0) {
                valor = sc.nextDouble();
            } else if (valor < sc.nextDouble()) {
                valor = sc.nextDouble();
            }
        }
        System.out.println("O maior número é: " + valor);

        sc.close();
    }
}
