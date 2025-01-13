package Modulos.MetodosClasses.Desafios;

import java.util.Date;

public class AtribuicaoReferenciaVsValor {

    public static void main(String[] args) {

        double a1 = 2;
        double b1 = a1; // Atribuição por valor -> (Variavel primitiva)
        // Atribuição por valor: Você passa um valor diretamente, mesmo sendo de outra váriavel;

        a1++;
        b1--;
        System.out.println(a1);
        System.out.println(b1);

        Date a2 = new Date();
        Date b2 = a2; // Atribuição por referência -> (Objeto)
        // Atribuição por referência: Você referência um valor, um exemplo bom é o de acima
        // Por exemplo, a atribuição por referência é o comportamento padrão para objetos, e é usada em várias situações, incluindo quando você atribui o valor retornado por um método a uma variável.
        // Simplificando, quando usamos variaveis do tipo primitivo, estamos realizando uma atribuição por valor, e quando estamos usando variaveis de objetos  ai realizamos uma atribuição por referência!
        System.out.println(a2);
        System.out.println(b2);
    }
}
