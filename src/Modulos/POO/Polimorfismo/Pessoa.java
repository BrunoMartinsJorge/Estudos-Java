package Modulos.POO.Polimorfismo;

public class Pessoa {

    private double peso;

    Pessoa(double peso){
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso >= 0 ? peso : 0;
    }

    public void comer(Alimento alimento){
        this.peso += alimento.getPeso();
    }
}
