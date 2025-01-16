package Modulos.POO.Heranca.Desafio;

public class Carro {

    public final int VELOCIDADE_MAXIMA;
    public int velocidadeAtual = 20;
    private int delta = 5;

    protected Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        velocidadeAtual = velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA ? VELOCIDADE_MAXIMA : velocidadeAtual + getDelta();
    }

    public void frear() {
        velocidadeAtual = velocidadeAtual >= delta ? velocidadeAtual - delta : velocidadeAtual;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}