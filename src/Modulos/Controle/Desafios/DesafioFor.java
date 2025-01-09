package Modulos.Controle.Desafios;

public class DesafioFor {

    public static void main(String[] args) {

        /*Pode ser feito assim para que não seja necessário um valor númerico para controlar está repetição!
        Ultilizando o "!variavel.equals("caractere....")" para cada caractere caso seja uma opção!*/

        for (String v = "#"; !v.equals("#####"); v += "#") {
            System.out.println(v);
        }
    }
}
