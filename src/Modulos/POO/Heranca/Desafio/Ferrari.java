package Modulos.POO.Heranca.Desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarAr;
    private boolean ligarTurbo;

    // Uma coisa importante, mas que não é obrigatória ao realizar uma sobrecarga em algum metodo que é estendido de uma outra classe, é adicionar o "@Override", ele serve para validar que você esta fazendo uma sobreescrita em um metodo da classe pai, além de deixar visivel que oque você está fazendo.
    @Override
    public void acelerar() {
        for (int i = 0; i < 3; i++) {
            super.acelerar();
        }
    }

    public Ferrari() {
        this(380);
        setDelta(5);
    }


    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    public void ligarTurbo() {
        setDelta(35);
        this.ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        setDelta(5);
        this.ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        this.ligarAr = true;
    }

    @Override
    public void desligarAr() {
        this.ligarAr = false;
    }

    @Override
    public int getDelta() {
        if(ligarTurbo && !ligarAr){
            return 35;
        }else if(ligarTurbo && !ligarAr){
            return 25;
        }else if(!ligarTurbo && !ligarAr){
            return 15;
        }
        return 5;
    }
}
