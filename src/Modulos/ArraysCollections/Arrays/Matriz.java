package Modulos.ArraysCollections.Arrays;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos(as) seram avaliados?: ");
        int numeroDeAlunos = sc.nextInt();

        System.out.print("Quantas notas por aluno(a)?: ");
        int numeroDeNotasPorAluno = sc.nextInt();

        double[][] notasAlunos = new double[numeroDeAlunos][numeroDeNotasPorAluno];

        double notaTotal = 0;
        for (int aluno = 0; aluno < notasAlunos.length; aluno++) {
            for (int nota = 0; nota < notasAlunos[aluno].length; nota++) {
                System.out.printf("Digite a %dº nota do %dº aluno(a): ", nota + 1, aluno + 1);
                notasAlunos[aluno][nota] = sc.nextDouble();
                notaTotal += notasAlunos[aluno][nota];
            }
        }
/*
        for (double[] aluno : notasAlunos) {
            System.out.print("[");
            for (double nota : aluno) {
                System.out.print(" [");
                System.out.print(nota);
                System.out.print("] ");
            }
            System.out.print("]");
            System.out.println();
        }
*/
        double media = notaTotal / (numeroDeAlunos * numeroDeNotasPorAluno);
        System.out.printf("A média da sala foi de: %.2f\n", media);

        sc.close();
    }
}
