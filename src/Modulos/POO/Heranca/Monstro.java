package Modulos.POO.Heranca;

public class Monstro extends Jogador {
    //Esse abixo:
    public Monstro() {
        this(10, 10);
    }

    //Chama essa, que chama a da classe pai.
    public Monstro(int x, int y) {
        super(10, 10);
    }
}
