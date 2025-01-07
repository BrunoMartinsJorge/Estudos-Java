package ExerciciosFixacao;

import java.util.Scanner;

public class Exercicio1 {

    /* ENUNCIADO:
    Gere um código que receba o salario de 10 pessoas e fassa a média:
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] salarios = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o salario da " + (i+1) +"º pessoa: ");
            salarios[i] = sc.nextLine().replace(",",".");
        }
        Double mediaSalarial = 0.0;
        for(int i = 0; i<salarios.length;i++){
            mediaSalarial += Double.parseDouble(salarios[i]);
            if(i==salarios.length-1){
                mediaSalarial /= salarios.length;
            }
        }
        System.out.println("Média Salárial: " + mediaSalarial);
    }
}
