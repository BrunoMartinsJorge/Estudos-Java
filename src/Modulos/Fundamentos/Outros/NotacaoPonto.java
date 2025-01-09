package Modulos.Fundamentos.Outros;

public class NotacaoPonto {

    public static void main(String[] args) {

        String s = "Bom Dia X";
        s = s.replace("X", "Senhor");
        s = s.concat("!");
        s = s.toUpperCase();

        System.out.println(s);

        String x = "Bruno".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X".replace("X", "Bruno").toUpperCase().concat("!");
        System.out.println(y);

        // Os tipos primitivos não possuem o operador "."
        int a = 3;
        System.out.println(a);
    }
}
