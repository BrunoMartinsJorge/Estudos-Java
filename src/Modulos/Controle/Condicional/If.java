package Modulos.Controle.Condicional;

import java.util.Locale;
import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a média: ");
        double media = sc.nextDouble();

        if(media <= 10 && media >= 7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
