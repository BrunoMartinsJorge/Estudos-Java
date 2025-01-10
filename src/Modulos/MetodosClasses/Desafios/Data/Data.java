package Modulos.MetodosClasses.Desafios.Data;

import java.lang.reflect.Constructor;

public class Data {

    static int dia;
    int mes;
    int ano;

    Data(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data(int diaInicial, int mesInicial, int anoInicial){
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
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

    String converterData(int dia,int mes,int ano){
        return "A data é "+dia+"/"+mes+"/"+ano;
    }
}
