package Modulos.Fundamentos.Operadores;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));

        Scanner sc = new Scanner(System.in);
/*
        int a = 97;
        int b = 82;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a > b);
        System.out.println(a < b);
*/
        System.out.println("Digite a média do aluno(a): ");
        double media = sc.nextDouble();
        System.out.println("Digite a frequencia do aluno(a) (Sem o simbolo de %): ");
        double frequencia = sc.nextDouble();

        if (media >= 7 && frequencia >= 75) {
            System.out.println("Passou!");
        } else if (media >= 4 && frequencia >= 75) {
            System.out.println("Exame!");
            System.out.println("Digite a nota que o aluno(a) tirou no exame: ");
            double nota = sc.nextDouble();
            if (nota + media == 10) {
                System.out.println("Passou com exame!");
            } else {
                System.out.println("Não passou com o exame!");
            }
        } else {
            System.out.println("Não passou!");
        }
    }
}
