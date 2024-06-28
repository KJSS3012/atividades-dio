package Collections.Ordenação_Set.Convidados.Contatos;

import java.util.HashSet;
import java.util.Set;

public class Agenda {

    private Set<Contato> contatoSet;

    public Agenda() {
        contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> aux = new HashSet<>();

        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                aux.add(c);
            }
        }
        return aux;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato aux = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                aux = c;
                break;
            }
        }
        return aux;
    }

    public static void main(String[] args) {
        Agenda a = new Agenda();

        a.adicionarContato("JJ", 123123);
        a.adicionarContato("KK", 234234);
        a.adicionarContato("JJ", 5454545);
    }
}
