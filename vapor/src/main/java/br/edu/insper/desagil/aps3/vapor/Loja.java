package br.edu.insper.desagil.aps3.vapor;

import java.util.List;

public class Loja {

    private Usuario usuario;
    private List<Jogo> jogos;

    public Loja(List<Jogo> jogos, Usuario usuario) {
        this.jogos = jogos;
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Integer numeroAvaliados(Usuario usuario){
        int numero = 0;
        String apelido = usuario.getApelido();
        for (Jogo jogo : jogos){
            if (jogo.avaliado(apelido)){
                numero ++;
            }

        }
        return numero;
    }





}
