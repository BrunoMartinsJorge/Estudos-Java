package ExerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        // Isso resolve o erro de InputMismatchException
        Locale.setDefault(new Locale("en", "US"));

        int var1 = 1;
        Integer var1T = var1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        double var2 = sc.nextDouble();
        Double var2T = var2;
        System.out.println("O valor é: " + var2T.toString());

        String num3 = "123";
        Integer num3T = Integer.parseInt(num3);

        String valor4 = "true";
        Boolean valor4T = Boolean.parseBoolean(valor4);
        System.out.println(valor4T);

        sc.close();
    }
}
