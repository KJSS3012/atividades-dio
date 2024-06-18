package Model;

import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorNaInternet;
import Interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    @Override
    public void exibirPagina() {
        System.out.println("A página está sendo exibida");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Uma nova aba foi adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("A página foi atualizada");
    }

    @Override
    public void ligar() {
        System.out.println("O iphone está ligado");
    }

    @Override
    public void atender() {
        System.out.println("A chamada foi atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz foi iniciado");
    }

    @Override
    public void tocar() {
        System.out.println("A música está tocando");
    }

    @Override
    public void pausar() {
        System.out.println("A música foi pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecione a sua música");
    }
}