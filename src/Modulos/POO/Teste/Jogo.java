package Modulos.POO.Teste;

import Modulos.POO.Heranca.Direcao;
import Modulos.POO.Heranca.Heroi;
import Modulos.POO.Heranca.Monstro;

public class Jogo {

    public static void main(String[] args) {

        Monstro monstro = new Monstro();

        Heroi heroi = new Heroi(10, 11);

        System.out.println("Monstro tem " + monstro.vida + " de vida.");
        System.out.println("Heroi tem " + heroi.vida + " de vida.");

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro tem " + monstro.vida + " de vida.");
        System.out.println("Heroi tem " + heroi.vida + " de vida.");
    }
}
