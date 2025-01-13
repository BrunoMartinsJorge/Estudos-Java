package Modulos.MetodosClasses.Desafios.Data;

public class DataTeste {

    public static void main(String[] args) {

        Data dataTeste2 = new Data();
        dataTeste2.dia = 21;
        dataTeste2.mes = 9;
        dataTeste2.ano = 2009;

        Data dataTeste1 = new Data(12,6,2006);

        System.out.println(dataTeste1.converterData(dataTeste1.dia, dataTeste1.mes, dataTeste1.ano));
        System.out.println(dataTeste2.converterData(dataTeste2.dia, dataTeste2.mes, dataTeste2.ano));
    }
}
