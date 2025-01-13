package Modulos.MetodosClasses.Desafios.Data;

import java.lang.reflect.Constructor;

public class Data {

    int dia; // Variavel de classe ou de instância: Variavel que fica visel para toda a classe e suas instâncias!
    int mes;
    int ano;

    Data() {
        /*
        dia = 1;
        mes = 1;
        ano = 1970;
         */
        this(12,6,2006);
        // Desse jeito você usa o this para usar em um construtor
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        // Oque é this? Esse é o metodo que pode ser ultilizado para acessar uma variavel de uma instancia, como no exemplo acima!
        // Esse método não pode ser ultilizado em métodos "statics" já que esses métodos referenciam á classe, e esse método atua na instância
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatatda(){
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
