package Modulos.Fundamentos.Desafios;

import java.util.Scanner;

public class Conversao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu 1º salário: ");
        String salario1 = sc.nextLine().replace(",", ".");
        System.out.println("Digite seu 2º salário: ");
        String salario2 = sc.nextLine().replace(",", ".");
        System.out.println("Digite seu 3º salário: ");
        String salario3 = sc.nextLine().replace(",", ".");

        Double valorSalario1 = Double.parseDouble(salario1);
        Double valorSalario2 = Double.parseDouble(salario2);
        Double valorSalario3 = Double.parseDouble(salario3);

        System.out.println("Média salárial: " + (valorSalario1 + valorSalario2 + valorSalario3)/3);
        sc.close();
    }
}
