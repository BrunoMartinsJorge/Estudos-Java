package Modulos.POO.Teste;

import Modulos.POO.Heranca.Desafio.Carro;
import Modulos.POO.Heranca.Desafio.Ferrari;
import Modulos.POO.Heranca.Desafio.Fusca;

public class TesteCarro {

    public static void main(String[] args) {
        Carro fusca = new Fusca(180);

        // Os metodos são chamados apartir da instancia que você inceriu e não de acordo com o tipo da variavel.
        Ferrari ferrari = new Ferrari();
        ferrari.ligarTurbo();
        System.out.println("Velocidade atual do fusca: " + fusca.velocidadeAtual);
        System.out.println("Velocidade atual da ferrari: " + ferrari.velocidadeAtual);
        fusca.acelerar();
        System.out.println("Velocidade atual do fusca: " + fusca.velocidadeAtual);
        ferrari.acelerar();
        System.out.println("Velocidade atual do ferrari: " + ferrari.velocidadeAtual);
        ferrari.frear();
        fusca.frear();
        ferrari.desligarTurbo();
        System.out.println("Velocidade atual do ferrari: " + ferrari.velocidadeAtual);
        System.out.println("Velocidade atual do fusca: " + fusca.velocidadeAtual);
    }
}
