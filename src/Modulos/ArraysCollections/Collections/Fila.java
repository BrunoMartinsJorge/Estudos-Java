package Modulos.ArraysCollections.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> Ambos adicionam elementos na fila
        // Mas eles possuem uma diferença que é como ambas se comportam quando a fila está cheia

        fila.add("Bruno");
        fila.offer("Carlos");
        fila.add("João");
        fila.offer("Bia");
        fila.add("Gustavo");
        fila.offer("Julia");

        /*Caso a fila estiver cheia(É possivel delimitar um tamanho reservado), existem duas possiveis formas de isso ser apresentado, sendo a do .add() e do .offer():
        .add() -> Vai retornar uma Exepcion/Erro em Java
        .offer() -> Vai retornar um valor boleano*/

        // Peek e Element -> Ambos pegam o próximo elemento da fila
        // Mas eles possuem uma diferença que é como ambas se comportam quando a fila está vazia

        System.out.println(fila.peek());
        System.out.println(fila.element());

        /*Caso a fila estiver vazia, existem duas possiveis formas de isso ser apresentado, sendo a do .peek() e do .element():
        .peek() -> Vai retornar um "null"
        .element() -> Vai retornar um exepcion/erro*/

        // Poll e Remove -> Ambos pegam o próximo elemento da fila
        // Mas removem o elemento

        /*
        Outros metodos:
         > fila.size() -> Retorna o tamanho da fila/Quantidade de elementos
         > fila.clear() -> Limpa a fila
         > fila.isEmpty() -> Retorna se a fila esta vazia com um valor verdadeiro ou falso
         > fila.poll() -> Retorna o próximo elemento da fila, e caso possua mais de um desses, ele trará o próximo, e caso acabe, ele retorna um "null"!
         > fila.remove() -> Remove o próximo elemento da fila, e se estiver vazia retorna uma exceção!
        */
    }
}
