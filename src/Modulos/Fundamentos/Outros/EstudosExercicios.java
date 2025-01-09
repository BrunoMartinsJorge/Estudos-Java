package Modulos.Fundamentos.Outros;

import java.util.Calendar;
import java.util.Scanner;

public class EstudosExercicios {

    public static int MostrarMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("|<---------->Opções<---------->|");
        System.out.println("|< 1#. Calcular Idade         >|");
        System.out.println("|< 2#. Jogar Impar e Par      >|");
        System.out.println("|< 3#. Ver Hora               >|");
        System.out.println("|<--------> 0#. Sair <-------->|");
        int opcao = sc.nextInt();
        System.out.println(opcao);
        return opcao;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = MostrarMenu();

        switch (opcao) {
            case 1:
                System.out.print("Em que ano você nasceu?: ");
                int anoNascimento = sc.nextInt();
                Calendar anoAtual = Calendar.getInstance();
                int anoAtualYear = anoAtual.get(Calendar.YEAR);
                System.out.printf("Você tem %d anos\n", anoAtualYear - anoNascimento);
                break;
            case 2:
                System.out.println("|<--Escolha uma das Opções-->");
                System.out.println("|<-------- 1#. Par -------->");
                System.out.println("|<------- 2#. Impar ------->");
                System.out.println("|<------------------------->");
                int imparOuPar = sc.nextInt();
                int valorMaquina = imparOuPar == 1 ? 0 : 1;
                boolean ganhou = imparOuPar == Math.random() * 2 ? true : false;
                System.out.println(ganhou);System.out.println(valorMaquina);
                break;
            case 3:
                System.out.println("3");
                break;
            case 0:
                System.out.println("0");
                break;
            default:
                break;
        }
        sc.close();
    }
}
