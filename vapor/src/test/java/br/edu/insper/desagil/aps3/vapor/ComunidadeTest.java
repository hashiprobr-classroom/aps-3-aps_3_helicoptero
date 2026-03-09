package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class ComunidadeTest {

    private Comunidade comunidade;
    private List<Usuario> membros;
    @BeforeEach
    void setUp(){
        membros = new ArrayList<>();
        comunidade = new Comunidade(membros);
    }


    @Test
    void constroi(){
        assertSame(membros.get(),comunidade.apelidosMembros());
    }


    @Test
    void adicionaUmMembro(){
        Usuario usuario3 = new Usuario("3","c");
        comunidade.adicionaMembro(usuario3);
        assertEquals(List.of("1","2","3"),comunidade.apelidosMembros());
    }





}
