package Modulos.ArraysCollections.Desafios;

import java.util.Scanner;

public class Medias {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas notas você deseja adicionar? ");

        int qtdNotas = sc.nextInt();

        double[] notasAluno = new double[qtdNotas];

        for(int i=0; i<qtdNotas;i++){
            System.out.printf("Digite a %dº nota do aluno: ", i+1);
            notasAluno[i] = sc.nextDouble();
        }

        double notaSoma = 0;
        for(double nota: notasAluno){
            notaSoma += nota;
        }

        System.out.printf("A média do aluno é de %.2f", (notaSoma / qtdNotas));

        sc.close();
    }
}
