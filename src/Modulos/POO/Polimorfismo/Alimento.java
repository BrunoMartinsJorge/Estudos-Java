package Modulos.POO.Polimorfismo;

public abstract class Alimento {

    private double peso;

    Alimento(double peso) {
        this.setPeso(peso);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso(){
        return this.peso;
    }
}
