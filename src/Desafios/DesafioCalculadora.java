package Desafios;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite 1º número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite 2º número: ");
        double num2 = sc.nextDouble();
        System.out.print("Digite qual operação quer fazer: (+ | - | / | * | %): ");
        String operacao = sc.next();

        if(operacao.equals("+")){
            double resultado = num1 + num2;
            System.out.printf("Resultado da soma entre %.2f e %.2f é igual á: %.2f%n", num1, num2, resultado);
        }else if(operacao.equals("-")){
            double resultado = num1 - num2;
            System.out.printf("Resultado da subtração entre %.2f e %.2f é igual á: %.2f%n", num1, num2, resultado);
        }else if(operacao.equals("*")){
            double resultado = num1 * num2;
            System.out.printf("Resultado da multiplicação entre %.2f e %.2f é igual á: %.2f%n", num1, num2, resultado);
        }else if(operacao.equals("/")){
            double resultado = num1 / num2;
            System.out.printf("Resultado da divisão entre %.2f e %.2f é igual á: %.2f%n", num1, num2, resultado);
        }else if(operacao.equals("%")){
            double resultado = num1 % num2;
            System.out.printf("Resultado do resto entre %.2f e %.2f é igual á: %.2f%n", num1, num2, resultado);
        }

        sc.close();
    }
}
