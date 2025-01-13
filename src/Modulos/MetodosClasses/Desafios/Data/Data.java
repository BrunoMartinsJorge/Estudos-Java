package Modulos.MetodosClasses.Desafios.Data;

import java.lang.reflect.Constructor;

public class Data {

    int dia; // Variavel de classe ou de instância: Variavel que fica visel para toda a classe e suas instâncias!
    int mes;
    int ano;

    /*
    Variaveis definidas dentro da classe e fora de um metodo(sendo as variaveis de instâncias) elas possuem valores padrões como por exemplo:
    int, byte, short, long -> 0;
    flaot, double -> 0.0;
    boolean -> flase;
    char -> '\u0000';
    Já as variaveis que são feitas dentro de metodos, as ditas "variaveis locais", elas não possuem um valor inicial por padrão, como as acima que são as de classe
    E os Objetos possuem um valor nulo, já que os objetos não armazenam valores mas sim apontam para um local onde estão sendo armazenadas, e se não for passado nada ao criar uma, ela não aponta para nenhum local, ficanddo com o valor "null", um exemplo seria uma variavel tipo String, já que ela é um tipo de objeto: String nome;
    System.out.print(nome); =>  saida: "null"
    Assim da mesma forma, uma constate(final) tem que ser inicializada logo na sua criação, já que precisa ter um valor, no caso ela pode receber um valor durante o constructor
     */

    Data() {
        /*
        dia = 1;
        mes = 1;
        ano = 1970;
         */
        this(12, 6, 2006);
        // Desse jeito você usa o this para usar em um construtor
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        // Oque é this? Esse é o metodo que pode ser ultilizado para acessar uma variavel de uma instancia, como no exemplo acima!
        // Esse método não pode ser ultilizado em métodos "statics" já que esses métodos referenciam á classe, e esse método atua na instância
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatatda() {
        String formato = "%d/%d/%d"; // Variavel local: Uma variavel que está localizada dentro do método! Sendo somente visivel dentro do método
        return String.format(formato, dia, mes, ano);
    }

    //Abaixo um exemplo de sobrecarga:
    /*
    int nome(int a) {
        return 1;
    };

    int nome(int a, int b) {
        return 1;
    };
     */
    //A sobrecarga é quando você sobreescreve um metodo, no caso somente seus parametros, pois o nome e os parametros da função/metodo
    //são a assinatura/identificação do metodo/funcao

    String converterData(int dia, int mes, int ano) {
        return "A data é " + dia + "/" + mes + "/" + ano;
    }

}
