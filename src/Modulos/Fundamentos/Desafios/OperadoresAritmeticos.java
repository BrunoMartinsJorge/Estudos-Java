package Modulos.Fundamentos.Desafios;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        double primeirosParentesesEqua1 = 3+2;
        double primeirosPolchetesEqua1 = Math.pow((6 * primeirosParentesesEqua1), 2);
        double divisaoEqua1 = primeirosPolchetesEqua1/(3*2);

        double primeirosParentesesEqua2 = 1-5;
        double segundosParentesesEqua2 = 2-7;
        double terceirosParentesesEqua2 = Math.pow((primeirosParentesesEqua2 * segundosParentesesEqua2) / 2, 2);

        double resultadoFinal = Math.pow(divisaoEqua1 - terceirosParentesesEqua2, 3);
        double resultadoFinalDividido = resultadoFinal / (Math.pow(10, 3));
        System.out.println((int) resultadoFinalDividido);
    }
}
