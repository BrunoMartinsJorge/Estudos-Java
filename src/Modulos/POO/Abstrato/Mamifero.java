package Modulos.POO.Abstrato;

public abstract class Mamifero extends Animal{
//Uma classe que herda uma abstrata tambem pode ser abstrata, caso ainda não tenha uma ideia de como colocar ou quais atributos devem ser adicionados a este metodo é uma opção.
    public abstract String mamar();

    public String respirar(){
        return "CO2";
    }
}
