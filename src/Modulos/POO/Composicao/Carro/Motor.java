package Modulos.POO.Composicao.Carro;

public class Motor {

    private double fatorInjecao = 1;

    boolean ligado = false;

    int giros() {
        if (ligado) {
            return (int) Math.round(fatorInjecao * 3000);
        } else {
            return 0;
        }
    }

    public double getFatorInjecao() {
        return this.fatorInjecao;
    }

    public void setFatorInjecao(double fatorInjecao) {
        this.fatorInjecao += fatorInjecao;
    }
}
