package Collections.List.Livros;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

    private List<Livro> livroList = new ArrayList<>();

    public CatalagoLivros(){
        livroList = new ArrayList<>();
    }

    private void adicionarLivro(Livro livro){
        livroList.add(livro);
    }

    private List<Livro> pesquisarPorAutor(String autor){
        List<Livro> auxList = new ArrayList<>();

        for(Livro l : livroList){
            if (l.getAutor().equalsIgnoreCase(autor)) {
                auxList.add(l);
            }
        }
        return auxList;
    }

    private List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> auxList = new ArrayList<>();

        for(Livro l : livroList){
            if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal ) {
                auxList.add(l);
            }
        }
        return auxList;
    }

    private Livro pesquisarPorTitulo(String titulo){
        for(Livro l : livroList){
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CatalagoLivros cl = new CatalagoLivros();

        cl.adicionarLivro(new Livro("Clean Code", "Um cara ai", 2010));
        cl.adicionarLivro(new Livro("Um pato feio", "Um cara ai", 1990));
        cl.adicionarLivro(new Livro("Arroz Integral", "Um cara ai 2", 2000));

        System.out.println(cl.pesquisarPorAutor("Um cara ai"));

        System.out.println(cl.pesquisarPorTitulo("Clean Code"));

        System.out.println(cl.pesquisarPorIntervaloAnos(1990, 2009));
    }
}