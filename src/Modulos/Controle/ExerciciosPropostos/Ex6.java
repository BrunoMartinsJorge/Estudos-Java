package Modulos.Controle.ExerciciosPropostos;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numEscolhido = (int) (Math.random() * 100);
        int qtdChances = 10;
        boolean acertou = false;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            int num = sc.nextInt();
            if (num == numEscolhido) {
                System.out.println("Você acertou! O número era " + num);
                acertou = true;
            } else {
                if (num > numEscolhido) {
                    System.out.println("O número escolhido é menor que esse!");
                } else {
                    System.out.println("O número escolhido é maior que esse!");
                }
                qtdChances--;
                System.out.println("Você ainda tem " + qtdChances + " chanches para tentar acertar qual o número sorteado!");
                acertou = false;
            }
            if(!acertou){
                System.out.println("O número era "+numEscolhido+"!");
            }
        }

        sc.close();
    }
}
