package Modulos.ArraysCollections.Collections;

import java.util.HashSet;

public class Hashcode {

    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Caio"));
        usuarios.add(new Usuario("Bia"));

        boolean resultado = usuarios.contains(new Usuario("Bia"));
        System.out.println(resultado);
    }
}
