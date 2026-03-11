package br.edu.insper.desagil.aps3.vapor;

import java.util.List;

public class Loja {

    private Usuario dono;
    private List<Jogo> jogos;

    public Loja(List<Jogo> jogos, Usuario dono) {
        this.jogos = jogos;
        this.dono = dono;
    }

    public Usuario getUsuario() {
        return dono;
    }

    public Integer numeroAvaliados(Usuario usuario) {
        int num_jogos = 0;
        String apelido = usuario.getApelido();
        for (Jogo jogo : jogos) {
            if (jogo.avaliado(apelido)) {
                num_jogos++;
            }
        }
        return num_jogos;
    }





}
