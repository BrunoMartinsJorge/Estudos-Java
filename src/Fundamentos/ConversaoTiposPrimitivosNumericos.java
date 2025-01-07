package Fundamentos;

public class ConversaoTiposPrimitivosNumericos {

    public static void main(String[] args) {

        double a = 2.73917238129308123;
        System.out.println("A: " + a);

        // float b = 1.0: Desse jeito esta errado devido a perda de informações,
        // tendo que ser feito ou do jeito asseguir: flaot b = 1.0F; Ou do jeito abaixo:
        float b = (float) 2.73917238129308123;
        System.out.println("B: " + b);
    }
}
