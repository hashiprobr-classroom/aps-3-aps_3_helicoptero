package br.edu.insper.desagil.aps3.vapor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertSame;

public class ComunidadeTest {

    private Comunidade comunidade;
    private List<Usuario> membros;
    private Usuario usuario1;
    private Usuario usuario2;

    @BeforeEach
    void setUp() {
        membros = new ArrayList<>();
        comunidade = new Comunidade(membros);
        usuario1 = new Usuario("tue_33", "Matheus");
        usuario2 = new Usuario("dinho00", "Diogo");
    }


    @Test
    void constroi() {
        assertEquals(List.of(), comunidade.apelidosMembros());
    }

    @Test
    void adicionaUmMembro() {
        comunidade.adicionaMembro(usuario1);
        assertEquals(List.of(usuario1.getApelido()), comunidade.apelidosMembros());
    }

    @Test
    void adicionaDoisMembros() {
        comunidade.adicionaMembro(usuario1);
        comunidade.adicionaMembro(usuario2);
        assertEquals(List.of(usuario1.getApelido(), usuario2.getApelido()), comunidade.apelidosMembros());
    }
}
