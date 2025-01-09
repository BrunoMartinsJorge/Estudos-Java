package Modulos.Controle;

import java.util.Locale;
import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor de 0 á 10: ");
        double nota = sc.nextDouble();

        if(nota > 10 || nota < 0){
            System.out.println("Nota Inválida!");
        }else if(nota >= 8.1){
            System.out.println("Nota: A");
        }else if(nota >= 6.1){
            System.out.println("Nota: B");
        }else if(nota >= 4.1){
            System.out.println("Nota: C");
        }else if(nota >= 2.1){
            System.out.println("Nota: D");
        }else{
            System.out.println("Nota: E");
        }

        sc.close();
    }
}
