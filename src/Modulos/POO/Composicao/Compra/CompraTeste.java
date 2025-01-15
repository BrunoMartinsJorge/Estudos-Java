package Modulos.POO.Composicao.Compra;

public class CompraTeste {

    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.nomeCliente = "Bruno";
        c1.adicionarItem(new Item("Papel", 100, 1.75));
        c1.adicionarItem(new Item("Cadernos", 15, 65.25));
        c1.adicionarItem(new Item("Livro", 1, 20.50));

        System.out.println("Valor total gasto: " + c1.valorTotal() + ".");
    }
}
