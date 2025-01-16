package Modulos.POO.Heranca;

public class Heroi extends Jogador{

    public Heroi(int x, int y){
        super(x,y);
    }

    // Ao usar a tag "super" faz com que a classe "filha ou sub classe, tenha acesso aos parametros da classe "pai", super classe.
    // Facilitando já que não requer a repetição de código que ja foi escrito
    public boolean atacar(Jogador adiversario){
        boolean ataque1 = super.atacar(adiversario);
        boolean ataque2 = super.atacar(adiversario);
        boolean ataque3 = super.atacar(adiversario);
        return ataque1 || ataque2 || ataque3;
    }
}
