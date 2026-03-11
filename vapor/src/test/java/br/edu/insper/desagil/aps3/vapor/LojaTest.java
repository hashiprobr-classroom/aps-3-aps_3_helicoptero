package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LojaTest {

    private Loja loja;
    private Usuario dono;
    private Usuario usuario1;
    private Jogo jogo1;
    private Jogo jogo2;
    private Jogo jogo3;

    @BeforeEach
    void setUp() {
        dono = new Usuario("teto","Cletiton");
        usuario1 = new Usuario("tue","Matheus");

        jogo1 = new Jogo(1, "Mario");
        jogo2 = new Jogo(2, "Doom");
        jogo3 = new Jogo(3, "Pac-Man");

        List<Jogo> jogos = new ArrayList<>();
        jogos.add(jogo1);
        jogos.add(jogo2);
        jogos.add(jogo3);

        loja = new Loja(jogos, dono);
    }

    @Test
    void constroi() {
        assertEquals(dono, loja.getUsuario());
        assertEquals(0, loja.numeroAvaliados(dono));
    }

    @Test
    void umUsuarioAvaliaUmJogo() {
        jogo1.avalia(dono.getApelido(),5);
        assertEquals(1, loja.numeroAvaliados(dono));
    }

    @Test
    void umUsuarioAvaliaDoisJogos() {
        jogo1.avalia(dono.getApelido(),3);
        jogo2.avalia(dono.getApelido(),4);
        assertEquals(2,loja.numeroAvaliados(dono));
    }

    @Test
    void doisUsuariosAvaliamUmJogo() {
        jogo1.avalia(dono.getApelido(),2);
        jogo1.avalia(usuario1.getApelido(),3);
        assertEquals(1,loja.numeroAvaliados(dono));
        assertEquals(1,loja.numeroAvaliados(usuario1));
    }

    @Test
    void doisUsuariosAvaliamDoisJogos() {
        jogo1.avalia(dono.getApelido(),5);
        jogo2.avalia(usuario1.getApelido(),4);
        assertEquals(1,loja.numeroAvaliados(dono));
        assertEquals(1,loja.numeroAvaliados(usuario1));
    }
}
