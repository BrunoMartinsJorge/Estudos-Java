package Modulos.Controle.ExerciciosPropostos;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a 1º nota do aluno: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a 2º nota do aluno: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Aprovado! Media = " + media);
        } else if (media >= 4 && media < 7) {
            System.out.println("Recuperação! Media = " + media);
        } else {
            System.out.println("Reprovado! Media = " + media);
        }

        sc.close();
    }
}
