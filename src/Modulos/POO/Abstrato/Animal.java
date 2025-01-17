package Modulos.POO.Abstrato;

public abstract class Animal {

    public String respirar(){
        return "Oxigênio";
    }

    // Metodo abstrato, não possui corpo do metodo.
    public abstract String mover();
}
