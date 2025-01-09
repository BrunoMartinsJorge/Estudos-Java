package Modulos.Fundamentos.TipoVariaveis;

public class TiposPrimitivos {

    public static void main(String[] args) {

        // Tipos numéricos inteiros
        byte anosDeEmpresa = 37;
        short numeroDeVoos = 622;
        int id = 56821;
        long pontosAcumulados = 8_029_182_120L;

        // Tipos numéricos reais
        float salario = 12_712.92F;
        double vendasAcumuladas = 1_091_092_189.08;

        // Tipo booleano
        boolean estaDeFerias = false;

        // Tipo caractere
        char status = 'A';

        // Dias de empresa
        System.out.println("Este funcionario está na empresa á " + anosDeEmpresa * 365 + " dias.");

        // Numeros de viagens
        System.out.println("Esse funcionario realizou cerca de " + numeroDeVoos / 2 + " viagens pela empresa.");

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println("O funcionario de Id " + id + ": recebe R$" + salario + " de salário.");

        System.out.println(estaDeFerias ? "Esse funcionario esta de férias" : "Esse funcionario não esta de férias");

        System.out.println("Status do funcionario: " + status);
    }
}
