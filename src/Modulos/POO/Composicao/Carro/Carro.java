package Modulos.POO.Composicao.Carro;

public class Carro {

    Motor motor = new Motor();

    void acelerar() {
        if (motor.ligado && motor.getFatorInjecao() < 5) {
            motor.setFatorInjecao(0.4);
        } else if (!motor.ligado) {
            System.out.println("Carro descligado!");
        } else {
            System.out.println("Não é possivel acelerar o carro!");
        }
    }

    void frear() {
        if (motor.getFatorInjecao() >= 0.4) {
            motor.setFatorInjecao(-0.4);
        } else {
            System.out.println("Carro parado");
        }
    }

    void ligar(){
        if(!motor.ligado){
            motor.ligado = true;
        }
    }

    void desligar(){
        if(motor.ligado){
            motor.ligado = false;
        }
    }

    boolean estaLigado(){
        return motor.ligado;
    }
}
