package Modulos.ArraysCollections.Collections;

import java.util.HashSet;
import java.util.Set;

public class Set_01 {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        /* No exemplo abaixo, usamos uma das formas de Collections, no caso o "Set". Esse modelo não permite armazenar váriaveis de tipo primitivo
        e caso seja feito como no exemplo abaixo ele converte os dados primitivos para a sua variante em Wrapper's. */

        // Exemplo de como adicionar

        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String
        conjunto.add(8); // int -> Integer
        conjunto.add('x'); // char -> Character

        // Saida do conjunto => [1.2, 8, x, Teste, true]
        System.out.println("O tamanho do conjunto é de " + conjunto.size() + " elementos.");

        conjunto.add(true); // Por já possuir uma variavel com esse valor, o "Set" ira ignorar este dado, resultando na perca de dados.
        System.out.println("O tamanho do conjunto é de " + conjunto.size() + " elementos.");

        conjunto.add("teste"); // Neste caso este elemento será adicionado ao "Set" já que mesmo existindo um igual, este possui seu primeiro caractére em minusculo, oque causa uma divergencia e os tornando diferentes.
        System.out.println("O tamanho do conjunto é de " + conjunto.size() + " elementos.");

        // Exemplo de como remover

        System.out.println(conjunto.remove("teste"));
        System.out.println("O tamanho do conjunto é de " + conjunto.size() + " elementos.");

        // Exemplo de como verificar se algum elemento esta contido/existe em um conjunto

        System.out.println(conjunto.contains("Teste"));
        System.out.println(conjunto.contains(true));
        System.out.println(conjunto.contains('x'));

        // <------>

        // Exemplos de operações com os conjuntos

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(nums);

        // Operação: união/union
        // Ele faz a união dos dados de um conjunto com o outro!
        conjunto.addAll(nums);
        System.out.println(conjunto);

        // Operação: interseção/intersection
        // Ele faz a interseção dos dados de um conjunto com o outro, deixando os que são iguais!
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        // Operação para limpar conjunto
        conjunto.clear();
        System.out.println(conjunto);
        System.out.println(conjunto);
    }

}
