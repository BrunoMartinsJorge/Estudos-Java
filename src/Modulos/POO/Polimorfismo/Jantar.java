package Modulos.POO.Polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(92.956);
        Arroz ingrediente1 = new Arroz(0.382);
        Feijao ingrediente2 = new Feijao(0.101);
        Sorvete ingrediente3 = new Sorvete(0.596);

        System.out.println(convidado.getPeso());
        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        convidado.comer(ingrediente3);
        System.out.println(convidado.getPeso());
    }
}
