package Modulos.POO.Encapsulamento;

public class Pessoa {

    public Pessoa(int idade){
        this.setIdade(idade);
    }

    private int idade;

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        int novaIdade = Math.abs(idade);
        this.idade = novaIdade >= 0 && novaIdade <= 120 ? novaIdade : 0;
    }
}
