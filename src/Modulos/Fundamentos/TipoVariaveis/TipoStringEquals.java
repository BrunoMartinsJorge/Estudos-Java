package Modulos.Fundamentos.TipoVariaveis;

import java.util.Scanner;

public class TipoStringEquals {

    public static void main(String[] args) {

        // Forma funcional, mas que pode gerar inconsistências e alguns bugs como visto um pouco mais abaixo
        System.out.println("2" == "2");

        //Pode gerar problemas caso compere assim:
        String s1 = new String("2");
        System.out.println("2" == s1); // Retorna um false
        System.out.println("2".equals(s1)); //Retorna um verdadeiro
        //O melhor jeito de se comparar uma String é com o ".equals()" como no exemplo acima!

        Scanner sc = new Scanner(System.in);

        String s2 = sc.next();

        // O mesmo vale para quando for feito o Scanner:
        System.out.println("2" == s2.trim());
        System.out.println("2".equals(s2.trim()));

        /*
        O next() no scanner, para receber um valor String já automaticamente retira os espaços em branco, não possuindo a necessidade de um .trim()
        */

        sc.close();
    }
}
