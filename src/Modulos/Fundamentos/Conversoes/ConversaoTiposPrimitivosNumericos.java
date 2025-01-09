package Modulos.Fundamentos.Conversoes;

public class ConversaoTiposPrimitivosNumericos {

    public static void main(String[] args) {

        double a = 2; // Implicita
        System.out.println("A: " + a);

        // float b = 1.0: Desse jeito esta errado devido a perda de informações,
        // tendo que ser feito ou do jeito asseguir: flaot b = 1.0F; Ou do jeito abaixo:
        float b = (float) 2.73917238129308123; // Explícita (CAST)
        System.out.println("B: " + b);

        int c = 340;
        // byte d = c; erro, não é do mesmo tipo!
        byte d = (byte) c;
        System.out.println("C: " + d);

        double e = 1.999999999999;
        int f = (int) e; // Explícita (CAST)
        System.out.println("E: " + f);
    }
}
