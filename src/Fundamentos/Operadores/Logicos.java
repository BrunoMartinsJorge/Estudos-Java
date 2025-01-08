package Fundamentos.Operadores;

public class Logicos {

    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println("E -> &&: " + (condicao1 && condicao2));
        System.out.println("Ou -> ||: " + (condicao1 || condicao2));
        System.out.println("Ou exclusivo -> ^: " + (condicao1 ^ condicao2));
        System.out.println("Negado -> !: " + (!condicao1));
        System.out.println("Negado -> !: " + (!condicao2));

        // Tabela Verdade do E:
        System.out.println("\nTabela verdade do E => (AND)");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        // Tabela Verdade do OU:
        System.out.println("\nTabela verdade do OU => (OR)");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // Tabela Verdade do OU EXCLUSIVO:
        System.out.println("\nTabela verdade do OU EXCLUSIVO => (XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        // Tabela Verdade do NEGADO:
        System.out.println("\nTabela verdade do NEGADO => (NOT)");
        System.out.println(!true);
        System.out.println(!false);

    }
}
