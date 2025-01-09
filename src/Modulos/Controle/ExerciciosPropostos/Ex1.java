package Modulos.Controle.ExerciciosPropostos;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = sc.nextDouble();

        if((num >= 0 && num <= 100) && num%2==0){
            System.out.println("Esse número atende a todas as espectativas...");
        }

        sc.close();
    }
}
