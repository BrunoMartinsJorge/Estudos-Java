package Modulos.Controle.Desafios;

import java.util.Scanner;

public class Saida {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite algo: ");
        String texto = sc.nextLine();

        while(!texto.equalsIgnoreCase("sair")){
            System.out.print("Digite algo: ");
            texto = sc.nextLine();
        }

        sc.close();
    }
}
