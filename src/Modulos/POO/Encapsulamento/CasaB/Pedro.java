package Modulos.POO.Encapsulamento.CasaB;

import Modulos.POO.Encapsulamento.CasaA.Ana;

public class Pedro extends Ana {
    Ana mae = new Ana();

    void testeAcessos() {
        //System.out.println(mae.segredo);
        //System.out.println(mae.facoDentroDeCasa);
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
    }
}
