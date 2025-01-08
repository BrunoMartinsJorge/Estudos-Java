package ExerciciosFixacao;

public class Exercicio5 {

    public static void main(String[] args) {

        double variavel1 = 1.5;
        int variavel2 = (int) variavel1;
        System.out.println(variavel2);

        long variavel3 = 10000;
        float variavel4 = (float) variavel3;
        System.out.println(variavel4);

        int variavel5 = 10;
        int variavel6 = 5;
        double variavel7 = (double) variavel5;
        double variavel8 = (double) variavel6;
        double resultado = variavel7 / variavel8;
        System.out.printf("%.2f%n", resultado);
        //Duas casas decimais acima!!!
        //Para almentar ou diminuir as casas decimais, altere o número após o ponto e antes do f!!!
    }
}
