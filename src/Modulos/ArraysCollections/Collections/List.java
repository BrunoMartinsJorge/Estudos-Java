package Modulos.ArraysCollections.Collections;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        Usuario u1 = new Usuario("Bruno");
        lista.add(u1);

        lista.add(new Usuario("Alberto"));
        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Carlos"));

        // Buscando dados de dentro de uma lista usando index:
        System.out.println(lista.get(3));

        // Remover apartir do index
        System.out.println(lista.remove(2));

        // Remover apartir de um objeto
        System.out.println(">>> "+lista.remove(new Usuario("Carlos")));

        for(Usuario u: lista){
            System.out.println(u.nome);
        }
    }
}
