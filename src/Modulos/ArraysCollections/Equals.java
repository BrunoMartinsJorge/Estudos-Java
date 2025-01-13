package Modulos.ArraysCollections;

public class Equals {

    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Bruno";
        u1.email = "bruno@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Bruno";
        u2.email = "bruno@gmail.com";

        System.out.println(u1 == u2); // False
        System.out.println(u1.equals(u2)); // False se não alterarmos o equals na classe Usuario

        System.out.println();
    }
}
