package com.allogica.Iphone2007.Funcionalidades;

public class ReprodutorMusical {
    private int idMusicaAtual;
    public void tocar() {
        System.out.println("Tocando música de ID = " + idMusicaAtual);
    }
    public void pausar() {
        System.out.println("Pausada música atual de ID = " + idMusicaAtual);
    }
    public void selecionarMusica(int musicaId) {
        idMusicaAtual = musicaId;
        System.out.println("Selecionada música de ID = " + musicaId);
    }
}
