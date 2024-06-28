package Collections.Ordenação_Set.Convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerComConvite(int codigoConvite) {
        Convidado aux = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                aux = c;
                break;
            }
        }
        convidadoSet.remove(aux);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados cc = new ConjuntoConvidados();

        cc.adicionarConvidado("JJ", 123123123);
        cc.adicionarConvidado("JJ", 123123124);
        System.out.println(cc.contarConvidados());
        cc.adicionarConvidado("JJ", 123123123);
        System.out.println(cc.contarConvidados());

        cc.removerComConvite(123123123);

        cc.exibirConvidados();

        
    }

}
