package Modulos.ArraysCollections.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {
        // O ultimo a entrar é o primeiro a sair(LiFo -> Last In, First Out)
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("As 100 melhores histórias da mitólogia Grega."); // Retorna um boleano.
        livros.push("Diário de um Zumbi do Minecraft"); // Retorna uma exceção caso algum erro ocorra.
        livros.push("Memórias de um Sargento de Milicias");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.poll());

    }
}
