package Modulos.Controle.Desafios;

import java.util.Scanner;

public class MediaDosAlunos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota = 0;
        double notasValidas = 0;
        int qtdNotas = 0;
        while (nota != -1) {
            System.out.println("Digite a nota do aluno: ");
            nota = sc.nextDouble();
            if (nota >= 0 && nota <= 10) {
                notasValidas += nota;
                qtdNotas++;
            } else if(nota != -1) {
                System.out.print("Digite uma nota valida(Entre 0 e 10)");
            }
        }
        System.out.printf("Média do(s) aluno(s) é de %.2f", notasValidas / qtdNotas);

        sc.close();
    }
}
