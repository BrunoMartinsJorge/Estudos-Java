package Modulos.Controle.Desafios;

import java.util.Scanner;

public class DesafiosDaSemana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um dia da semana: ");
        String dia = sc.next().toLowerCase();

        if (dia.equals("domingo")) {
            System.out.println(1);
        } else if (dia.equals("segunda")) {
            System.out.println(2);
        } else if (dia.equals("terça")) {
            System.out.println(3);
        } else if (dia.equals("quarta")) {
            System.out.println(4);
        } else if (dia.equals("quinta")) {
            System.out.println(5);
        } else if (dia.equals("sexta")) {
            System.out.println(6);
        } else {
            System.out.println(7);
        }

        sc.close();
    }
}
