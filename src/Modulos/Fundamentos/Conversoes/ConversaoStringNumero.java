package Modulos.Fundamentos.Conversoes;

import javax.swing.*;

public class ConversaoStringNumero {

    public static void main(String[] args) {

        String valor1 = JOptionPane.showInputDialog("Digite o preimeiro numero");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo numero");

        System.out.println("Forma errada: (Resulta em concatenação) -> " + valor1 + valor2);

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        double soma = numero1 + numero2;
        System.out.println("Forma certa: (Resultando na soma, devido serem números não mais Strings) -> " + soma);
        System.out.println("Média " + soma/2);
    }
}
