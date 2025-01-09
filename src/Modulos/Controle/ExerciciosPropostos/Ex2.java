package Modulos.Controle.ExerciciosPropostos;


public class Ex2 {

    public static void main(String[] args) {

        long ano = 2024;
        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    System.out.printf("%d é um ano bissexto!\n", ano);
                } else {
                    System.out.printf("%d não é um ano bissexto!\n", ano);
                }
            } else {
                System.out.printf("%d é um ano bissexto!\n", ano);
            }
        } else {
            System.out.printf("%d não é um ano bissexto!\n", ano);
        }
    }
}
