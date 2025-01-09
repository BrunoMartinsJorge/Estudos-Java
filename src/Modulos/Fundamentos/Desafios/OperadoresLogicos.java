package Modulos.Fundamentos.Desafios;

import java.util.Scanner;

public class OperadoresLogicos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Houve trabalho na terça-feira?");
        boolean trabalho1 = sc.nextBoolean();
        System.out.println("Houve trabalho na quinta-feira?");
        boolean trabalho2 = sc.nextBoolean();

        boolean tv50p = false;
        boolean tv32p = false;
        boolean tomaramSorvete = false;
        boolean saldavel = false;
        boolean ficaramEmCasa = false;

        if (trabalho1 && trabalho2) {
            tv50p = true;
            tv32p = false;
            tomaramSorvete = true;
            saldavel = false;
            ficaramEmCasa = false;
        } else if (trabalho1 ^ trabalho2) {
            tv32p = true;
            tv50p = false;
            tomaramSorvete = true;
            saldavel = false;
            ficaramEmCasa = false;
        } else {
            tv50p = false;
            tv32p = false;
            tomaramSorvete = false;
            saldavel = true;
            ficaramEmCasa = true;
        }

        System.out.println("Comprou a TV de 50p: " + tv50p);
        System.out.println("Comprou a TV de 32p: " + tv32p);
        System.out.println("Compraram sorvetes: " + tomaramSorvete);
        System.out.println("Saldaveis: " + saldavel);
        System.out.println("Ficaram em casa: " + ficaramEmCasa);
    }
}
