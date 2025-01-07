package Fundamentos;

public class Temperatura {

    public static void main(String[] args) {
        final int VALORSUB = 32;
        final double VALORDIV = 5.0 / 9.0;

        double temperaturaIndicada = 10;
        double temperaturaCelcius = (temperaturaIndicada - VALORSUB) * VALORDIV;
        System.out.print("A temperatura de " + temperaturaIndicada + " em Fº transformada em Cº é de " + temperaturaCelcius);

        temperaturaIndicada = 82;
        temperaturaCelcius = (temperaturaIndicada - VALORSUB) * VALORDIV;
        System.out.print("A temperatura de " + temperaturaIndicada + " em Fº transformada em Cº é de " + temperaturaCelcius);
    }
}
