package Modulos.ArraysCollections.Arrays;

public class ForEach {

    public static void main(String[] args) {

        double[] notas = {10, 8.9, 7.95, 9};
        // Foreach: Como é feito em Java abaixo! Repete de acordo com o número de elementos do array!
        for (double nota : notas) {
            System.out.println(nota);
        }
    }
}
