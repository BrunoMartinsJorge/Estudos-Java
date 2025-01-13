package Modulos.MetodosClasses.Desafios.DesafioFinalModulo;

public class Pessoa {

    String nome;
    double peso;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    void comerAlimento(Comida alimento){
        if(alimento != null){
            this.peso += alimento.peso;
        }
    }
}
