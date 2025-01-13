package Modulos.MetodosClasses.Desafios.DesafioFinalModulo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Bruno", 88.76);
        Comida alimento1 = new Comida("Bife", 0.8);
        Comida alimento2 = new Comida("Sorvete", 1.2);
        System.out.printf("%s pesa %.2f\n", pessoa1.nome, pessoa1.peso);
        pessoa1.comerAlimento(alimento1);
        System.out.printf("O peso de %s é de %.2f\n", pessoa1.nome, pessoa1.peso);
        pessoa1.comerAlimento(alimento2);
        System.out.printf("O peso de %s é de %.2f\n", pessoa1.nome, pessoa1.peso);
    }
}
