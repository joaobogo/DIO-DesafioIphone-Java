package iphone;

import aparelhoTelefonico.aparelhoTelefonico;
import navegadorInternet.navegadorInternet;
import reprodutorMusical.reprodutorMusical;

public class Iphone implements navegadorInternet, aparelhoTelefonico, reprodutorMusical {

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");

    }

    public void atualizarPagina() {
        System.out.println("Atualizando página!");

    }

    public void exibirPagina() {
        System.out.println("Exibir Pagina");

    }

    public void atender() {
        System.out.println("Atender ligação");

    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciar Correio de Voz");

    }

    public void ligar() {
        System.out.println("Fazendo ligação");

    }

    public void pausar() {
        System.out.println("Pausando Musica");

    }

    public void selecionarMusica() {
        System.out.println("Selecionar Musica");

    }

    public void tocar() {
        System.out.println("Tocar Música");
    }

}