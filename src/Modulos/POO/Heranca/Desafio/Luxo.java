package Modulos.POO.Heranca.Desafio;

public interface Luxo {

    void ligarAr();

    void desligarAr();

    // Assim podemos fazer com que não exista a necessidade ultilizar forçadamente um metodo, podemos só adicionar um defalt e um return de 1(Caso o tipo seja int!).
    default int velocidadeDoAr() {
        return 1;
    }
}
