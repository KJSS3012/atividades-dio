package Collections.Map.Contatos;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
    private Map<String, Integer> contatoMap;

    public Agenda() {
        contatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero) {
        contatoMap.put(nome, numero);
    }

    public void removerContato(String nome) {
        if (!contatoMap.isEmpty()) {
            contatoMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(contatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer aux = null;
        if (!contatoMap.isEmpty()) {
            aux = contatoMap.get(nome);
        }
        return aux;
    }

    public static void main(String[] args) {
        Agenda a = new Agenda();

        a.adicionarContato("Kaique", 9940494);
        a.adicionarContato("Ciro", 012020202);
        a.adicionarContato("Mosiah", 7546282);

        a.exibirContato();

        a.removerContato("Kaique");

        a.exibirContato();

        System.out.println(a.pesquisarPorNome("Ciro"));
    }
}
