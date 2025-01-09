package Modulos.Controle.Repeticao;

public class Continue {

    public static void main(String[] args) {

        // Basicamente quando um continue é encontrado, ele pausa a repetição, mas somente a repetição em
        // que ele foi encontrado, depois ele volta ao normal até acontecer novamente, como no exemplo abaixo:
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }
    }
}
