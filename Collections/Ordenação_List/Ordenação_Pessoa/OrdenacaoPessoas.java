package Collections.Ordenação_List.Ordenação_Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Collections.Ordenação_List.Ordenação_Pessoa.Pessoa.ComparatorPorAltura;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoas = new ArrayList<>();

    public OrdenacaoPessoas()
    {
        pessoas = new ArrayList<>();
    }

    private void adicionarPessoa(Pessoa pessoa){
        this.pessoas.add(pessoa);
    }

    private List<Pessoa> ordenarPorIdade(){
        List<Pessoa> auxList = new ArrayList<>(pessoas);
        Collections.sort(auxList);
        return auxList;
    }

    private List<Pessoa> ordenarPorAltura(){
        List<Pessoa> auxList = new ArrayList<>(pessoas);
        Collections.sort(auxList, new ComparatorPorAltura());
        return auxList;
    }
    
    public static void main(String[] args) {
        OrdenacaoPessoas op = new OrdenacaoPessoas();
        op.adicionarPessoa(new Pessoa("Paulo", 18, 1.74));
        op.adicionarPessoa(new Pessoa("Maria", 22, 1.65));
        op.adicionarPessoa(new Pessoa("João", 20, 1.80));
        op.adicionarPessoa(new Pessoa("Ana", 25, 1.70));
        op.adicionarPessoa(new Pessoa("Carlos", 21, 1.75));

        System.out.println(op.ordenarPorIdade());
        System.out.println("");
        System.out.println(op.ordenarPorAltura());
    }
}
