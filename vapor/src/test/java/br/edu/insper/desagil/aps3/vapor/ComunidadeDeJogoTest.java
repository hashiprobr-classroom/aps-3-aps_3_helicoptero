package br.edu.insper.desagil.aps3.vapor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;



public class ComunidadeDeJogoTest {

    private ComunidadeDeJogo comunidadeDeJogo;
    private Jogo jogo;
    private List<Usuario> membros;

    private Usuario usuario1;
    private Usuario usuario2;
    private Usuario usuario3;
    private Usuario usuario4;

    @BeforeEach
    void setup() {
        jogo = new Jogo(11, "Overwatch");
        membros = new ArrayList<>();
        comunidadeDeJogo = new ComunidadeDeJogo(membros, jogo);

        // Usuários que avaliaram o jogo
        usuario1 = new Usuario("tue", "Matheus");
        usuario2 = new Usuario("teto", "Cleriton");

        // Usuários que não avaliaram o jogo
        usuario3 = new Usuario("wiu", "Willian");
        usuario4 = new Usuario("brandão", "Bruno");

        jogo.avalia("tue", 4);
        jogo.avalia("teto", 5);

    }

    @Test
    void adicionaDoisInvalidos() {
        comunidadeDeJogo.adicionaMembro(usuario3);
        comunidadeDeJogo.adicionaMembro(usuario4);
        assertEquals(List.of(), comunidadeDeJogo.apelidosMembros());
    }

    @Test
    void adicionaUmInvalidoUmValido() {
        comunidadeDeJogo.adicionaMembro(usuario3);
        comunidadeDeJogo.adicionaMembro(usuario1);
        assertEquals(List.of(usuario1.getApelido()), comunidadeDeJogo.apelidosMembros());
    }

    @Test
    void adicionaDoisValidos() {
        comunidadeDeJogo.adicionaMembro(usuario1);
        comunidadeDeJogo.adicionaMembro(usuario2);
        assertEquals(List.of(usuario1.getApelido(), usuario2.getApelido()), comunidadeDeJogo.apelidosMembros());
    }
}
