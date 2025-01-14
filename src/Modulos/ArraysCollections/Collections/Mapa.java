package Modulos.ArraysCollections.Collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<Integer, String>();

        usuarios.put(1, "Bruno");
        usuarios.put(2, "Nicholas");
        usuarios.put(3, "Eduardo");
        usuarios.put(4, "Jhoyssili");
        usuarios.put(5, "Nicolly");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Bruno"));

        System.out.println(usuarios.get(4));
        System.out.println(usuarios.remove(3));

        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> usuario : usuarios.entrySet()) {
            System.out.println(usuario.getKey() + " ==>" + usuario.getValue());
        }


    }
}
