package Modulos.POO.Abstrato;

public class Cachorro extends Mamifero{

    // Por exemplo se uma classe herdar uma classe abstrata e essa tambem herda de uma outra abstrata então no caso, a ultima se não for abstrata, deve adicionar o corpo do metodo.
    @Override
    public String mamar() {
        return "Usando leite.";
    }

    @Override
    public String mover() {
        return "Usando as patas.";
    }
}
