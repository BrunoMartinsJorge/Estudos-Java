package ExerciciosFixacao.Exercicio10;

import Modulos.ArraysCollections.Collections.List;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    public String getter() {
        return "Nome: " + this.nome + "; Idade: " + this.idade + "; Altura: " + this.altura;
    }

    public void setter(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = validarIdade(idade) ? idade : null;
        this.altura = altura;
    }

    public boolean validarIdade(int idade) {
        return idade >= 0 ? true : false;
    }

   /* public void exibirDados() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + " anos \nAltura: " + altura + " metros.");
    } */
}
