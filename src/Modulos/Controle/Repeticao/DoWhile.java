package Modulos.Controle.Repeticao;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String texto = "";
        do {
            System.out.print("Digite um texto: ");
            texto = sc.nextLine();
        } while(!texto.equalsIgnoreCase("sair"));

        sc.close();

    }
}
