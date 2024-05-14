package com.allogica.Iphone2007;

public class Main {
    public static void main(String[] args){
        Iphone2007 iphone2007 = new Iphone2007();
        iphone2007.aparelhoTelefonico.ligar("51999888111");
        iphone2007.aparelhoTelefonico.atender();
        iphone2007.aparelhoTelefonico.iniciarCorreioVoz();
        iphone2007.navegadorDeInternet.exibirPagina("globoesporte.globo.com");
        iphone2007.navegadorDeInternet.adicionarNovaAba();
        iphone2007.navegadorDeInternet.atualizarPagina();
        iphone2007.reprodutorMusical.selecionarMusica(22);
        iphone2007.reprodutorMusical.tocar();
        iphone2007.reprodutorMusical.pausar();
    }
}
