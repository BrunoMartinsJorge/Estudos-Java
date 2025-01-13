package Modulos.ArraysCollections;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double[] notaAlunoA = new double[3];
        // Inicializando um array em Java:
        // tipo[(Para identificar um array)] nomeArray = new tipo[(Quantidades de casas do array, em Java é necessário dizer qual o tamanho do array durante sua criação!)]

        notaAlunoA[0] = 10;
        notaAlunoA[1] = 7.9;
        notaAlunoA[2] = 9.2;

        System.out.println(Arrays.toString(notaAlunoA));
        // Arrays.toString(arrayVariavel); funciona para transformar o array em String!

        double totalAlunoA = 0;
        for (int i = 0; i < notaAlunoA.length; i++) {
            System.out.print("[" + notaAlunoA[i] + "] ");
            totalAlunoA += notaAlunoA[i];
        }
        System.out.println("Média do aluno: " + totalAlunoA / notaAlunoA.length);

        double[] notaAlunoB = {10, 8.9, 7.95, 9};
        // Assim, ultilizando chaves para declarar o array em Java, não é necessário já dar um tamanho para ele!
        double totalAlunoB = 0;
        for (int i = 0; i < notaAlunoB.length; i++) {
            totalAlunoB += notaAlunoB[i];
        }
        System.out.println("Média do aluno: " + totalAlunoB / notaAlunoB.length);
    }
}
