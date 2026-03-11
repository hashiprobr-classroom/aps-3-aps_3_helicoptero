package br.edu.insper.desagil.aps3.vapor;

import java.util.ArrayList;
import java.util.List;

public class Comunidade {

    private List<Usuario> membros;

    public Comunidade(List<Usuario> membros) {
        this.membros = membros;
    }


    public void adicionaMembro (Usuario usuario) {
        membros.add(usuario);
    }

    public List<String> apelidosMembros() {

        List<String> listaApelidos = new ArrayList<>();
        for (Usuario usuario : membros){
            listaApelidos.add(usuario.getApelido());
        }

        return listaApelidos;
    }



}
