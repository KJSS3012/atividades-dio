package Collections.Set.Produto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import Collections.Set.Produto.Produto.ComparatorPorPreco;

public class CadastroProduto {
    Set<Produto> produtoSet;

    public CadastroProduto(){
        produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, int codigo, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> auxProdutos = new TreeSet<>(produtoSet);
        return auxProdutos;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> auxProdutos = new TreeSet<>(new ComparatorPorPreco());
        auxProdutos.addAll(produtoSet);
        return auxProdutos;
    }

    public static void main(String[] args) {
        CadastroProduto cp = new CadastroProduto();

        cp.adicionarProduto("Arroz", 1, 1.20, 3);
        cp.adicionarProduto("Feijão", 3, 4, 5);
        cp.adicionarProduto("Macarrão", 2, 2.20, 5);

        System.out.println(cp.exibirProdutosPorNome());

        System.out.println(cp.exibirProdutosPorPreco());
    }
}
