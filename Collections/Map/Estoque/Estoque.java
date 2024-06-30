package Collections.Map.Estoque;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<Long, Produto> estoqueMap;

    public Estoque() {
        estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        estoqueMap.put(codigo, new Produto(nome, quantidade, preco));
    }

    public void exibirProduto() {
        System.out.println(estoqueMap);
    }

    public double calcularValorTotalEstoque() {
        double valortotal = 0;
        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                valortotal += p.getPreco() * p.getQuantidade();
            }
        }
        return valortotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto auxProduto = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueMap.isEmpty()) {
            for (Produto p : estoqueMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    auxProduto = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return auxProduto;
    }

    public static void main(String[] args) {
        Estoque e = new Estoque();

        e.adicionarProduto(1, "Macarrao", 10, 2);
        e.adicionarProduto(2, "Arroz", 10, 1);

        System.out.println(e.calcularValorTotalEstoque());

        e.exibirProduto();

        System.out.println("Produto mais caro: " + e.obterProdutoMaisCaro());
    }

}
