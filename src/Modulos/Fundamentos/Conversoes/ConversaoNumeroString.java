package Modulos.Fundamentos.Conversoes;

public class ConversaoNumeroString {

    public static void main(String[] args) {
        Integer num1 = 10000;
        System.out.println("Forma 1: " + num1.toString().length());

        int num2 = 100000;
        System.out.println("Forma 2: " + Integer.toString(num2).length());
    }
}
