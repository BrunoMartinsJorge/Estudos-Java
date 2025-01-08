package ExerciciosFixacao;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = "";
        int idade = 0;
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }

        final int VALORSUB = 32;
        final double VALORDIV = 5.0 / 9.0;
        double temperaturaIndicada = 0;
        System.out.println("Digite a temperatura em fahrenheit: ");
        temperaturaIndicada = sc.nextDouble();
        double temperaturaCelcius = (temperaturaIndicada - VALORSUB) * VALORDIV;
        System.out.println("A temperatura de " + temperaturaIndicada + " em celcius é de: " + temperaturaCelcius);

        double a = 0;
        double b = 0;
        double c = 0;

        System.out.println("Digite o valor de a: ");
        a = sc.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = sc.nextDouble();
        System.out.println("Digite o valor de c: ");
        c = sc.nextDouble();

        double delta = (b * b) - (4 * a * c);
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta))/2*a;
            double x2 = (-b - Math.sqrt(delta))/2*a;
            System.out.printf("O valor de x1 é de %.2f e o valor de x2 é de %.2f%n", x1, x2);
        }else if(delta == 0){
            double x = (-b/2*a);
            System.out.println("Delta == 0, uma raiz real encontrada: x, seu valor é de: " + x);
        }else{
            System.out.println("Delta possui um valor < 0, nenhuma raiz real encontrada!");
        }
    }
}