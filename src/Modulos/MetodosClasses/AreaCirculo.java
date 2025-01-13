package Modulos.MetodosClasses;

public class AreaCirculo {

    double raio;
    static final double pi = 3.14;

    public AreaCirculo(double raioInicial){
        raio = raioInicial;
    }

    double area(){
        return pi * Math.pow(raio, 2);
    }
}
