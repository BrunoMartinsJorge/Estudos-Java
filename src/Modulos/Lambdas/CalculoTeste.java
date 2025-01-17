package Modulos.Lambdas;

public class CalculoTeste {

    public static void main(String[] args) {

        Calculo calculo = new soma();
        System.out.println(calculo.executar(1,2));
        calculo = new Multiplicar();
        System.out.println(calculo.executar(2,2));
    }
}
