package Collections.Ordenação_List.Carrinho_de_Compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itens = new ArrayList<>();

    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    private void adicionarItem(String nome, float preco, int quantidade) {
        itens.add(new Item(nome, quantidade, preco));
    }

    private void removerItem(String nome) {
        Item auxToRemove = null;

        for (Item i : itens) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                auxToRemove = i;
            }
        }
        itens.remove(auxToRemove);
    }

    private float calcularValorTotal() {

        float somaTotal = 0f;

        for (Item i : itens) {
            somaTotal += i.getPreco() * i.getQuantidade();
        }

        return somaTotal;
    }

    private void exibirItens() {
        System.out.println(itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras cc = new CarrinhoDeCompras();

        cc.adicionarItem("Arroz", 2.4f, 3);
        cc.adicionarItem("Macarrao", 3f, 5);
        cc.adicionarItem("Energetico Monster", 10f, 8);

        cc.exibirItens();

        System.out.println(cc.calcularValorTotal());

        cc.removerItem("Arroz");

        System.out.println(cc.calcularValorTotal());

        cc.removerItem("Macarrao");

        cc.exibirItens();

    }
}
