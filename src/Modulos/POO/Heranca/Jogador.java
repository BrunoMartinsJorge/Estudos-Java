package Modulos.POO.Heranca;

public class Jogador {

    // Com a tag protected, a vida fica visivel somente para aqueles que herdarem a classe Jogador, ou para aqueles que instanciarem uma variavel/elemento do tipo
    // Jogador ou alguma classe que estende essa outra classe!
    public int vida = 100;
    public int x;
    public int y;

    /*Jogador(){
        this(0,0);
    }*/

    protected Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;
        }
        return true;
    }

    public boolean atacar(Jogador adiversario) {
        int deltaX = Math.abs(x - adiversario.x);
        int deltaY = Math.abs(y - adiversario.y);
        if (deltaX == 0 && deltaY == 1) {
            adiversario.vida -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            adiversario.vida -= 10;
            return true;
        } else {
            return false;
        }
    }
}
